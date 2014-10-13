import java.util.Scanner;

public class UserRectangle
{
    public static void Inputs()
    {
        Scanner s = new Scanner(System.in);
        int length, width;
        
        System.out.print("What is the length of the rectangle? : ");
        length = s.nextInt();
        System.out.print("What is the width of the rectangle? : ");
        width = s.nextInt();
        
        double length_square = Math.pow(length, 2);
        double width_square = Math.pow(width, 2);
        double diagonal_square = length_square + width_square;
        
        int rec_area = length*width;
        System.out.println("The area of the rectangle is: "+ rec_area);
        int rec_perimeter = 2*length + 2*width;
        System.out.println("The perimeter of the rectangle is: "+ rec_perimeter);
        double rec_diagonal = Math.pow(diagonal_square, .5);
        System.out.println("The diagonal of the rectangle is: "+ rec_diagonal);
    }
}