import java.util.ArrayList;
import java.util.Arrays;

public class BasicJava {
    //Print everything
    public void challenge1(){
        for (int i = 1; i < 256; i++){
            System.out.println(i);
        }
    }
    //Print the odds
    public void challenge2(){
        for (int i = 1; i < 256; i++){
            if (i%2!=0){
                System.out.println(i);
            }
        }
    }
    //Summing up as we go
    public void challenge3(){
        int sum = 0;
        for (int i = 1; i < 256; i++){
            sum = i + sum;
            System.out.println("New Number: "+i+ " Sum: " + sum);
        }
    }
    //Printing an array
    public void challenge4(int[] the_array){
        for (int i = 0; i < the_array.length; i++){
            System.out.println(the_array[i]);
        }
    }
    //Printing an array
    public void challenge4b(ArrayList<Integer> the_array){
        System.out.println(the_array);
        for (int i = 0; i<the_array.size(); i++){
            System.out.println(the_array.get(i));
        }
    }
    //Getting the max
    public void challenge5(int[] the_array){
        int max = the_array[0];
        for (int i = 0; i<the_array.length; i++){
            if(max < the_array[i]){
                max = the_array[i];
            }
        }
        System.out.println("The max is: "+ max);
    }
    //Getting the average
    public void challenge6(int[] the_array){
        double average = 0;
        double sum = 0;
        for (int i = 0; i<the_array.length; i++){
            sum = sum + the_array[i];
        }
        average = sum/the_array.length;
        System.out.println("The avg is: "+ average);
    }
    //An arraylist of odd numbers
    public void challenge7(){
        ArrayList<Integer> y = new ArrayList<Integer>();
        for (int i = 1; i < 256; i++){
            if (i%2!=0){
                y.add(i);
            }
        }
        System.out.println(y);
    }
    //count of bigger than "y"
    public void challenge8(int y, int[] the_array){
        int counter = 0;
        for (int i = 0; i<the_array.length; i++){
            if (the_array[i] > y){
                counter++;
            }
        }
        System.out.println("The count >" + y + " is: " + counter);
    }
    //Square the values
    public void challenge9(int[] the_array){
        for (int i = 0; i<the_array.length; i++){
            the_array[i] = the_array[i]*the_array[i];
            }
    //Remember you can't just print out "the_array" you need to to array to string
    System.out.println(Arrays.toString(the_array));
    }
    //Turn everything positive
    public void challenge10(int[] the_array){
        for (int i = 0; i<the_array.length; i++){
            if (the_array[i] < 0){
                the_array[i] = the_array[i]*-1;
            }
        }
    System.out.println(Arrays.toString(the_array));
    }
    //Max, Min, Average
    public void challenge11(int[] the_array){
        double average = 0;
        double sum = 0;
        double min = the_array[0];
        double max = the_array[0];
        for (int i = 0; i<the_array.length; i++){
            sum = sum + the_array[i];
            if(max < the_array[i]){
                max = the_array[i];
            }
            if(min > the_array[i]){
                min = the_array[i];
            }
        }
        average = sum/the_array.length;
        double[] result = {max, min, average};
        System.out.println(Arrays.toString(result));
    }
    //Shifting the values
    public void challenge12(int[] the_array){
        for (int i = 0; i<the_array.length-1; i++){
            the_array[i] = the_array[i+1];
        }
        the_array[the_array.length-1] = 0;
        System.out.println(Arrays.toString(the_array));
    }
}
