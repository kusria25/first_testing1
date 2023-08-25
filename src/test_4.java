import java.util.Scanner;
public class test_4 {
    /*4)დაწერეთ ფუნქცია, რომელსაც გადაეცემა ერთი მთელი long ტიპის რიცხვი დაბ აბრუნეს
    boolean მნიშვნელობას, იმის შესაბამისად შეიცავს თუ არა გადაცემული რიცხვი სამ ერთნაირ ციფრს. */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("input,  long numbers:");
        long numBer=scan.nextLong();
        boolean result =diGt(numBer);

        if(result){
            System.out.println("long tipis ricxvi sheicavs sam ertnair cifrs ");
        }
        else
            System.out.println("ar sheicavs sam msgavs ricxvs");
    }
    public static boolean diGt(long num) {
        if (num < 0)
            System.out.println("error");


        String NString = Long.toString(num);
        for (int i = 0; i <= NString.length() - 3; i++) {
            char DG1 = NString.charAt(i);
            char DG2 = NString.charAt(i + 1);
            char DG3 = NString.charAt(i + 2);

            if (DG1 == DG2 && DG2 == DG3)
                return true;
        }
        return false;
    }
}
