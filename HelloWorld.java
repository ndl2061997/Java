import java.util.Scanner;

/**
 * HelloWorld
 */
public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("HelloWorld");
        int n ;
        n = 5;
        System.out.println("Gia tri cua n: ");
        Scanner sc = new java.util.Scanner(System.in);
        n = sc.nextInt();
        sc.close();
        System.out.println("n binh phuong = "+ n*n);
    }
}
