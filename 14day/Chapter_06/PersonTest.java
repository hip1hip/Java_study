//p260 문제 02번 개발자 홍인표

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 접근자
    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    // 설정자
    void setName(String name) {
        this.name = name;
    }

    void setAge(int age) {
        this.age = age;
    }

    public String show() {
        return "사람 [이름 : " + name + ", 나이 : " + age + "]";
    }

}

class Student extends Person {
    int class_num;

    public Student(String name, int age, int class_num) {
        super(name, age);
        this.class_num = class_num;
    }

    // 접근자
    int getClass_num() {
        return class_num;
    }

    // 설정자
    void setClass_num(int class_num) {
        this.class_num = class_num;
    }

    public String show() {
        return "학생 [이름 : " + name + ", 나이 : " + age + ", 학번 : " + class_num + "]";
    }

}

class ForeignStudent extends Student {
    String nationality;

    public ForeignStudent(String name, int age, int class_num, String nationality) {
        super(name, age, class_num);
        this.nationality = nationality;
    }

    // 접근자
    String getNationality() {
        return nationality;
    }

    // 설정자
    void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String show() {
        return "외국 학생 [이름 : " + name + ", 나이 : " + age + ", 학번 : " + class_num + ", 국적 : " + nationality + "]";
    }

}

public class PersonTest {
    public static void main(String[] args) {
        Person[] person = { new Person("길동이", 22), new Student("황진이", 23, 100),
                new ForeignStudent("Amy", 30, 200, "USA") };

        for (Person p : person)
            System.out.println(p.show());

    }

}