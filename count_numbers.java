import java.util.Scanner;

public class count_numbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int scount = 0;
        int n=sc.nextInt();
        while(n!=0){
            n=n/10;
            scount++;
        }

        System.out.println("The number of digits is : " + scount);
    }
}
