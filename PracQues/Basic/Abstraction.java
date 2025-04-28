abstract class Shape{
    abstract int area(); 
    abstract int perimeter();
}

class Rectangle extends Shape{
    int length;
    int breath;
    public Rectangle(int length,int breath){
        this.length=length;
        this.breath=breath; 
    }
    int area(){
        return length*breath;
    }
    int perimeter(){
        return ((length+breath)*2) ;
    }
}
class Square extends Shape{
    int length;
    public Square(int length){
        this.length=length;
    }
    int area(){
       return length*length; 
    }
    int perimeter(){
        return length*4;
    }
} 
class Circle extends Shape{
    int radius;
    int pi=3;
    public Circle(int radius){
        this.radius=radius;
    }
    int area(){
        return pi*radius*radius;
    }
    int perimeter(){
        return 2*pi*radius;
    }
}
public class Abstraction {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 10);
        Shape square = new Square(4);
        Shape circle = new Circle(3);

        System.out.println("Rectangle Area: " + rectangle.area());
        System.out.println("Rectangle Perimeter: " + rectangle.perimeter());

        System.out.println("Square Area: " + square.area());
        System.out.println("Square Perimeter: " + square.perimeter());

        System.out.println("Circle Area: " + circle.area());
        System.out.println("Circle Perimeter: " + circle.perimeter());
    }
}
