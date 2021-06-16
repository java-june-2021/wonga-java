import java.util.ArrayList;
import java.util.Set;
import java.util.HashMap;

public class Exceptions {
        public void task1() {
            ArrayList<Object> myList = new ArrayList<Object>();
            myList.add("13");
            myList.add("hello world");
            myList.add(48);
            myList.add("Goodbye World");
            System.out.println(myList);
            for(int i = 0; i < myList.size(); i++) {
                try {
                Integer castedValue = (Integer) myList.get(i);
                System.out.println("successful: " + castedValue);
                }
                //Does this have to be "exception e"
                catch (Exception e){
                System.out.println(String.format("Failed: " + myList.get(i)));
                }
            }
        }
}