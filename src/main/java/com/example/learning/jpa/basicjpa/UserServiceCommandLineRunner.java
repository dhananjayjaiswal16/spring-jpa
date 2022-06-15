package com.example.learning.jpa.basicjpa;

import com.example.learning.jpa.basicjpa.entity.User;
import com.example.learning.jpa.basicjpa.repository.UserRepository;
import com.example.learning.jpa.basicjpa.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class UserServiceCommandLineRunner implements CommandLineRunner{

    private static final Logger log =
            LoggerFactory.getLogger(UserServiceCommandLineRunner.class);

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... arg0) throws Exception {
        try{
            User user = new User("Jack", "Admin");
            //New User is created : User [id=1, name=Jack, role=Admin]
            userRepository.save(user);
            log.info("New User is created : " + user);
        } catch (Exception e){
            log.info("Exception is = " +e.getMessage());
        }
    }
}
