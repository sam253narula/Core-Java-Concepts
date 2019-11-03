import java.util.Scanner;
public class AreaCalculator
{
    public static void main(String [] args){
    System.out.println("menu\n 1)Area of Rectangle \n 2)Area of Triangle \n 3)Area of Square \n");
    Scanner sc = new Scanner(System.in);
    int a =sc.nextInt();
    switch(a){
        case 1:
        int length,breath,Area;
        System.out.println("Enter length and breath");
        length = sc.nextInt();
        breath = sc.nextInt();
        Area = length*breath;
        System.out.println("Area "+ Area);
        break;
        
        case 2:
        double  base,height;
        System.out.println("Enter base and height");
        base = sc.nextInt();
        height = sc.nextInt();
        Area = (int)(0.5*base*height);
        System.out.println("Area: "+ Area);
        break;
       
        default:
        int side;
        System.out.println("Enter side");
        side = sc.nextInt();
        Area = side*side;
        System.out.println("Area "+ Area);
    }
        }
    }