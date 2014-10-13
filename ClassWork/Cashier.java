import java.util.Scanner;

public class Cashier
{
    public static void money()
    {
        Scanner s = new Scanner(System.in);
        int dollar,quarter, dime, nickel, penny;
        
        System.out.print("How much is the product(s) worth?: ");
        double bought = s.nextDouble();
        
        System.out.print("How much did the constumer pay?: ");
        double payed = s.nextDouble();
        
        double remain = payed - bought;
        dollar = (int)remain;
        remain = remain - dollar;
        quarter = (int)(remain/0.25);
        remain = remain - 0.25*quarter;
        dime = (int)(remain/0.1);
        remain = remain - 0.1*dime;
        nickel = (int)(remain/0.05);
        remain = remain - 0.05*nickel;
        penny = (int)(remain/0.01);
        remain = remain - 0.01*penny;
        
        System.out.println(dollar);
        System.out.println(quarter);
        System.out.println(dime);
        System.out.println(nickel);
        System.out.println(penny);
        System.out.println(remain);
    }
}
        