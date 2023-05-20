import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner numScan  = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int x = numScan.nextInt();
        System.out.println();
        System.out.print("Enter second number: ");
        int y = numScan.nextInt();

        and(x,y);
        or(x,y);
        xor(x,y);
        negate_1(x);
        negate_2(y);


    }

    public static void and(int x,int y){

        System.out.println(x&y);

    }

    public static void or(int x,int y){
        System.out.println(x|y);
    }

    public static void xor(int x,int y){
        System.out.println(x^y);
    }

    public static void negate_1(int x){
        System.out.println(~x);
    }

    public static void negate_2(int y){
        System.out.println(~y);
    }
}