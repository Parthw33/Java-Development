import java.util.Scanner;

public class switcase{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char ch = sc.next().charAt(0);
        switch(ch){
            case 'a','e','i','o','u':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");
        }
    }
}