import java.util.Scanner;
public class IT26102740Lab3Q1A{
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the price of 1kg of rice:");
        double price = input.nextDouble();

        System.out.print("Enter the number of killograms required:");
        double quantity = input.nextDouble();

        double TotalAmount = price * quantity;
        System.out.print("The total amount is:" + TotalAmount);

         double FinalAmount = TotalAmount * (90/100);
        System.out.print("The total amount after discount is:" + FinalAmount);


    }
}