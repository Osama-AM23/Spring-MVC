package com.xworkz.springCountry.benas;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class PlayList {
    @Value("10001")
    private int id;
    @Value("Sad-playlist")
    private String type;
}
