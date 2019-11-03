import java.util.Scanner;
class EmpSal{
    public static void main(String [] args){
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter salary");
        a =sc.nextInt();
        double bonus = a< 5000?a*0.3:a*0.4;
        Double grossSalary = a+ bonus;
        System.out.println("salary :"+ a + "bonus "+bonus+"Gross Salary" + grossSalary);
        
        }
}