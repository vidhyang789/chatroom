package com.example.chatroom.controller;


import com.example.chatroom.entity.message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class messagecontroller {


    @MessageMapping("/message")
    @SendTo("/topic/return-to")
    public message getmessage(@PathVariable message Message){

//        try{
//            Thread.sleep(2000);
//        }
//        catch(InterruptedException e){
//            e.printStackTrace();
//        }


        return Message;
    }

}
