import java.util.Scanner;

public class Main {

    public static void main (String [] args) {
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println ("Enter an Integer: ");
        int num = sc.nextInt();
  
        int result10 = showNumberPlus10(num);
        System.out.println(num + " plus 10 is " + result10);
        int result100 = showNumberPlus100(num);
        System.out.println(num + " plus 100 is " + result100);
        int result1000 = showNumberPlus1000(num);
        System.out.println(num + " plus 1000 is " + result1000);

        sc.close();
    }

    static int showNumberPlus10(int num) {
        return num + 10;
    }

    static int showNumberPlus100(int num) {
        return num + 100;
    }

    static int showNumberPlus1000(int num) {
        return num + 1000;
    }
}