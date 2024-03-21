package main;

import companie.Manager;

public class main {
    public static void main(String[] args){
        Manager manager2=Manager.getInstance("asd", 2345544, 45);
        Manager manager1=Manager.getInstance();

        System.out.println(manager1);
        System.out.println(manager2);
    }
}
