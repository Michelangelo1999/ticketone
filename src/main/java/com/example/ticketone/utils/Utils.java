package com.example.ticketone.utils;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.format.DateTimeFormatter;

public class Utils {

    public static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd-MM-yyyy");
}
