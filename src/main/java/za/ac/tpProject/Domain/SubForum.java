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
public class SubForum implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private long refForum;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public long getRefForum() {
        return refForum;
    }

    private SubForum()
    {}

    public SubForum(Builder build) {
        this.id = build.id;
        this.name = build.name;
        this.refForum = build.refForum;
    }

    public static class Builder
    {
        private long id;
        private String name;
        private long refForum;

        public Builder setId(long id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setRefForum(long refForum) {
            this.refForum = refForum;
            return this;
        }

        public SubForum build()
        {
            return new SubForum(this);
        }
    }
}
