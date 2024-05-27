package ex02;

public class App {
    public static void main(String[] args) {
        Animal mouse = new Mouse();
        Animal tiger = new Tiger();
        Animal dog = new Dog();
        DoormanProxy doorman = new DoormanProxy();
        doorman.쫓아내(mouse); // DoormanProxy 테스트 (상속 방식)
        DoormanProxy2 doorman2 = new DoormanProxy2(new Doorman());
        doorman2.쫓아내(dog); // DoormanProxy2 테스트 (생성자 방식)
    }
}
