import java.util.Scanner;

public class testex {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
System.out.println("===========================================");
System.out.println("             Program Receipt               ");
System.out.println("===========================================");
System.out.println("Please code Enter :");
int code = scanner.nextInt();
System.out.print("Please name Enter :");
String name = scanner.nextLine();
System.out.println("Please quantity Enter :");
int quan = scanner.nextInt();
System.out.println("Please price Enter :");
int price = scanner.nextInt();
System.out.println("===========================================");
int result = price*quan;
System.out.println("Total  = "+result + "bant");
int discount = 5000;
int nettotal = result - discount ;
System.out.println("Discount 10%  =  "+discount+"  bant");
System.out.println("Net total = "+ nettotal +" bant");
System.out.println("===========================================");
    }
}
