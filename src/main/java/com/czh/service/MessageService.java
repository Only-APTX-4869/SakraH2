package com.czh.service;

import com.czh.entity.Message;
import com.czh.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MessageService {
    @Resource
    private MessageRepository messageRepository;

    public Message findMsg(String password) {
        return messageRepository.findMsg(password);
    }

    public Message save(Message m) {
        return messageRepository.save(m);
    }

}
