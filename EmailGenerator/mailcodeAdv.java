package EmailGenerator;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

class mailcodeAdv {
   private String emailId;
   private String password;
   private String altEmailId;
   private String department;
   private String firstName;
   private String lastName;
   private int mailcapacity;
   private int passwordlength = 8;


   public void saveToFile() {
    String filename = "employee_details.txt"; // Specify the file name
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) { // Append mode
        writer.write("Name: " + this.firstName + " " + this.lastName);
        writer.newLine();
        writer.write("Department: " + (department != null ? department : "N/A"));
        writer.newLine();
        writer.write("Email ID: " + (emailId != null ? emailId : "N/A"));
        writer.newLine();
        writer.write("Mailbox Capacity: " + mailcapacity);
        writer.newLine();
        writer.write("Alternate Email: " + (altEmailId != null ? altEmailId : "N/A"));
        writer.newLine();
        writer.write("Password: " + this.password);
        writer.newLine();
        writer.write("======================================");
        writer.newLine();
        System.out.println("Details saved to " + filename);
    } catch (IOException e) {
        System.out.println("An error occurred while saving to file: " + e.getMessage());
    }
}

   public void password(int var1) {
      String var2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789@#$%&*";
      String var3 = "";
      Random var4 = new Random();

      for(int var5 = 0; var5 < var1; ++var5) {
         int var6 = var4.nextInt(var2.length());
         var3 = var3 + var2.charAt(var6);
      }

      this.password = var3;
   }

   public void generateEmail(Scanner var1) {
      String var3 = "a2zsales";
      System.out.println("Enter the first name of employee:  ");
      this.firstName = var1.nextLine();
      System.out.println("Enter the last name of employee:   ");
      this.lastName = var1.nextLine();
      System.out.println("Choose the department of the employee");
      System.out.println("1) sales\n2) development\n3) accounting\n4) none");
      System.out.println("Enter the department 1 to 4: ");
      int var2 = var1.nextInt();
      var1.nextLine();
      switch (var2) {
         case 1:
            this.department = "sales";
            break;
         case 2:
            this.department = "development";
            break;
         case 3:
            this.department = "accounting";
            break;
         case 4:
            this.department = "none";
            break;
         default:
            this.department = "none";
      }

      this.emailId = this.firstName + "." + this.lastName + "@" + this.department + "." + var3 + ".com";
      this.password(this.passwordlength);
      System.out.println("Email ID: " + this.emailId);
      System.out.println("Random Password: " + this.password);
   }

   public void changePassword(String var1) {
      this.password = var1;
      System.out.println("New password is: " + this.password);
   }

   public void setCapacity(int var1) {
      this.mailcapacity = var1;
   }

   public void alternateEmail(String var1) {
      this.altEmailId = var1;
   }

   public void display() {
      System.out.println("================ Employee Details ================");
      System.out.println("Name :\t" + this.firstName + " " + this.lastName);
      String var10001 = this.department != null ? this.department : "N/A";
      System.out.println("Department :\t" + var10001);
      var10001 = this.emailId != null ? this.emailId : "N/A";
      System.out.println("EmailId :\t" + var10001);
      System.out.println("Mailbox Capacity :\t" + this.mailcapacity);
      var10001 = this.altEmailId != null ? this.altEmailId : "N/A";
      System.out.println("Alternate Email :\t" + var10001);
      System.out.println("Password :\t" + this.password);
      System.out.println("==================================================");
   }
}
