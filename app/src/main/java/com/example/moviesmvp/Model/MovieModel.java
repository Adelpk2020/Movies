package com.example.moviesmvp.Model;

public class MovieModel {

    String name,date;
    double rate;

    public MovieModel(String name, String date, double rate) {
        this.name = name;
        this.date = date;
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}
