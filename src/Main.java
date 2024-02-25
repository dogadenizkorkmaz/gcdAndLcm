import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        // Greatest common divisor= GCD = ebob
        // Lowest common multiple= LCM = ekok
        int i=2, gcd=1;


        Scanner doa = new Scanner(System.in);//define scanner

        System.out.println("Enter the Number of N1: "); //get values from user
        int n1 = doa.nextInt();

        System.out.println("Enter the number of N2: ");
        int n2 = doa.nextInt();



        while (i <= n1 && i<= n2) {

            if(n1 % i == 0 && n2 % i == 0){ //required conditions for gcd

               gcd = i;
            }
            i++;
        }

        System.out.println("Greatest Common Divisor: " + gcd);
        System.out.println("lowest Common Multiple: " + (n1*n2)/gcd ); // Lcm is already calculated with Gcm

    }
}
