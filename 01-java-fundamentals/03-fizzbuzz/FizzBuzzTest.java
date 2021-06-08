public class FizzBuzzTest {
    public static void main(String[] args){
        FizzBuzz FB = new FizzBuzz();
        for (int i = 1; i <= 50 ; i++){
            System.out.println(FB.fizzBuzz(i));
        }
    }
}