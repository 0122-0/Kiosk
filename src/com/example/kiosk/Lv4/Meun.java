package com.example.kiosk.Lv4;

import java.util.ArrayList;
import java.util.List;

public class Meun {
    List<Movie> movie = new ArrayList<Movie>();
    List<Snack> snack = new ArrayList<Snack>();


    public Meun(){
        movie.add(new Movie("태극기휘날리며","전쟁","상영시간 2시간 14분",24));
        movie.add(new Movie("말할수 없는 비밀","로맨스","상영시간 1시간 58분",21));
        movie.add(new Movie("반딧불이의 묘","전쟁/애니메이션","상영시간 1시간 32분",30));
        snack.add(new Snack("팝콘",0.7,"짭쪼롬한 맛이 일품인 팝콘"));
        snack.add(new Snack("콜라",0.3,"막힌 속을 뻥 뚫어주는 콜라"));
        snack.add(new Snack("버터구이 오징어",1.0,"버터향이 일품이고 고소한 버터맛이나는 오징어 구이"));
    }

}
