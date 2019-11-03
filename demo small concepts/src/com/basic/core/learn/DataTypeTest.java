class DataTypeTest{
    public static void main(String [] sam){
        char ch  = 'B';
        int asciiValue = ch;
        //System.out.println("The lower case charcter corresponding to")
       // System.out.print(asciiValue);
        char chLowerCase = (char)(asciiValue + 32);
        System.out.println("The lower case charcter corresponding to "+ch+ "is " +chLowerCase);
    }
}