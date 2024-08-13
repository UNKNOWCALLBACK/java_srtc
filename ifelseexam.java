import java.util.Scanner;

public class ifelseexam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("-----------------------------------------------------------------------");
        System.out.println("\t\t\t   Income and Tax ");
        System.out.println("-----------------------------------------------------------------------");

        System.out.print("Input ID Card : ");
        String card = input.nextLine();

        System.out.print("Input name : ");
        String name = input.nextLine();

        System.out.print("Input Salary : ");
        int salary = input.nextInt();

        System.out.print("Input OT : ");
        int ot = input.nextInt();
        System.out.println("-----------------------------------------------------------------------");

        double total = salary + ot;
        double tax = 0;
		int taxPercentage = 0;

        // Calculate tax
        if (total >= 100000) {
            tax = total * 0.10;
			taxPercentage = 10;
        } else if (total >= 70000) {
            tax = total * 0.07;
			taxPercentage = 7;
        } else if (total >= 50000) {
            tax = total * 0.05;
			taxPercentage = 5;
        } else if (total >= 30000) {
            tax = total * 0.03;
			taxPercentage = 3;
        } else { 
            tax = total * 0.01;
			taxPercentage = 1;
        }

        // Calculate Income after tax
        double inafter = total - tax;
        
        String baht = " Baht";	
        
        System.out.println("Total => " + total + baht);
        System.out.println("Tax is " +taxPercentage + "% => " + tax + baht);
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Income after taxes => " + inafter + baht);
        System.out.println("=======================================================================");

        input.close();
    }
}