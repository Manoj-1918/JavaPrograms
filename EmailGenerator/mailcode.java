package EmailGenerator;
import java.util.Scanner;
import java.util.Random;

class mailcode {
    private String emailId;
    private String password;
    private String altEmailId;
    private String department;
    private String firstName;
    private String lastName;
    private int mailcapacity;
    private int passwordlength = 8;

    public void password(int passwordLength) {
        String charSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789@#$%&*";
        String password = "";
        Random random = new Random();

        for (int i = 0; i < passwordLength; i++) {
            int index = random.nextInt(charSet.length());
            password += charSet.charAt(index);
        }

        this.password = password;
    }

    public void generateEmail(Scanner in) {  // Scanner passed from main
        int option;
        String company = "a2zsales";
        
        System.out.println("Enter the first name of employee:  ");
        this.firstName = in.nextLine();
        System.out.println("Enter the last name of employee:   ");
        this.lastName = in.nextLine();
        System.out.println("Choose the department of the employee");
        System.out.println("1) sales\n2) development\n3) accounting\n4) none");
        System.out.println("Enter the department 1 to 4: ");
        option = in.nextInt();
        in.nextLine();

        switch (option) {
            case 1:
                department = "sales";
                break;
            case 2:
                department = "development";
                break;
            case 3:
                department = "accounting";
                break;
            case 4:
                department = "none";
                break;
            default:
                department = "none";
        }

        emailId = firstName + "." + lastName + "@" + department + "." + company + ".com";
        password(passwordlength);
        System.out.println("Email ID: " + emailId);
        System.out.println("Random Password: " + this.password);
    }

    public void changePassword(String newpassword) {
        this.password = newpassword;
        System.out.println("New password is: " + this.password);
    }

    public void setCapacity(int newcapacity) {
        this.mailcapacity = newcapacity;
    }

    public void alternateEmail(String altEmail) {
        this.altEmailId = altEmail;
    }

    public void display() {
        System.out.println("================ Employee Details ================");
        System.out.println("Name :\t" + this.firstName + " " + this.lastName);
        System.out.println("Department :\t" + (department != null ? department : "N/A"));
        System.out.println("EmailId :\t" + (emailId != null ? emailId : "N/A"));
        System.out.println("Mailbox Capacity :\t" + mailcapacity);
        System.out.println("Alternate Email :\t" + (altEmailId != null ? altEmailId : "N/A"));
        System.out.println("Password :\t" + this.password);
        System.out.println("==================================================");
    }
}
