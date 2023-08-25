public class test_1 {
    public static void main(String[] args){
     /*1)დაწერეთ ფუნქცია, რომელიც პარამეტრად მიიღებს მთელირიცხვების მასივს და დააბრუნებს წილად მნიშვნელობას. ფუნქციამ უნდა
        გამოთვალოს მასივში ლუწ ინდექსზე მდგომი რიცხვების საშუალო არითმეტიკული.*/

        double summ=0,sashualo=0;

        int[] numbers = {2,4,6,8,10,97,0,32,-3,11,23,5,4,-54,9};
        for(int i=0; i < numbers.length;i+=2){
            summ +=numbers[i];
            sashualo++;
        }
        System.out.println("am masivshi luw indeqsiani ricxvebis sashualo aris~"+summ/sashualo);
    }
}
