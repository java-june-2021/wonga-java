import java.util.ArrayList;
import java.util.Set;
import java.util.HashMap;

public class Hashmatique {
        public void oneSong() {
            HashMap<String, String> musicMap = new HashMap<String, String>();
            musicMap.put("Lover Song", "I love love love you so much");
            musicMap.put("The Dance Party", "It's a party and I'll dance if I want to");
            musicMap.put("Rock Your Socks", "We will, we will, rock socks");
            musicMap.put("The Gang Finds a Shoe", "What with this shoe");
            musicMap.put("Why So Much Water", "Water water everywhere");
            System.out.println(musicMap.get("Lover Song"));
            Set<String> keys = musicMap.keySet();
            for(String key : keys) {
                System.out.println(musicMap.get(key));    
            } 
        }
}
