package za.ac.tpProject.services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import za.ac.tpProject.Domain.Level;
import za.ac.tpProject.repository.LevelRepository;
import za.ac.tpProject.services.LevelService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yusiry Davids on 11/22/2015.
 */
public class LevelServiceImpl implements LevelService {
    @Autowired
    LevelRepository repository;

    public List<Level> getLevels() {
        List<Level> allLevels = new ArrayList<Level>();

        Iterable<Level> levels = repository.findAll();
        for(Level level : levels){
            allLevels.add(level);
        }

        return allLevels;
    }
}
