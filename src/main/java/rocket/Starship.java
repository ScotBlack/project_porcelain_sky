package main.java.rocket;

public class Starship extends Rocket {
    private static String status = "in development";
    private static int rocketHeight = 50;
    private static boolean reusable = true;

    public Starship (String company, String rocketCondition) {
        super(company, rocketCondition);
    }

    @Override
    public boolean getReusable() {
        return reusable;
    }
}
