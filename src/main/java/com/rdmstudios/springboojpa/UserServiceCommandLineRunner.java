package com.rdmstudios.springboojpa;

import com.rdmstudios.springboojpa.entity.User;
import com.rdmstudios.springboojpa.service.UserRepository;
import com.rdmstudios.springboojpa.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserServiceCommandLineRunner implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(UserServiceCommandLineRunner.class);

    @Autowired
    UserRepository userRepository;

    @Override
    public void run(String... args) {
        User user = new User("Bonzai");
        userRepository.save(user);
        logger.info("New user created " + user);

        List<User> users = userRepository.findAll();
        logger.info("All users: " + users);
    }
}
