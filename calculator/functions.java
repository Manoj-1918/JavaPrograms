public class functions {

    public int addition(int num1, int num2){
        return num1+num2;
    }
    public int subtraction(int num1,int num2){
        return num1-num2;
    }
    public int multiplication(int num1,int num2){
        return num1*num2;
    }
    public float Division(float num1,float num2){
        return num1/num2;
    }
    public int modulus(int num1,int num2){
        return num1%num2;
    }

    public int Logrithmic(int base, int value){
        int result=0;
        while (value >= base) {
            value /= base;  // Integer division
            result++;
        }
    
        return result;
    }
    
    // if i use bit wise operatior for this log base must be 2 for binary manipulations
    public int logbase2(int base,int value){
        int result=0;
        if(base==2){
            do{
                value>>=1;
                result++;

            }while(value>0);
        }
        else{
            result=(logbase2(2,value)/logbase2(2,base))+1;
        }
        return result;
        
        
    }
    public double raisePower(int base, int exponent){
        double result = 0;
        result=Math.pow(base, exponent);
        return result;
    }

}
