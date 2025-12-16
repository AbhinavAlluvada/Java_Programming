import java.util.*;
public class intro{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello World!");
        System.out.print("Enter your age: ");
        int n = scanner.nextInt();
        System.out.println("Your age: "+n);
        scanner.close();
    }
}