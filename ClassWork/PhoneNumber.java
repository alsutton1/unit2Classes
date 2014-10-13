import java.util.Scanner;

public class PhoneNumber
{
    public static void Numbers()
    {
        Scanner s = new Scanner(System.in);
        String number,n1,n2;
        
        System.out.print("Please print your 10 digit phone number (no symbols/letters): ");
        number = s.next();
        
        n1 = number.substring(0,3);
        n1 = "(" + n1 + ")";
        n2 = number.substring(3,6) + "-" + number.substring(6,9);
        String phone = n1 + " " + n2;
        
        System.out.println(phone);
    }
}        