// abstract class Vehicle{
//     String maker,model;
//     Vehicle(String maker, String model) {
//         this.maker = maker;
//         this.model = model;
//     }
//     abstract double calculateFare(double kms);
//     abstract void displayInfo();
// }
// class Car extends Vehicle{
//     Car(String maker, String model){
//         super(maker, model);
//     }
//     double calculateFare(double kms) {
//         return kms * 10;
//     }
//     void displayInfo() {
//         System.out.println("Car: " + maker + " " + model);
//     }
// }

// class Bike extends Vehicle {
//     Bike(String maker, String model) {
//         super(maker, model);
//     }

//     double calculateFare(double kms) {
//         return kms * 5;
//     }

//     void displayInfo() {
//         System.out.println("Bike: " + maker + " " + model);
//     }
// }


// public class PRACTICE{
//     public static void main(String[] args) {
//         Vehicle car = new Car("Toyota", "abcd");
//         Vehicle bike = new Bike("Yamaha", "abcdef");

//         car.displayInfo();
//         System.out.println("Fare: " + car.calculateFare(10));

//         bike.displayInfo();
//         System.out.println("Fare: " + bike.calculateFare(10));

//     }
// }
import java.util.Scanner;
class House{
    private String password;
    private boolean isOpen;

    public House(String password) {
        this.password = password;
        this.isOpen = false;
    }

    public String open(String inputPassword) {
        if (this.password.equals(inputPassword)) {
            this.isOpen = true;
            return "House is open";
        }
        return "Access denied";
    }
}


public class Passkey{
    public static void main(String[] args) {
        String pass = "secret123";
        House house = new House(pass);
        System.out.print("Enter password to open: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(house.open(input));
        sc.close();
    }
}