package Test;

import javax.sound.midi.VoiceStatus;

//p304 문제 06번 개발자 홍인표

interface Human {
    void eat();

    default void print() {
        System.out.println("인간입니다.");
    }

    static void echo() {
        System.out.println("야호!!!");
    }
}

class Worker implements Human {
    @Override
    public void eat() {
        System.out.println("빵을 먹습니다.");
    }
}

class Student implements Human {
    int age;

    public Student(int age) {
        super();
        this.age = age;
    }

    @Override
    public void eat() {
        System.out.println("도시락을 먹습니다.");

    }

    @Override
    public void print() {
        System.out.println("세의 학생입니다.");
    }
}

public class HumanTest {
    public static void main(String[] args) {
        Human.echo();

        Student s = new Student(20);
        s.print();
        s.eat();

        Worker p = new Worker();
        p.print();
        p.eat();

    }
}
