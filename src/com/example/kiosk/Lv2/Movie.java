package com.example.kiosk.Lv2;

public class Movie {
    //속성
    String moviename;
    String type;
    String howlong;
    int seat;

    //생성자
    public Movie(String moviename, String type, String howlong, int seat) {
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