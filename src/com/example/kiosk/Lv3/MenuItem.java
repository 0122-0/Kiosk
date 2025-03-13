package com.example.kiosk.Lv3;

public class MenuItem {
    //속성
   private String moviename;
   private String type;
   private String howlong;
   private int seat;

    //생성자
    public MenuItem(String moviename, String type, String howlong, int seat) {
        this.moviename = moviename;
        this.type = type;
        this.howlong = howlong;
        this.seat = seat;
    }

    //메서드
    //게터
    String getMovieName() {
        return this.moviename;
    }

    String getType(){
        return this.type;
    }
    String getHowlong(){
        return this.howlong;
    }
    int getSeat(){
        return this.seat;
    }
}