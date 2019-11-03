import java.util.Scanner;
public class StudentGradeUssingelseif{
    public static void main(String [] if_only){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks of Student");
        int marks = sc.nextInt();
        if(marks<0){
            System.out.println("invalid");
        }
        else if(marks<=39){
        System.out.println("fail");
        }
        else if(marks<= 59){
            System.out.println("2nd class");  
        }
        else if(marks<=74){
            System.out.println("1nd class");  
        }
        else if(marks<=100){
            System.out.println("Distinction");
        } 
        else {
           System.out.println("invalid");
        } 
    
        
    }}