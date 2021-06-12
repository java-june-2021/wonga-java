import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Puzzling {
    //Print the sum, then print an arrayList greater than "x"
    public void task1(int single_num, ArrayList<Integer> the_array){
        int sum = 0;
        ArrayList<Integer> numbers_above = new ArrayList<Integer>();
        for (int i = 0; i<the_array.size(); i++){
            sum = sum + the_array.get(i);
            if (the_array.get(i) > single_num ){
                numbers_above.add(the_array.get(i));   
            }
        }
        System.out.println("Sum is: " + sum);
        System.out.println(numbers_above);
    }
    //shuffle names then report on length > 5
    public void task2(ArrayList<String> the_array){
        Collections.shuffle(the_array);
        System.out.println(the_array);
        ArrayList<String> name_over_5 = new ArrayList<String>();
        for (int i = 0; i<the_array.size(); i++){
            if (the_array.get(i).length() > 5){
                name_over_5.add(the_array.get(i));
            }
        }
    System.out.println(name_over_5);
    }
    ///Display alphabet first, then last, then special for vowel
    public void task3(ArrayList<Character> the_array){
        Collections.shuffle(the_array);
        System.out.println(the_array);
        ArrayList<Character> vowels= new ArrayList<Character>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('y');
        System.out.println(the_array.get(0));
        System.out.println(the_array.get(the_array.size()-1));
        for (int i = 0; i<vowels.size(); i++){
            if (vowels.get(i) == the_array.get(0)){
                System.out.println("A Message");
            }
        }
    }
    public void task4(){
        Random r = new Random();
        System.out.println(r.nextInt(45)+55);
    }
    public void task5(){
        Random r = new Random();
        ArrayList<Integer> rand_num= new ArrayList<Integer>();
        rand_num.add(r.nextInt(45)+55);
        rand_num.add(r.nextInt(45)+55);
        rand_num.add(r.nextInt(45)+55);
        rand_num.add(r.nextInt(45)+55);
        rand_num.add(r.nextInt(45)+55);
        rand_num.add(r.nextInt(45)+55);
        rand_num.add(r.nextInt(45)+55);
        rand_num.add(r.nextInt(45)+55);
        rand_num.add(r.nextInt(45)+55);
        rand_num.add(r.nextInt(45)+55);
        Collections.sort(rand_num);
        System.out.println("Minimum is: " + rand_num.get(0));
        System.out.println("Maximum is: " + rand_num.get(rand_num.size()-1));
    }
    public String task6(){
        Random r = new Random();
        ArrayList<Character> alphabet = new ArrayList<Character>();
        for(char ch = 'a'; ch <= 'z'; ch++){
            alphabet.add(ch);
        }
        ArrayList<String> rand_word = new ArrayList<String>();
        for(int i = 0; i < 6; i++){
            rand_word.add(String.valueOf(alphabet.get(r.nextInt(26))));
        }
        String rand_string = rand_word.get(0) + rand_word.get(1)
        + rand_word.get(2) + rand_word.get(3)+ rand_word.get(4);
        System.out.println(rand_string);
        return rand_string;
    }
    public ArrayList<String> task7(){
        ArrayList<String> arrayList_of_rand = new ArrayList<String>();
        for(int i = 0; i <10; i++){
            arrayList_of_rand.add(task6());
        }
        System.out.println(arrayList_of_rand);
        return arrayList_of_rand;
    }
        // Random r = new Random();
        // char a = (char) ('a' + r.nextInt(26));
        // char b = (char) ('a' + r.nextInt(26));
        // char c = (char) ('a' + r.nextInt(26));
        // char d = (char) ('a' + r.nextInt(26));
        // char e = (char) ('a' + r.nextInt(26));
        // String the_string;
        // StringBuilder sb = new StringBuilder();
        // sb.append(a);
        // sb.append(b);
        // sb.append(c);
        // sb.append(d);
        // sb.append(e);
        // System.out.println(sb);
}
