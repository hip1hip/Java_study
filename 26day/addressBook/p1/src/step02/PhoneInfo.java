package step02;

public class PhoneInfo {
    String name;
    String phoneNumber;
    String email;

    public PhoneInfo(String name, String phoneNumber) { // 생성자를 통해 필드값을 초기화
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public PhoneInfo(String name, String phoneNumber, String email) { /// 저장 , 생성자의 오버로딩 기능을 활용하여 다양한 입력방법을 생성
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public void showPhoneInfo() { // 읽기 , 입력된 값을 출력하도록 메서드 생성
        System.out.println("Name :" + name);
        System.out.println("PhoneNumber : " + phoneNumber);
        if (email != null)
            System.out.println("Email : " + email);
        System.out.println("-----------------------------------------");
    }
}
