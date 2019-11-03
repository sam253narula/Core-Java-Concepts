import java.util.Scanner;
class NewAmstrong{
    public static void main(String [] args){
        int counter = 0,temp,temptwo,lastNumberToTakeCube,c = 0,a = 1,numtwo;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        //temptwo variable is used in the final logic to verify whther the given number after the below multtiplication process is an amstronng number or not
        temptwo = num;
        //numtwo is used for the multiplicatiion process
        numtwo = num;
        //the below while loop is a digit counter of the input number
        while(num!=0){
            temp = num%10;
            counter++;
            //when we divide the number by 10 we eliminate the last digit of the number,so that we can perform logic of counting
            num=num/10;
        }
        //the below while loop is used for mutiplying the digits of the number with the value of counter and then adding all the digits togther.
        while(numtwo!=0){
            //when we take modulus%10 we get the last digit of a number
        lastNumberToTakeCube = numtwo%10;
        for(int i = 1;i <= counter;i++){
        a =  lastNumberToTakeCube*a;
      //  System.out.println("A: " +a);
        }
         c = c + a;
         //we need to initialize the value of a back to 1 so,that we can do proper multiplication in the above for look
         a = 1;
     //    System.out.println("C: " +c);    
        
        numtwo = numtwo/10;
        }
        if(temptwo == c){
        System.out.println("Amstrong Number");    
        }
        else{
            System.out.println("Not Amstrong Number");
        }
        
    }
    
}