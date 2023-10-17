import java.util.Scanner;

public class MemberGroup {
    public void  memberInfo(){
            //declare variables
            Scanner sc= new Scanner(System.in);
            String name,location,status,sex,Nationality;
            int age,numberPhone,postalCode;

            System.out.println("Enter your name or group name");
            name=sc.nextLine();
            System.out.println("Enter your age");
            age=sc.nextInt();
            System.out.println("Enter your phone number ");
            numberPhone=sc.nextInt();
            System.out.println("Enter your location");
            location=sc.nextLine();
            System.out.println("Enter your postal code");
            postalCode=sc.nextInt();
            System.out.println("Enter your status");
            status=sc.nextLine();
            System.out.println("Enter your gender");
            sex=sc.nextLine();
            System.out.println("Enter your nationality");
            Nationality=sc.nextLine();

        }
    }
