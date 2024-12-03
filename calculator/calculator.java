import java.util.Scanner;

public class calculator{
    public static void main(String args[]){
        Scanner scan= new Scanner(System.in);
        System.out.println("operations available");
        System.out.println("1) addition\n2) subtraction\n3) multiplication\n4) Division \n5) Modulus\n6) Logrithmic\n7) power");
        byte operation = scan.nextByte();
        
        // making object for these operations
        functions func =new functions();

        switch (operation){
            case 1:
                    {
                        System.out.println("Enter two numbers to add :");
                        int a=scan.nextInt();
                        int b=scan.nextInt();
                        System.out.println("sum is :"+func.addition(a,b)); 
                        break;
                    }
            case 2:
                    {
                        System.out.println("Enter two numbers to subtract :");
                        int a=scan.nextInt();
                        int b=scan.nextInt();
                        System.out.println("difference is : "+func.subtraction(a, b));
                        break;
                    } 
            case 3:
            {
                System.out.println("Enter two numbers to multiply :");
                int a=scan.nextInt();
                int b=scan.nextInt();
                System.out.println("product is : "+func.multiplication(a, b));
                break;
            } 
            case 4:
            {
                System.out.println("Enter two numbers for division :");
                float a=scan.nextFloat();
                float b=scan.nextFloat();
                System.out.println("quotient is : "+func.Division(a, b));
                break;
            }  
            case 5:
            {
                
                    System.out.println("Enter two numbers to get remainder :");
                    int a=scan.nextInt();
                    int b=scan.nextInt();
                    System.out.printf("Remainder on dividing %d by %d  is : %d",a,b,func.modulus(a, b));
                    break;
            }  
            case 6:{
                
                    System.out.println("Enter two numbers first base and then radix :");
                    int a=scan.nextInt();
                    int b=scan.nextInt();
                    System.out.printf("base %d log %d is : %d",a,b,func.logbase2(a, b));
                    break;

            } 
            case 7:
            {
                System.out.println("Enter two numbers first base and exponent :");
                int a=scan.nextInt();
                int b=scan.nextInt();
                System.out.printf("%d raise to power %d  is : %.2f ",a,b,func.raisePower(a, b));
                break;
            }    
            default:{
                System.out.println("invalid number...");
            }
        }
        scan.close();


    }
}