package main.java.rocket;

public class Falcon9 extends Rocket{
    private static String status = "active";
    private static int rocketHeight = 18;
    private static boolean reusable = true;

    public Falcon9 (String company, String rocketCondition) {
        super(company, rocketCondition);
    }

    @Override
    public boolean getReusable() {
        return reusable;
    }
}

