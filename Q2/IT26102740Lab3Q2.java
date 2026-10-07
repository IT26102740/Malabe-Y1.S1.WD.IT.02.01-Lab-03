import java.util.Scanner;
public class IT26102740Lab3Q2{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the monthly Salary:");
        double Salary = input.nextDouble();

        System.out.print("Enter the number of overtime hours:");
        double  hours = input.nextDouble();

        System.out.print("Enter the overtime rate per hour:");
        double  rate = input.nextDouble();

        double OverTime = hours * rate;
        double TotalPay = Salary + OverTime;

        System.out.print("The total salary including overtime is:" + TotalPay);

    }
}