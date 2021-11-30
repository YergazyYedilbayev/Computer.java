package com.company;

public class Main {

    public static void main(String[] args) {
        Computer comp1 = new Computer("Acer", 580);
        Computer comp2 = new Computer("HP", 680);

        System.out.println(comp1);
        System.out.println(comp2);

        comp1.On();
        comp2.Off();
        comp1.check();
        comp2.ShowMem();

        System.out.println(comp1.equals(comp2));
        System.out.println(comp1.hashCode());

    }
}