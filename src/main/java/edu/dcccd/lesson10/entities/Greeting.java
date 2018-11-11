package edu.dcccd.lesson10.entities;

import edu.dcccd.lesson10.Lesson10Application;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.boot.SpringApplication;

@Data
@NoArgsConstructor
public class Greeting {

    @Getter
    public String Greeting;



    public static void main(String[] args) {

    }
}
