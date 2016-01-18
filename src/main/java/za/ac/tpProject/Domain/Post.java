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
public class Post implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String title;
    private String text;
    private long refTopic;
    private long refUser;

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    public long getRefTopic() {
        return refTopic;
    }

    public long getRefUser() {
        return refUser;
    }

    private Post()
    {

    }

    public Post(Builder build) {
        this.id = build.id;
        this.title = build.title;
        this.text = build.text;
        this.refTopic = build.refTopic;
        this.refUser = build.refUser;
    }

    public static class Builder
    {
        private long id;
        private String title;
        private String text;
        private long refTopic;
        private long refUser;

        public Builder setId(long id) {
            this.id = id;
            return this;
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setText(String text) {
            this.text = text;
            return this;
        }

        public Builder setRefTopic(long refTopic) {
            this.refTopic = refTopic;
            return this;
        }

        public Builder setRefUser(long refUser) {
            this.refUser = refUser;
            return this;
        }

        public Post build()
        {
            return new Post(this);
        }

    }

}
