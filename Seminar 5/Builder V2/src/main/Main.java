package main;

import clase.AbstractBuilder;
import clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        AbstractBuilder abstractBuilder=new Rezervare.BuilderRezervare();
        Rezervare rezervare1=abstractBuilder.adaugaBautura().adaugaGenMuzical("manele").build();
        Rezervare rezervare2=abstractBuilder.adaugaScaunErgonomic().adaugaGenMuzical("trap").build();
        System.out.println(rezervare1);
        System.out.println(rezervare2);

    }
}
