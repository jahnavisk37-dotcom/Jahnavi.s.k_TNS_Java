package oopsdemo;

class Bank {
    double getInterestRate() {
        return 5.0;
    }
}

class SBI extends Bank {
   
    double getInterestRate() {
        return 6.4;
    }
}


class HDFC extends Bank {
    
    double getInterestRate() {
        return 7.0;
    }
}


public class MethodOverriding {
    public static void main(String[] args) {

        SBI s = new SBI();
        HDFC h = new HDFC();

        System.out.println("SBI Interest Rate: " + s.getInterestRate());
        System.out.println("HDFC Interest Rate: " + h.getInterestRate());
    }
}