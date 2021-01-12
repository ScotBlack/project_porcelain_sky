package main.java.rocket;

public class Starship extends Rocket {
    private static String status;
    private static int rocketHeight;
    private boolean reusable = true;

    public Starship (String company, String rocketCondition) {
        super(company, rocketCondition);
        this.status = "in development";
        this.rocketHeight = 50;
        this.reusable = true;
    }

//    public String getStatus() {
//        return status;
//    }
//    public boolean getReusable() {
//        return this.reusable;
//    }


}
