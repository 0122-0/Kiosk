package com.example.kiosk.Lv1;

import com.example.kiosk.Movie;

import java.util.Scanner;

public class Kiosk {
    public static void main(String[] args) {
//입력하기 위한 Scanner
        Scanner scanner = new Scanner(System.in);
//메뉴부분 선택하기
        int a;
// whlie 문 들어가기와 나가기
        boolean exit = true;
// 영화 정보
        String movieName;
        String type;
        int seat;

// 키오스크가 시작 부분
        System.out.println("영화관에 오신걸 환영 합니다!");
        System.out.println("원하시는 메뉴의 번호를 입력해주세요");
        while (exit) {
//메뉴 고르기
            System.out.println("-------------------------");
            System.out.println("1.영화 예매 하기");
            a = scanner.nextInt();
//영화 고르기
            if (a == 1) {
                System.out.println("원하시는 메뉴의 번호를 입력해주세요");
                System.out.println("1. 태극기휘날리며 // 전쟁 // 상영시간 2시간 14분");
                System.out.println("2. 말할수 없는 비밀// 로맨스 // 상영시간 1시간 58분");
                System.out.println("3. 미니언즈3 // 애니메이션 // 상영시간 1시간 39분");
                System.out.println("0. 종료");
                a = scanner.nextInt();
                scanner.nextLine();
                if (a == 1 || a == 2 || a == 3) {
                    System.out.println("원하시는 메뉴의 번호를 입력해주세요");
                    System.out.println("1. 티켓 : 13,000원");
                    System.out.println("0. 종료");
                    System.out.println("티켓 구매를 희망하신다면 1번을 입력하시고 종료를 원하시면 0번을 입력해주세요");
                    a = scanner.nextInt();
// 티켓 매수 정하기
                    if (a == 1) {
                        System.out.println("구매 희망 티켓 갯수를 입력해주세요");
                        a = scanner.nextInt();
                        System.out.println("총" + (a * 13000) + "원 입니다.");
                        exit = false;
                    } else if (a == 0) {
                        exit = false;
                    }
// 종료 하기
                    if (a == 0) {
                        exit = false;
                    } else {

                    }
                }
            }
        }
    }
}

