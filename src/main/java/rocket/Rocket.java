package main.java.rockets;

public abstract class Rockets {
    private String company;
    private String status;

    public Rockets(String company, String status) {
        this.company = company;
        this.status = status;
    }
}
