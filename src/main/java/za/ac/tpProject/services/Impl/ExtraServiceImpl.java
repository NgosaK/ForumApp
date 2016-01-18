package za.ac.tpProject.services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import za.ac.tpProject.Domain.Extra;
import za.ac.tpProject.repository.ExtraRepository;
import za.ac.tpProject.services.ExtraService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yusiry Davids on 11/22/2015.
 */
public class ExtraServiceImpl implements ExtraService {
    @Autowired
    ExtraRepository repository;
    public List<Extra> getExtras() {
        List<Extra> allExtras = new ArrayList<>();

        Iterable<Extra> extras = repository.findAll();
        for(Extra extra : extras){
            allExtras.add(extra);
        }

        return allExtras;
    }
}
