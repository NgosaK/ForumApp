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
public class Level implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private int points;
    private long refUserId;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    public long getRefUserId() {
        return refUserId;
    }

    private Level()
    {

    }

    public Level(Builder build) {
        this.id = build.id;
        this.name = build.name;
        this.points = build.points;
        this.refUserId = build.refUserId;
    }

    public static class Builder
    {
        private long id;
        private String name;
        private int points;
        private long refUserId;

        public Builder setId(long id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setPoints(int points) {
            this.points = points;
            return this;
        }

        public Builder setRefUserId(long refUserId) {
            this.refUserId = refUserId;
            return this;
        }

        public Level build()
        {
            return new Level(this);
        }
    }
}
