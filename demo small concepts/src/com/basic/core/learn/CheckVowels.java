import  java.util.Scanner;
public class CheckVowels{
    public static void main(String [] args){
        char alphabet = 'a';
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character to check wether it is vowel or not");
        
        if(alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet== 'u'){
          System.out.println("Vowel");  
        }
        else{
             System.out.println("Not Vowel");  
        }
    }
}