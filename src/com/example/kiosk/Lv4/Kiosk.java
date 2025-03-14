package com.example.kiosk.Lv4;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    // 속성
    private Scanner scanner = new Scanner(System.in);
    private int checkNumber;

    private List<Menu> menuList;


    // 생성자
    public Kiosk(List<Menu> menulist) {
        this.menuList = menulist;
    }


    //    기능
    // 키오스크 시작
    public void start() {
        do {
            System.out.println("-------------------------");
            System.out.println("1. 영화 예매 하기");
            System.out.println("2. 간식 구매 하기");
            System.out.println("0. 종료");
            System.out.println("원하시는 메뉴의 번호를 입력 후 Enter를 쳐주세요");
            checkNumber = scanner.nextInt();
            selectMenu();
        } while (checkNumber != 0);
    }
    // 카테고리 고르기
    public void selectMenu() {


        if (checkNumber == 1) {
            menuList.get(0).printMenu();
            buyTicket();
        } else if (checkNumber == 2) {
            menuList.get(1).printMenu();
            buySnack();
        } else if (checkNumber == 0) {
            System.out.println("작동을 종료합니다.");
        } else {
            System.out.println("잘못된 입력입니다.");
        }
    }
    // 티켓 사기
    public void buyTicket() {

        checkNumber = scanner.nextInt();
        scanner.nextLine();
        if (checkNumber == 1 || checkNumber == 2 || checkNumber == 3) {
            menuList.get(0).saveMenu(checkNumber);
            System.out.println("원하시는 메뉴의 번호를 입력 후 Enter를 쳐주세요");
            System.out.println("1. 티켓 : 12,000원");
            System.out.println("0. 뒤로가기");
            System.out.println("티켓 구매를 희망하신다면 1번을 입력하시고 뒤로가기를 원하시면 0번을 입력해주세요");
            checkNumber = scanner.nextInt();
            if (checkNumber == 1) {
                System.out.println("구매 희망 티켓 갯수를 입력 후 Enter를 쳐주세요");
                checkNumber = scanner.nextInt();
                System.out.println("총" + (checkNumber * 12000) + "원 입니다.");
            } else if (checkNumber == 0) {
                start();
            }
        }

    }
    // 간식 사기
    public void buySnack() {

        System.out.println("0. 뒤로가기");
        System.out.println("원하시는 메뉴의 번호를 입력 후 Enter를 쳐주세요");
        checkNumber = scanner.nextInt();
        scanner.nextLine();
        if (checkNumber == 1) {
            menuList.get(1).saveMenu(checkNumber);
            System.out.println("0. 뒤로가기");
            System.out.println("구매 희망 갯수를 입력 후 Enter를 쳐주세요 '0'을 입력하면 돌아갑니다");
            checkNumber = scanner.nextInt();
            System.out.println("총" + (checkNumber * 7000) + "원 입니다.");
        } else if (checkNumber == 0) {
            start();

        } else if (checkNumber == 2) {
            menuList.get(1).saveMenu(checkNumber);
            System.out.println("0. 뒤로가기");
            System.out.println("구매 희망 갯수를 입력 후 Enter를 쳐주세요 '0'을 입력하면 돌아갑니다");
            checkNumber = scanner.nextInt();
            System.out.println("총" + (checkNumber * 3000) + "원 입니다.");
        } else if (checkNumber == 0) {
            start();

        } else if (checkNumber == 3) {
            menuList.get(1).saveMenu(checkNumber);
            System.out.println("0. 뒤로가기");
            System.out.println("구매 희망 갯수를 입력 후  Enter를 쳐주세요 '0'을 입력하면 돌아갑니다");
            checkNumber = scanner.nextInt();
            System.out.println("총" + (checkNumber * 100000) + "원 입니다.");
        } else if (checkNumber == 0) {
            start();
        }

    }

}





