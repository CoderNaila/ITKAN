package domain;

public class Rectangle {
    double length;
    double width;

    public double area(){
        return length * width;
    }
    public double perimeter(){
        return (length + width) *2;
    }

}
