package com.example.chatroom.entity;

public class message {
    String name;
    String content;

    public message(String naem,String content){
        this.name = name;
        this.content = content;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getContent(){
        return content;
    }

    public void setContent(){
        this.content = content;
    }
}
