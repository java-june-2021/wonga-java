import java.util.ArrayList;

public class BasicJavaTest {
    public static void main(String[] args) {
        BasicJava challenger = new BasicJava();
        // challenger.challenge1();
        // challenger.challenge2();
        // challenger.challenge3();
        // int[] x = {1,3,5,7,9,13};
        // challenger.challenge4(x);
        ArrayList<Integer> challengeList = new ArrayList<Integer>();
        challengeList.add(1);
        challengeList.add(3);
        challengeList.add(5);
        challengeList.add(7);
        challengeList.add(9);
        challengeList.add(13);
        challenger.challenge4b(challengeList);
    }
}
