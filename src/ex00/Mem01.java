package ex00;

/**
 * 목포 : heap, stack, static 구분하기
 * 참고 동영상 : https://www.youtube.com/watch?v=QRj0WR5Uh2M
 * <p>
 * 규칙
 * 1. JVM 은 static 키워드가 붙은 친구들을 static 메모리에 로드한다.
 * 2. JVM 은 static 메모리에서 main 메서드를 찾아서 실행한다.
 * 3. JVM 의 생명주기는 main 메서드의 코드 줄 (Queue, FIFO)
 * 4. heap 동적 메모리 할당
 * 5. 메서드 실행 시에 stack 이 열린다.
 */

class Animal {
    String name = "강아지";

    void speak() { // speack 메서드 스택 생성 (지역 변수, 로컬 변수)
        String sound = "멍멍";
        System.out.println(sound);
    } // speak 메서드 stack 소멸
}

public class Mem01 {

    public static void main(String[] args) {
        Animal a = new Animal(); // 이러면 name 과 speak() 가 뜬다.
        a.speak();
        System.out.println(a.name);
    }
}
