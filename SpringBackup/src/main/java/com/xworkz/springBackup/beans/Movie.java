package com.xworkz.springBackup.beans;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class Movie {

    public Movie(){
        System.out.println("No-Args Const of Movie");
    }

    private String director;
    private String movieName;
    private int releaseYear;
}
