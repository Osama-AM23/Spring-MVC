package com.xworkz.springCountry.benas;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class Song {
    @Value("4312")
    private int songId;
    @Value("Theansudare")
    private String songName;
    @Autowired
    private PlayList playList;
}
