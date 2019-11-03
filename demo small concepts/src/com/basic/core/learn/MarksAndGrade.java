class MarksAndGrade{
    public static void main(String [] args){
        int marks = 69; 
        switch(marks/10){
            case 0:
            case 1:
            case 2:
            System.out.println("Fail");
            break;
            case 3:
            case 4:
            System.out.println("2 nd class");
            break;
            case 5:
            case 6:    
            System.out.println("1 st class");                    
            break;
            case 7:
            case 8:
            case 9:
            case 10:
            System.out.println("distncation");                        
            }
    }
}