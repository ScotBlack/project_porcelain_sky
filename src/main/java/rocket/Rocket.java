package main.java.rocket;

public abstract class Rocket {
    public static String status;
    private static int rocketHeight;
    private static boolean reusable;

    private String company;
    private String rocketCondition;

    public Rocket (String company, String rocketCondition) {
        this.company = company;
        this.rocketCondition = rocketCondition;
    }

    // getters
    public String getStatus() {return status;}
    public boolean getReusable() {return reusable;}
    public String getCompany() {return company;}
}



