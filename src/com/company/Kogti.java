package com.company;

public class Kogti extends Main{
    private String name;

    public Kogti(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println(name + " bezhit");
    }

    public void rychat() {
        System.out.println(name + " rychit");
    }

    public void sleep() {
        System.out.println(name + " spit");
    }

    public void eat() {
        System.out.println(name + " dobivaet pishu");
    }
}

