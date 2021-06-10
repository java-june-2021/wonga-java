import java.util.ArrayList;

public class BasicJava {
    public void challenge1(){
        for (int i = 1; i < 256; i++){
            System.out.println(i);
        }
    }
    public void challenge2(){
        for (int i = 1; i < 256; i++){
            if (i%2!=0){
                System.out.println(i);
            }
        }
    }
    public void challenge3(){
        int sum = 0;
        for (int i = 1; i < 256; i++){
            sum = i + sum;
            System.out.println("New Number: "+i+ " Sum: " + sum);
        }
    }
    public void challenge4(int[] the_array){
        for (int i = 0; i < the_array.length; i++){
            System.out.println(the_array[i]);
        }
    }
    public void challenge4b(ArrayList<Integer> the_array){
        System.out.println(the_array);
        for (int i = 0; i<the_array.size(); i++){
            System.out.println(the_array.get(i));
        }
    }
}