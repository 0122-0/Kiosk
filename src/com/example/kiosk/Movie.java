package com.example.kiosk;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    //속성

     String movieName;
     String type;
     String howLong;
     String howMany;
     List<Movie> Movie = new ArrayList<>();

    //생성자
    Movie(String movieName, String type, String howLong, String howMany) {
        this.movieName = movieName;
        this.type = type;
        this.howLong = howLong;
        this.howMany = howMany;

    }

//    Newmovie(){
//
//    }
}



