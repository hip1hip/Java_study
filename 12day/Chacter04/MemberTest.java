//164p 문제03 개발자 홍인표

//이름 , 아디 , 암호 , 나이 

class Member {
    private String name, id, passwd;
    private int age;

    public Member(String name, String id, String passwd, int age) {
        this.name = name;
        this.id = id;
        this.passwd = passwd;
        this.age = age;
    }

    // 접근자 생성
    public String getName() {
        return name;
    }

    // 설정자 생성
    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}

public class MemberTest {

    public static void main(String[] args) {
        Member user = new Member("홍인표", "hip", "1234", 28);
        System.out.println("이름 :" + user.getName());
        System.out.println("아이디 : " + user.getId());
        System.out.println("암호 : " + user.getPasswd());
        System.out.println("나이 : " + user.getAge());
    }

}
