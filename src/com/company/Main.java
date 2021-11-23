//23. Создать объект класса Хищник, используя классы Когти, Зубы.
// Методы:рычать, бежать, спать, добывать пищу.
package com.company;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Kogti hishnik1 = new Kogti("Jaguar");
        Zuby hishnik2 = new Zuby("Lion");
        hishnik1.run();
        hishnik1.rychat();
        hishnik1.sleep();
        hishnik1.eat();
        hishnik2.rychat();
        hishnik2.sleep();
        hishnik2.eat();
    }
}



