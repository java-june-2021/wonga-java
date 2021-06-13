import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Set;


public class Hashmatique {
    public static void oneSong(){
        HashMap<String, String> musicMap = new HashMap<String, String>();
        musicMap.put("Lover Song", "I love love love you so much");
        musicMap.put("The Dance Party", "Sam Samurai");
        musicMap.put("Rock Your Socks", "Walter Wizard");
        musicMap.put("The Gang Finds a Shoe", "Walter Wizard");
        musicMap.put("Why So Much Water", "Walter Wizard");
        System.out.println(musicMap.get("Lover Song"));
    }
        // public void allSongs(){
        //     Set<String> keys = musicHashMap.keySet();
        //     for(String key : keys) {
        //         System.out.println(key);
        //         System.out.println(musicHashMap.get(key)); 
        //     }
        // }
}