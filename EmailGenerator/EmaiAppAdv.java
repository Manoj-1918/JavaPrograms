package EmailGenerator;
import java.util.Scanner;

public class EmaiAppAdv {

    public static void main(String[] args) {
        // operations that can be done..
        // generate new employee email id -> display id, random password
        //show the details of employee
        //change password, set mailcapacity and set alternate email id
        // display name email and mail capacity

        int choose =1;
        Scanner in = new Scanner(System.in);
        mailcodeAdv E1 = new mailcodeAdv();
        while(choose==1){
            System.out.println(" choose for following operation in the database ");
        System.out.println("1) generate new employee email id\n 2)change password \n 3) set mailcapacity \n 4) set alternate email id\n 5) Display Details");
        
        System.out.println(" Enter your choice from 1 to 5 ");
        int choice = in.nextInt();
        in.nextLine();

    

        switch (choice) {
            case 1:{
                E1.generateEmail(in);
                break;
        }
        case 2:{
            System.out.println("enter new strong password");
            String newPass=in.nextLine();
            E1.changePassword(newPass);
            break;
        }
        case 3:{
            System.out.println("enter the new capacity");
            int newcapacity=in.nextInt();
            in.nextLine();
            E1.setCapacity(newcapacity);
            break;
        }
        case 4:{
            System.out.println("enter an alternate email");
            String altmail=in.nextLine();
            E1.alternateEmail(altmail);
            break;
        }
        case 5:{
            E1.display();
            break;
        }
        case 6:
        E1.saveToFile(); // Save details to file
        break;
    default:
        System.out.println("Invalid choice.");
        }
        System.out.println("enter 1 to continue and 0 to end ");
        choose=in.nextInt();
        in.nextLine();
    
        
        }   
        in.close(); 
    }
}