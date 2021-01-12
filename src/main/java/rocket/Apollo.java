package main.java.rocket;

public class Apollo extends Rocket {
    private static String status = "retired";
    private static int rocketHeight = 111;
    private static boolean reusable = false;

    public Apollo (String company, String rocketCondition) {
        super(company, rocketCondition);
    }
}
