package com.xworkz.springBackup;

import com.xworkz.springBackup.beans.*;
import com.xworkz.springBackup.configuration.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner
{
    public static void main( String[] args )
    {

        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);

        Geyser geyser = context.getBean(Geyser.class);
        geyser.setModelNo(346987213);
        geyser.setBrandName("LG");
        geyser.setPrice(8787);
        System.out.println(geyser.toString());
        System.out.println("=========================");

        ToothPaste paste = context.getBean(ToothPaste.class);
        paste.setProductNo(656);
        paste.setProductName("Dabar-Red");
        paste.setPrice(50);
        System.out.println(paste.toString());
        System.out.println("=========================");

        Yamaha yamaha= context.getBean(Yamaha.class);
        yamaha.setVersion(3);
        yamaha.setName("MT-15");
        yamaha.setPrice(175000);
        System.out.println(yamaha.toString());
        System.out.println("=========================");

        Phone phone= context.getBean(Phone.class);
        phone.setBrand("Apple");
        phone.setModel("15-Pro");
        phone.setPrice(100000);
        System.out.println(phone.toString());
        System.out.println("=========================");

        Milk milk= context.getBean(Milk.class);
        milk.setCompany("Aavin");
        milk.setQuantity(1);
        milk.setPrice(45);
        System.out.println(milk.toString());
        System.out.println("=========================");

        YouTube youTube= context.getBean(YouTube.class);
        youTube.setChannel("Sush & Yohan Music");
        youTube.setSubscriber(1300000);
        youTube.setOwner("Sush, yohan");
        System.out.println(youTube.toString());
        System.out.println("=========================");

        PG pg= context.getBean(PG.class);
        pg.setPgName("Golden Villa");
        pg.setRoomSharing(3);
        pg.setRent(5500);
        System.out.println(pg.toString());
        System.out.println("=========================");

        Shirt shirt = context.getBean(Shirt.class);
        shirt.setBrand("Zara");
        shirt.setSize('M');
        shirt.setFabric("Cotton");
        System.out.println(shirt.toString());
        System.out.println("=========================");

        Swiggy swiggy= context.getBean(Swiggy.class);
        swiggy.setProductName("shawarma");
        swiggy.setQuantity(3);
        swiggy.setHotelName("Rolls & Wheels");
        System.out.println(swiggy.toString());
        System.out.println("=========================");

        Movie movie = context.getBean(Movie.class);
        movie.setMovieName("Leo");
        movie.setDirector("Lokesh Kanagaraj");
        movie.setReleaseYear(2023);
        System.out.println(movie.toString());
        System.out.println("=========================");

        Train train = context.getBean(Train.class);
        train.setSource("KSR-Bangalore");
        train.setDestination("Dharmapuri");
        train.setFare(35);
        System.out.println(train.toString());
        System.out.println("=========================");

        BajajMotors bajajMotors = context.getBean(BajajMotors.class);
        bajajMotors.setName("pulsar");
        bajajMotors.setModel("RS-200");
        bajajMotors.setReleasedYear(2023);
        System.out.println(bajajMotors.toString());
        System.out.println("=========================");

        Laptop laptop = context.getBean(Laptop.class);
        laptop.getBrand();
        laptop.getModel();
        laptop.getPrice();
        System.out.println(laptop.toString());
        System.out.println("=========================");

        Flipkart flipkart = context.getBean(Flipkart.class);
        flipkart.getProductName();
        flipkart.getPrice();
        flipkart.getDeliveryAddress();
        System.out.println(flipkart.toString());
        System.out.println("=========================");

        TNPSCExam exam = context.getBean(TNPSCExam.class);
        exam.getAge();
        exam.getCandidteName();
        exam.getDistrict();
        System.out.println(exam.toString());
        System.out.println("=========================");

        Footwear footwear = context.getBean(Footwear.class);
        footwear.getCompany();
        footwear.getArtNo();
        footwear.getType();
        System.out.println(footwear.toString());
        System.out.println("=========================");

        Camera camera = context.getBean(Camera.class);
        camera.getCompany();
        camera.getModel();
        System.out.println(camera.toString());
        System.out.println("=========================");

        Jean jean = context.getBean(Jean.class);
        jean.getType();
        jean.getSize();
        jean.getFabric();
        System.out.println(jean.toString());
        System.out.println("=========================");

        Spec spec= context.getBean(Spec.class);
        spec.getType();
        spec.getShape();
        spec.getPrize();
        System.out.println(spec.toString());
        System.out.println("=========================");

        Blanket blanket= context.getBean(Blanket.class);
        blanket.getMaterial();
        blanket.getSize();
        blanket.getPattern();
        blanket.getPrice();
        System.out.println(blanket.toString());
        System.out.println("=========================");



    }
}
