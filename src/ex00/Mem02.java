package ex00;

/**
 * Override 오버라이드
 * 목표 : 다형성, 동적 바인딩
 * 1. 소나타(오브젝트 == 객체), 제네시스(오브젝트 == 객체) == 자동차(메서드 == 객체)
 */

abstract class Car { // new X
    abstract void run(); // 추상 메서드
}

class Sonata extends Car {
    @Override
        // 재정의
    void run() {
        System.out.println("소나타 달린다");
    } // sonata -> car

}

class Genesis extends Car {
    @Override
    void run() {
        System.out.println("제네시스 달린다");
    } // genesis -> car

}

public class Mem02 {

    public static void main(String[] args) {
        Car s = new Sonata(); // 메모리 sonata(run), car(run)
        // car 의 run 을 호출하러 갔더니, sonata(자식)의 run 을 재정의해서,
        // car 의 run 의 오버라이드(무효화)되고, sonata 의 run 이 호출된다.
        s.run();
        Car g = new Genesis(); // 메모리 genesis(run), car(run)
    }
}
