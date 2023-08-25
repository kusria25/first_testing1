public class test_5 {
    public static void main(String[] args) {
        int x, sum = 0, temp;
        int n = 45654;

        temp = n;
        while (n > 0) {
            x = n % 10;
            sum = (sum * 10) + x;
            n /= 10;
        }
        if (temp == sum)
            System.out.println("რიცხვი პალინდრომია" + temp);

        else
            System.out.println("რიცვი არ არის პალინდრომული");
    }
}
