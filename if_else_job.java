import java.util.Scanner;
public class if_else_job {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = Sc.nextLine();
        String ga;
        System.out.print("Enter your point all : ");
        int point = Sc.nextInt();
        System.out.print("Enter your point of midterm : ");
        int mid = Sc.nextInt();
        System.out.print("Enter your point of final test : ");
        int finals = Sc.nextInt();
        Sc.close();

        if (point < 0 && point > 100 && mid < 0 && mid > 100 && finals < 0 && finals > 100) {
          System.out.println("===================================================");
          System.out.println("\tWARNING SYSTEM");
          System.out.println("\tERROR SYNTAX");
          System.out.println("\tPLEASE ENTER YOUR SCORE WITH INT SYNTAX");
          System.out.println("===================================================");
      } else {

        double score = point + mid + finals;
        if (score < 0 && score > 100) {
          System.out.println("===================================================");
          System.out.println("\tWARNING SYSTEM");
          System.out.println("\tERROR SYNTAX");
          System.out.println("\tPLEASE ENTER YOUR SCORE WITH INT SYNTAX");
          System.out.println("===================================================");
      } else {
        if (score >= 50 && score <= 59) {
          ga = "D";
        }else if (score >= 60 && score <= 69){
          ga = "C";
        }else if (score >= 70 && score <= 79 ){
          ga = "B";
        }
        else if (score >= 80 && score <= 100){
          ga = "A";
        }
        else if (score >= 0 && score <= 49){
          ga = "E";
        }
        else{
          ga = "ERROR";
        }
        System.out.println("===================================================");
        System.out.println("\t RESULT SYSTEM");
        System.out.println("\tYOUR NAME : " + name);
        System.out.println("\tYOUR POINT : " + score);
        System.out.println("\tYOUR GRADE : " + ga);
        System.out.println("===================================================");
    }

}
}
}

