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
    //기능
   public void setMovieName(String moviename) {
        this.moviename = moviename;
    }

    public String getMovieName() {
        return this.moviename;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType(){
        return this.type;
    }

    public void setHowlong(String howlong) {
        this.howlong = howlong;
    }

    public String getHowlong(){
        return this.howlong;
    }
//구현 못함
//    void setSeat(int seat) {
//        this.seat = seat;
//    }
//
//    int getSeat(){
//        return this.seat;
//    }
}