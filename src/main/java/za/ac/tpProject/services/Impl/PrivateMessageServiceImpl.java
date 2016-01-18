package za.ac.tpProject.services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import za.ac.tpProject.Domain.PrivateMessage;
import za.ac.tpProject.repository.PrivateMessageRepository;
import za.ac.tpProject.services.PrivateMessageService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yusiry Davids on 11/22/2015.
 */
public class PrivateMessageServiceImpl implements PrivateMessageService {
    @Autowired
    PrivateMessageRepository repository;

    public List<PrivateMessage> getPrivateMessages() {
        List<PrivateMessage> allPrivateMessages = new ArrayList<PrivateMessage>();

        Iterable<PrivateMessage> privateMessages = repository.findAll();

        for (PrivateMessage privateMessage : privateMessages){
            allPrivateMessages.add(privateMessage);
        }

        return allPrivateMessages;
    }
}
