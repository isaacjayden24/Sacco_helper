import java.util.Scanner;

public class RepaymentInterest {
    //public static void main(String[] args) {
    Scanner obj2 = new Scanner(System.in);
    int month, amount, option, Time;
    double rate, defaulted, payment;

    //create function
    public void repayment() {
        System.out.println("Enter the total amount borrowed");
        amount = obj2.nextInt();
        System.out.println("Enter the time in months");
        Time= obj2.nextInt();
        System.out.println("Has the user defaulted press 1 for yes and 2 for no");
        option = obj2.nextInt();
        if (option == 1) {
            System.out.println("Enter the time he/she has defaulted");
            Time = obj2.nextInt();
            rate = 0.1 * Time;
            defaulted = rate * amount;
            System.out.println("The total defaulted is" + defaulted);
        } else if (option == 2) {

            month = obj2.nextInt();
            rate = 0.1 * month;
            payment = rate * amount;
            System.out.println("The amount to be be paid is" + payment);
        } else {
            System.out.println("Enter a valid option");
        }
    }
}


