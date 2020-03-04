package com.tgb.demo.remote;

public class GreetingsServiceImpl implements GreetingsService {

    public String sayHi(String name) {
        System.out.println("default implementation");
        return "hi, " + name;
    }
}
