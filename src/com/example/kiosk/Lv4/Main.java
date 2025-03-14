package com.example.kiosk.Lv4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 리스트 만들기
        List<MenuItem> movie= new ArrayList<>();
        List<MenuItem> snack= new ArrayList<>();
        List<Menu> menuList = new ArrayList<>();

        // 카테고리 나누기
        menuList.add(new Menu(movie,"movie"));
        menuList.add(new Menu(snack,"snack"));

        // 리스트에 영화와 간식 넣어주기.
        movie.add(new Movie("태극기휘날리며","전쟁","상영시간 2시간 14분",24));
        movie.add(new Movie("말할수 없는 비밀","로맨스","상영시간 1시간 58분",21));
        movie.add(new Movie("반딧불이의 묘","전쟁/애니메이션","상영시간 1시간 32분",30));

        snack.add(new Snack("팝콘",7000,"짭조롬한 맛이 일품인 팝콘"));
        snack.add(new Snack("콜라",3000,"목막일때 뻥 뚫어줄 콜라"));
        snack.add(new Snack("버터구이 오징어",10000,"향긋한 버터향과 고소한 맛이 어울어지는 버터구이 오징어"));

        // 키오스크 시작

        Kiosk kiosk = new Kiosk(menuList);
        kiosk.start();




// 스타트에 대한 Kiosk의 함수

    }

}
