package com.example.kiosk;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Kiosk {
    public static void main(String[] args) {
        int a ;
        Scanner scanner = new Scanner(System.in);
        Movie movie1 = new Movie("태극기휘날리며","전쟁","3월 7일~3월 28일","50좌석");
        Movie movie2 = new Movie("말할수 없는 비밀","로맨스","3월 8일~3월 29일","48좌석");
        System.out.println("영화관에 오신걸 환영 합니다!");
        System.out.println("원하시는 메뉴를 입력해주세요");
        System.out.println("-------------------------");
        System.out.println("1.영화 예매 하기");
        System.out.println("2.간식 고르기");
        a = scanner.nextInt();
        if(a == 1) {
            System.out.println("영화이름: " + movie1.movieName + " 장르: " + movie1.type + " 남은 좌석: " + movie1.howMany);
            System.out.println("영화이름: " + movie2.movieName + " 장르: " + movie2.type + " 남은 좌석: " + movie2.howMany);
        }
    }
}

