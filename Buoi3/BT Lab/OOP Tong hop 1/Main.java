public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird("Chim Cuc Cu ", 2);
        bird.eat();
        bird.go();

        Lion lion = new Lion("Su tu ", "Male");
        lion.eat();
        lion.go();

        Person person = new Person("Tony ", 25, "Hanoi");
        person.eat();
        person.go();
        System.out.println(); // newline since go() used printf
        person.work();
        person.work(8);
    }
}
