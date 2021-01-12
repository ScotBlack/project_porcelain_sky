package main.java.rocket;

public class Rocket {
    private static String status;
    private static int rocketHeight;
    private static boolean reusable;


    private String company;
    private String rocketCondition;

    public Rocket (String company, String rocketCondition) {
        this.company = company;
        this.rocketCondition = rocketCondition;
    }

    // getters
    public boolean getReusable() {
        return reusable;
    }
}

