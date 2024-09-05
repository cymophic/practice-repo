class Main {
    public static void main(String[] args) {
      
      //Name and Salary
        String name = "Mata, Luis Abhram";
        double grossPay = 1000;
        
      //Deductions
        double wTax = grossPay * 15 / 100;
        double tripleS = grossPay * 3.63 / 100;
        double medC = grossPay * 1.25 / 100;
        double piC = 100;
        
      //Calculation
        double deduct = wTax + tripleS + medC + piC;
        double total = grossPay - deduct;
        
      //Print 
        System.out.println("Employee Name:   " + name);
        System.out.println("Salary:                     " + grossPay);
        System.out.println("");
        System.out.println("----------------------------------");
        System.out.println("Deductions                  Amount");
        System.out.println("");
        System.out.println("Withholding Tax:             " + wTax);
        System.out.println("SSS Contribution:             " + tripleS);
        System.out.println("Medicare:                     " + medC);
        System.out.println("Pag-IBIG Contribution:       " + piC);
        System.out.println("");
        System.out.println("----------------------------------");
        System.out.println("Netpay:                      " + total);
  
    }
  }