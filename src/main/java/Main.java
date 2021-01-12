package main.java;

import main.java.rocket.Apollo;
import main.java.rocket.Starship;

public class Main {
    public static void main(String [] args) {
        Starship SN_8 = new Starship("SpaceX", "destroyed");
        Starship SN_9 = new Starship ("SpaceX", "testing");
        Apollo Apollo_13 = new Apollo ("Nasa", "retired");

        System.out.println(SN_9.getReusable());
        System.out.println(Apollo_13.getReusable());
    }
}
