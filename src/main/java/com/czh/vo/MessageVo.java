package com.czh.vo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MessageVo {
    private Long id;
    private String Message;
    private String password;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private String credat;

    public MessageVo() {
    }

    public MessageVo(String password, String Message, String credat) {
        this.password = password;
        this.Message = Message;
        this.credat = credat;
    }

    public  String getCredat() {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
        return simpleDateFormat.format(date).toString();
    }

    public void setCredat(String credat) {
        this.credat = credat;
    }

    public String getMessage() {
        return this.Message;
    }

    public void setMessage(final String message) {
        this.Message = message;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(final String password) {
        this.password = password;
    }

}
