package ex05;

/**
 * 목적 : 문지기를 메모리에 하나만 올리고 싶다.
 */
public class Doorman {

    static Doorman instance = new Doorman(); // 변수는 static 에 저장, new 는 Heap 에 저장

    private Doorman() {
    }

    public void 쫒아내(Animal animal) {
        System.out.println(animal.getName() + " 쫒아내");
    }
}
