import java.util.ArrayList;
import java.util.Scanner;

public class MonthlyContribution {

    public void monthlyCont(){
        Scanner obj = new Scanner(System.in);
        int contributionIndividual,contributionGroup;
        //enter function
        ArrayList<Integer> regMonthly = new ArrayList<Integer>();
    System.out.println("Enter the individual contribution");
        contributionIndividual=obj.nextInt();
    if(contributionIndividual<1000)

        {
            System.out.println("Enter amount greater than 1000");
        }
    else{
            regMonthly.add(contributionIndividual);
        }
    System.out.println("Enter the group individual Group contribution");
        contributionGroup=obj.nextInt();
    if(contributionGroup<100){
            System.out.println("The amount is less than 1000");
        }
    else{
            regMonthly.add(contributionGroup) ;
        }
    }
}

