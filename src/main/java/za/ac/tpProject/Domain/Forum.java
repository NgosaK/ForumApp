package za.ac.tpProject.Domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by User on 2015/10/16.
 */
@Entity
public class Forum implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    private Forum()
    {}

    public Forum(Builder build) {
        this.id = build.id;
        this.name = build.name;
    }

    public static class Builder
    {
        private long id;
        private String name;

        public Builder setId(long id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Forum build()
        {
            return new Forum(this);
        }
    }

}
