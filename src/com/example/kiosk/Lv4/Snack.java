package com.example.kiosk.Lv4;

public class Snack extends MenuItem {
    //속성
     String snackname;
     int howmuch ;
     String info ;

    //생성자
    public Snack(String snackname, int howmuch, String info) {
        this.snackname = snackname;
        this.howmuch = howmuch;
        this.info = info;
    }

    void snackName(String snackname) {
        this.snackname = snackname;
    }

    String getSnacknameName() {
        return this.snackname;
    }

    void setHowmuch(int howmuch) {
        this.howmuch = howmuch;
    }

    int getHowmuch(){
        return this.howmuch;
    }

    void setInfo(String info) {
        this.info = info;
    }

    String getInfo(){
        return this.info;
    }

}