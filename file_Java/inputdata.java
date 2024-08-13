    import java.util.Scanner;

    public class inputdata {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
                    System.out.println("ป้อนชื่อ");
                String name = scanner.nextLine();
                    System.out.println("รายได้จากผปค.");
                int money = scanner.nextInt();
                    System.out.println("ป้อนค่ากินข้าว");
                int rice = scanner.nextInt();
                    System.out.println("ป้อนค่ากินขนม");
                int candy = scanner.nextInt();
                int muse = rice + candy;
                int full = money - muse;
                    System.out.println("ชื่อของคุณคือ: " + name);
                    System.out.println("เงินที่ได้: " + money + " บาท");
                    System.out.println("คุณใช้เงินไป: " + muse + " บาท");
                    System.out.println("คุณเหลือเงิน: " + full + " บาท");
            scanner.close();
        }     
    
    }