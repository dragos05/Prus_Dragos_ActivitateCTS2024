package main;

import Builder.Rezervare;
import Builder.RezervareBuilder;

public class Main {
    public static void main(String[] args) {
        RezervareBuilder rezervareBuilder=new RezervareBuilder();
        Rezervare rezervare=rezervareBuilder.adaugaMancare().build();

        //rezervare.setAreScaunErgonomic(true);
        Rezervare rezervare2=rezervareBuilder.adaugaMuzica().adaugaGenMuzical("rock").build();
        System.out.println(rezervare);
        System.out.println(rezervare2);

    }
}
