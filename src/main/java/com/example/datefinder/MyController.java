package com.example.datefinder;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@RestController
public class MyController {
    @GetMapping("/")
    public String getDate(){
        LocalDate now = LocalDate.now();
        LocalDate date = now.plusDays(100);
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String str = date.format(df);
        return str;
    }
}
