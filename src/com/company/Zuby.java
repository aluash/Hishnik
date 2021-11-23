package com.company;

public class Zuby extends Main{
    private String name;
    public Zuby(String name) {
        this.name = name;
    }
    public void rychat() {
        System.out.println( name + " rychit");
    }
    public void sleep() {
        System.out.println(name + " spit");
    }
    public void eat() {
        System.out.println(name + " dobivaet pishu");
    }
}

