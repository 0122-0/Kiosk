package com.example.kiosk.Lv4;

public class Snack extends MenuItem {
    //속성
   private   String snackname;
   private  int howmuch ;
   private String info ;

    //생성자
    public Snack(String snackname, int howmuch, String info) {
        this.snackname = snackname;
        this.howmuch = howmuch;
        this.info = info;
    }
    //기능
   public void snackName(String snackname) {
        this.snackname = snackname;
    }

   public String getSnacknameName() {
        return this.snackname;
    }

   public void setHowmuch(int howmuch) {
        this.howmuch = howmuch;
    }

   public int getHowmuch(){
        return this.howmuch;
    }

   public void setInfo(String info) {
        this.info = info;
    }

   public String getInfo(){
        return this.info;
    }

}