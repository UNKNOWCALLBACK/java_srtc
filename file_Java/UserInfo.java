public class UserInfo {
    public static void main(String[] args) {
        String name = "teepakorn lektong";
        int money = 250;
        int rice =75;
        int candy = 25;
        int muse = rice + candy;
        int full = money - muse;
        System.out.println("=====================================");
        System.out.println("ชื่อของคุณคือ: " + name);
        System.out.println("เงินที่ได้: " + money + " บาท");
        System.out.println("=====================================");
        System.out.println("คุณกินข้าวไป: " + rice + " บาท");
        System.out.println("คุณกินขนมไป: " + candy + " บาท");
        System.out.println("=====================================");
        System.out.println("คุณใช้เงินไป: " + muse + " บาท");
        System.out.println("คุณเหลือเงิน: " + full + " บาท");
        System.out.println("=====================================");
    }
}
