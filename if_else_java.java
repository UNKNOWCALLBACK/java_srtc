import java.util.Scanner;
public class if_else_java {
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
System.out.println("Enter your age :");
int age = sc.nextInt();
if (age < 18){
    System.out.println("Your age is " + age + " you must be 18 year old");
    System.out.println("Access denind");
}else if (age < 19)
{
    System.out.println("Your age is " + age);
    System.out.println("you have a permission");
}else
{
    System.out.println("Your age is " + age);
    System.out.println("แก่เกิน");
}
    }
}