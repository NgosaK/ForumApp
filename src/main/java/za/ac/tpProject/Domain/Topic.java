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
public class Topic implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private long refSubForum;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public long getRefSubForum() {
        return refSubForum;
    }

    private Topic()
    {

    }

    public Topic(Builder build) {
        this.id = build.id;
        this.name = build.name;
        this.refSubForum = build.refSubForum;
    }

    public static class Builder
    {
        private long id;
        private String name;
        private long refSubForum;

        public Builder setId(long id) {
            this.id = id;
            return this;
        }

        public Builder setRefSubForum(long refSubForum) {
            this.refSubForum = refSubForum;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Topic build()
        {
            return new Topic(this);
        }
    }
}
