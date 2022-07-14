package com.czh;

import com.czh.entity.Message;
import com.czh.repository.MessageRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class JpaApplication {
    @Bean
    InitializingBean saveData(MessageRepository repo) {
        return () -> {
            repo.save(new Message((long) 1, "曹植", "洛神赋", Message.getCredat()));
            repo.save(new Message((long) 1, "曹植", "洛神赋", Message.getCredat()));
            repo.save(new Message((long) 1, "曹植", "洛神赋", Message.getCredat()));
        };
    }


    public static void main(String[] args) {
        SpringApplication.run(JpaApplication.class, args);

    }

}
