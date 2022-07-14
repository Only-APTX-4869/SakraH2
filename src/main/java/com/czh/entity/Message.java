package com.czh.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

@Table(name = "message")
@Entity //注解声明这是映射数据库的实体类
@Data
public class Message {

    @Id //注解声明这个属性映射数据库的主键
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 默认使用主键生成的方式自增
    @Column
    private Long id;

    @Column
    private String password;
    @Column
    private String Message;

    @Column(name = "create_at", insertable = false, updatable = false)
    private LocalDateTime createAt;

    @PrePersist
    protected void onCreate() {
        this.createAt = LocalDateTime.now(); // 使用 Java 8+ 的 LocalDateTime
    }
}
