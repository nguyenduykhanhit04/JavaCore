import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Lion lion = new Lion("Simba");
        Cat cat = new Cat("Tom");
        Dog dog = new Dog("Spike");

        int choice;
        do {
            System.out.println("===== MENU =====");
            System.out.println("1. Test Lion");
            System.out.println("2. Test Cat");
            System.out.println("3. Test Dog");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            
            switch(choice) {
                case 1:
                    lion.eat();
                    lion.run();
                    lion.run(60);
                    break;
                case 2:
                    cat.eat();
                    System.out.println("Cat max age is: " + Cat.maxAge);
                    break;
                case 3:
                    dog.eat();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 0);
    }
}
