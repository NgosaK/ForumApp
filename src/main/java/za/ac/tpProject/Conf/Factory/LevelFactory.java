package za.ac.tpProject.Conf.Factory;

import za.ac.tpProject.Domain.Level;

import java.util.Map;

/**
 * Created by User on 2015/10/20.
 */
public class LevelFactory {

    public static Level createExtra(
            Map<String,String> values, int points, long id, long refId) {
        Level level = new Level
                .Builder()
                .setId(id)
                .setRefUserId(refId)
                .setName(values.get("name"))
                .setPoints(points)
                .build();

        return level;

    }
}
