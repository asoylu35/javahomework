package org.example;

public class ConsoleLogger extends BaseLogger{
    public void Log(String message){
        System.out.println("Logged to console :"+message);
    }
}
