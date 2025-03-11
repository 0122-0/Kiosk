package com.example.kiosk.Lv4;

public class Snack {
    //속성
     String snackname;
     double howmuch ;
     String info ;



    //생성자
    public Snack(String snackname, double howmuch, String info) {
        this.snackname = snackname;
        this.howmuch = howmuch;
        this.info = info;
    }

    //메서드
    //게터
    String getSnacknameName() {
        return this.snackname;
    }

    double getHowmuch(){
        return this.howmuch;
    }

    String getInfo(){
        return this.info;
    }




}