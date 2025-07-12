package JavaCollections;
import java.util.Stack;

public class Stackprac {
    public static void main(String[] args) {
        Stack<String> animal = new Stack<>();
        animal.push("Lion");
        animal.push("tiger");
        animal.push("mamath");
        animal.push("duck");
        System.out.println(animal.peek());
        // animal.pop();
        // System.out.println(animal.peek());
        System.out.println(animal);
    }
}
