package com.snowfly.lock.demo.controller;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Client {

    public static void main(String[] args) {
        System.out.println(LocalDateTime.now().truncatedTo(ChronoUnit.SECONDS));
    }
}
