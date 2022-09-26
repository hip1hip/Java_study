package Test;

//p345 문제 02 개발자 홍인표

class Student {
    String name;

    public Student(String name) {
        this.name = name;

    }

    @Override
    public String toString() {
        return "학생[" + name + "]";
    }

}

public class StudentTest {
    public static void main(String[] args) {
        System.out.println(new Student("김삿갓"));
        System.out.println(new Student("홍인표"));

    }
}
