 
 public class ReverseCase{
     public static void main(String [] args){
         char value = 'b';
         //char test = (char)(value+32);
         //System.out.println("upperCase value is: "+ test);
         if(value>= 65 && value <= 90){
             value = (char)(value+32);
             System.out.println("upperCase value is: "+ value);
         }
         else if(value>= 97 && value <= 122){
             value = (char)(value-32);
             System.out.println("upperCase value is: "+ value);
         }
     }
 }