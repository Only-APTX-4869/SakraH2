package com.czh.controller;

import com.czh.entity.Message;
import com.czh.service.MessageService;
import com.czh.vo.MessageVo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.BeanUtils;

import javax.annotation.Resource;

/**
 * 樱花岛留言板接口
 */
@RestController
@RequestMapping("/sakura")
public class MessageController extends Exception {

    @Resource
    private MessageService messageService;

    @PostMapping("/addMsg")
    public MessageVo save(@RequestBody MessageVo messageVo) {
        Message message = new Message();
        BeanUtils.copyProperties(messageVo, message); // 同名属性自动拷贝
        messageService.save(message);
        return messageVo;
    }

    @GetMapping("/findMsg")
    public Message getMsg(@RequestBody MessageVo messageVo){
            return messageService.findMsg(messageVo.getPassword());
    }

}
