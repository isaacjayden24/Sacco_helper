import java.util.ArrayList;
import java.util.Scanner;

public class RegistrationFees {

    public void regFees() {
        Scanner scan = new Scanner(System.in);
        int feesIndividual, feesGroup;
        //enter function
        ArrayList<Integer> reg = new ArrayList<Integer>();
        System.out.println("Enter the individual fees");
        feesIndividual = scan.nextInt();
        if (feesIndividual < 2000) {
            System.out.println("Your registration fees is low");
        } else {
            reg.add(feesIndividual);
        }
        //enter function like public void(){}
        System.out.println("Enter the group individual fees");
        feesGroup = scan.nextInt();
        if (feesGroup < 5000) {
            System.out.println("Your registration fees is low");
        } else {
            reg.add(feesGroup);
        }
        System.out.println(reg);
    }
}
