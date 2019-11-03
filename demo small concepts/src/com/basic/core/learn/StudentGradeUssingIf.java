import java.util.Scanner;
public class StudentGradeUssingIf{
    public static void main(String [] if_only){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks of Student");
        int marks = sc.nextInt();
        if(marks<0 || marks>100){
        System.out.println("invalid");}
        if(marks >= 0&&marks<= 39 ){
        System.out.println("fail");
            }
        if(marks>=40 && marks <= 59){
        System.out.println("2nd class");
            }
        if(marks>=60 && marks<=74){
        System.out.println("1nd class");
            }
        if(marks>=75 && marks<=100){
        System.out.println("Distinction");
            }
        
    }
}