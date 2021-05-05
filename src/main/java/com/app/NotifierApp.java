package com.app;

import com.app.services.FillerService;
import com.app.services.NoteService;
import com.app.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NotifierApp {
    public static void main(String[] args){
        SpringApplication.run(NotifierApp.class, args);
    }
}
