package com.example.cajeroautomaticonew;

import java.util.ArrayList;
import java.util.List;

public class Log {

    List<String> logData;

    private static Log instance;

    private Log(){
        logData = new ArrayList<>();
    }

    public static Log getInstance(){
        if(instance == null){
            instance = new Log();
        }
        return instance;
    }

    public void add(String stringLog){
        this.logData.add(stringLog);
    }

    public void printLogs(){
        logData.forEach(e -> System.out.println(e.toString()));
    }
}
