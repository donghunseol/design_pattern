package ex01;

public class App {
    public static void main(String[] args) {
        Animal mouse = new Mouse();
        Animal tiger = new Tiger();
        Animal dog = new Dog();
        Doorman doorman = new Doorman();
        doorman.쫒아내(mouse);
    }
}
