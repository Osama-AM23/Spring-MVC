package com.xworkz.springCountry.runner;

import com.xworkz.springCountry.benas.*;
import com.xworkz.springCountry.configuration.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);

        Country country = context.getBean(Country.class);
        System.out.println(country.toString());
        System.out.println("==========================");

        Patient patient = context.getBean(Patient.class);
        System.out.println(patient.toString());
        System.out.println("==========================");

        Library library = context.getBean(Library.class);
        System.out.println(library.toString());
        System.out.println("==========================");

        Husband husband = context.getBean(Husband.class);
        System.out.println(husband.toString());
        System.out.println("==========================");

        Mobile mobile = context.getBean(Mobile.class);
        System.out.println(mobile.toString());
        System.out.println("==========================");

        Tv tv = context.getBean(Tv.class);
        System.out.println(tv.toString());
        System.out.println("==========================");

        Laptop laptop = context.getBean(Laptop.class);
        System.out.println(laptop.toString());
        System.out.println("==========================");

        House house = context.getBean(House.class);
        System.out.println(house.toString());
        System.out.println("==========================");

        Dish dish= context.getBean(Dish.class);
        System.out.println(dish.toString());
        System.out.println("==========================");

        Theatre theatre = context.getBean(Theatre.class);
        System.out.println(theatre.toString());
        System.out.println("==========================");

        PlayStation playStation= context.getBean(PlayStation.class);
        System.out.println(playStation.toString());
        System.out.println("==========================");

        Door door = context.getBean(Door.class);
        System.out.println(door.toString());
        System.out.println("==========================");


        Subject subject = context.getBean(Subject.class);
        System.out.println(subject.toString());
        System.out.println("==========================");

        Song song = context.getBean(Song.class);
        System.out.println(song.toString());
        System.out.println("==========================");

        Ups ups = context.getBean(Ups.class);
        System.out.println(ups.toString());
        System.out.println("==========================");

        Lens lens = context.getBean(Lens.class);
        System.out.println(lens.toString());
        System.out.println("==========================");

        XeroxShop xeroxShop= context.getBean(XeroxShop.class);
        System.out.println(xeroxShop);
        System.out.println("==========================");

        Store store = context.getBean(Store.class);
        System.out.println(store);
        System.out.println("==========================");

        Hospital hospital= context.getBean(Hospital.class);
        System.out.println(hospital);
        System.out.println("==========================");

        Music music = context.getBean(Music.class);
        System.out.println(music);
        System.out.println("==========================");


    }
}
