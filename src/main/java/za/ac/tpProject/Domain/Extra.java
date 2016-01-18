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
public class Extra implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private long refUserId;
    private String status;
    private String mood;
    private String signature;

    public long getId() {
        return id;
    }

    public long getRefUserId() {
        return refUserId;
    }

    public String getStatus() {
        return status;
    }

    public String getMood() {
        return mood;
    }

    public String getSignature() {
        return signature;
    }

    private Extra()
    {}

    public Extra(Builder build) {
        this.id = build.id;
        this.refUserId = build.refUserId;
        this.status = build.status;
        this.mood = build.mood;
        this.signature = build.signature;
    }



    public static class Builder
    {
        private long id;
        private long refUserId;
        private String status;
        private String mood;
        private String signature;

        public Builder setStatus(String status) {
            this.status = status;
            return  this;
        }

        public Builder setMood(String mood) {
            this.mood = mood;
            return this;
        }

        public Builder setSignature(String signature) {
            this.signature = signature;
            return  this;
        }

        public Builder setRefUserId(long refUserId) {
            this.refUserId = refUserId;
            return  this;
        }

        public Builder setId(long id) {
            this.id = id;
            return  this;
        }

        public Extra build()
        {
            return new Extra(this);

        }
    }





}
