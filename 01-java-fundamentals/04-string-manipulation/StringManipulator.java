public class StringManipulator {
    public String trimAndConcat(String String1, String String2){
        return String1.trim().concat(String2.trim());
    }
    public Integer getIndexOrNull(String input0, char a) {
        if (input0.indexOf(a) < 0) {
            return null;
        } else {
        return input0.indexOf(a);
        }
    }
    public Integer getIndexOrNull(String input1 , String input2 ){
        if (input1.indexOf(input2) < 0) {
            return null;
        } else {
        return input1.indexOf(input2);
        }
    }
    public String concatSubstring(String input3, int a, int b, String input4){
        return input3.substring(a,b).concat(input4);//returns va  
    }
}