package step03;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MyPhoneBook {
    static Scanner sc = new Scanner(System.in);
    static Map<String, PhoneInfo> map = new HashMap<>(); // 전화번호를 저장하는 객체를 저장하는 헤쉬맵 변수 선언

    public static void showMenu() {// 메인 메뉴 구성
        System.out.println("[ 메뉴 선택 ]");
        System.out.println("1. 전화번호 입력");
        System.out.println("2. 전화번호 조회");
        System.out.println("3. 전화번호 삭제");
        System.out.println("4. 종료");
        System.out.print("선택 :");

    }

    public static void addNumber() {
        System.out.println("이름 : ");
        String name = sc.nextLine();
        System.out.println("전화번호 : ");
        String phoneNumber = sc.nextLine();
        System.out.println("이메일 : ");
        String email = sc.nextLine();

        PhoneInfo pInfo; // 이메일 입력 여부에 따라 다른 생성자를 사용해 PhoneInfo 객체를 생성
        if (email != null) {
            pInfo = new PhoneInfo(name, phoneNumber, email);

        } else {
            pInfo = new PhoneInfo(name, phoneNumber);
        }
        pInfo.showPhoneInfo(); // 입력된 정보를 확인하기 위해 다시 출력
        map.put(name, pInfo); // HashMap에 생성된 PhoneInfo 객체를 추가 , 키값은 name을 다시 사용
        System.out.println("맵의 크기 : " + map.size()); // 확인을 위해 HashMap에 저장된 숫자를 출력
    }

    public static void selNumber() {
        System.out.println("이름 : ");
        String name = sc.nextLine();
        System.out.println("전화번호 : ");
        String phoneNumber = sc.nextLine();
        System.out.println("이메일 : ");
        String email = sc.nextLine();

        PhoneInfo pInfo; // 이메일 입력 여부에 따라 다른 생성자를 사용해 PhoneInfo 객체를 생성
        if (email != null) {
            pInfo = new PhoneInfo(name, phoneNumber, email);

        } else {
            pInfo = new PhoneInfo(name, phoneNumber);
        }
        pInfo.showPhoneInfo(); // 입력된 정보를 확인하기 위해 다시 출력
        map.put(name, pInfo); // HashMap에 생성된 PhoneInfo 객체를 추가 , 키값은 name을 다시 사용
        System.out.println("맵의 크기 : " + map.size()); // 확인을 위해 HashMap에 저장된 숫자를 출력
    }

    public static void delNumber() {

    }

    public static void main(String[] args) {
        int choice;
        while (true) {
            showMenu();
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    addNumber();
                    break;
                case 2:
                    selNumber();
                    break;
                case 3:
                    delNumber();
                    break;
                case 4:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘 못 입력하셨습니다.");
                    break;
            }
        }
    }
}
