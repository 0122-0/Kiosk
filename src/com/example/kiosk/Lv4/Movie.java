package com.example.kiosk.Lv4;

import java.awt.Menu;

public class Movie extends MenuItem {
    //속성

   private String moviename;
   private String type;
   private String howlong;
   private int seat;

    //생성자
    public Movie(String moviename, String type, String howlong, int seat) {
        this.moviename = moviename;
        this.type = type;
        this.howlong = howlong;
        this.seat = seat;
    }

    void setMovieName(String moviename) {
        this.moviename = moviename;
    }

    String getMovieName() {
        return this.moviename;
    }

    void setType(String type) {
        this.type = type;
    }

    String getType(){
        return this.type;
    }

    void setHowlong(String howlong) {
        this.howlong = howlong;
    }

    String getHowlong(){
        return this.howlong;
    }

    void setSeat(int seat) {
        this.seat = seat;
    }

    int getSeat(){
        return this.seat;
    }
}