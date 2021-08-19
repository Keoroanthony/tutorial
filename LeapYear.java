import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Year: ");
        int num = scan.nextInt();
        scan.close();
        int result = num % 4;
        if(result == 0) {
            System.out.println("The year: " + num + " is a leap year");
        }else{
            System.out.println("The year: " + num + " is not a leap year");
        }
    }
}
