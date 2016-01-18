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
public class PrivateMessage implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private long refUserOne;
    private long refUserTwo;
    private String text;

    public long getId() {
        return id;
    }

    public long getRefUserOne() {
        return refUserOne;
    }

    public long getRefUserTwo() {
        return refUserTwo;
    }

    public String getText() {
        return text;
    }

    private PrivateMessage()
    {}

    public PrivateMessage(Builder build) {
        this.id = build.id;
        this.refUserOne = build.refUserOne;
        this.refUserTwo = build.refUserTwo;
        this.text = build.text;
    }

    public static class Builder
    {
        private long id;
        private long refUserOne;
        private long refUserTwo;
        private String text;

        public Builder setId(long id) {
            this.id = id;
            return this;
        }

        public Builder setRefUserOne(long refUserOne) {
            this.refUserOne = refUserOne;
            return this;
        }

        public Builder setRefUserTwo(long refUserTwo) {
            this.refUserTwo = refUserTwo;
            return this;
        }

        public Builder setText(String text) {
            this.text = text;
            return this;
        }

        public PrivateMessage build()
        {
            return new PrivateMessage(this);
        }
    }

}
