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
    public void challenge4(the_array){
        for (int i = 0; i < the_array.length; i++){
            the_array[i] = i
            System.out.println(Arrays.toString(the_array));
        }
    }
// }