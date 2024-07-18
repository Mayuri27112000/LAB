import java.util.Scanner;

interface shape1 
{
    void circle();
}


interface shape2 extends shape1 
{
    void rectangle();
}


public class Area implements shape2
{

	public void circle() 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double radius = scanner.nextDouble();
        double circleArea = Math.PI * radius * radius;
        System.out.println("Area of circle is: " + circleArea);
    }
    
    
    public void rectangle() 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length: ");
        double length = scanner.nextDouble();
        System.out.print("Enter width: ");
        double width = scanner.nextDouble();
        double rectangleArea = length * width;
        System.out.println("Area of rectangle is: " + rectangleArea);
    }
    
    
    public static void main(String[] args) 
    {
        Area a = new Area();
        a.circle();
        a.rectangle();
    }
}
