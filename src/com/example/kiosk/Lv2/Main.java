package com.example.kiosk.Lv2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // list 선언 및 초기화
        List<MenuItem> menuItem = new ArrayList<MenuItem>();
    // add 함수를 통해 new movie에 List 삽입

        menuItem.add(new MenuItem("태극기휘날리며","전쟁","상영시간 2시간 14분",24));
        menuItem.add(new MenuItem("말할수 없는 비밀","로맨스","상영시간 1시간 58분",21));
        menuItem.add(new MenuItem("반딧불이의 묘","전쟁/애니메이션","상영시간 1시간 32분",30));

        Scanner scanner = new Scanner(System.in);
//메뉴부분 선택하기
        int checkNumber;
// whlie 문 들어가기와 나가기
        boolean exit = true;
// 키오스크가 시작 부분
        System.out.println("영화관에 오신걸 환영 합니다!");

        while (exit) {
//메뉴 고르기
            System.out.println("-------------------------");
            System.out.println("1.영화 예매 하기");
            System.out.println("원하시는 메뉴의 번호를 입력 후 Enter를 쳐주세요");
            checkNumber = scanner.nextInt();

//영화 고르기
            if (checkNumber == 1) {
                System.out.println("원하시는 영화의 번호를 입력 후 Enter를 쳐주세요");
                System.out.println("1. "+ menuItem.get(0).getMovieName() + " // " + menuItem.get(0).getType() + " // " + menuItem.get(0).getHowlong() + " // 남은좌석: " + menuItem.get(0).getSeat());
                System.out.println("2. "+ menuItem.get(1).getMovieName() + " // " + menuItem.get(1).getType() + " // " + menuItem.get(1).getHowlong() + " // 남은좌석: " + menuItem.get(1).getSeat());
                System.out.println("3. "+ menuItem.get(2).getMovieName() + " // " + menuItem.get(2).getType() + " // " + menuItem.get(2).getHowlong() + " // 남은좌석: " + menuItem.get(2).getSeat());
                System.out.println("0. 종료");
                checkNumber = scanner.nextInt();
                scanner.nextLine();
                if (checkNumber == 1 || checkNumber == 2 || checkNumber == 3) {
                    System.out.println("원하시는 메뉴의 번호를 입력 후 Enter를 쳐주세요");
                    System.out.println("1. 티켓 : 13,000원");
                    System.out.println("0. 종료");
                    System.out.println("티켓 구매를 희망하신다면 1번을 입력하시고 종료를 원하시면 0번을 입력해주세요");
                    checkNumber = scanner.nextInt();
// 티켓 매수 정하기
                    if (checkNumber == 1) {
                        System.out.println("구매 희망 티켓 갯수를 입력 후 Enter를 쳐주세요");
                        checkNumber = scanner.nextInt();
                        System.out.println("총" + (checkNumber * 13000) + "원 입니다.");
                        exit = false;
                    } else if (checkNumber == 0) {
                        exit = false;
                    }
// 종료 하기
                }else if (checkNumber == 0){
                    exit = false;
                }
            }
        }
    }


}

