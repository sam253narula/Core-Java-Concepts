public class VowelOrNot
{
    public static void main(String [] args){
    char vowel = 'a';
    switch(vowel){
        // Cascading of cases
        case 'a':
        case'e':
        case'i':
        case'o':
        case'u':
        System.out.println("Vowel");
        break;
        default:
        System.out.println("Not vowel");
        }
        
        }
}