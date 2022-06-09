import java.util.HashMap;
import java.util.Set;

public class Tracklist {
    public static void main(String[] args){
        HashMap<String,String> trackList= new HashMap<String,String>();
        trackList.put("Gone Fishin","Ooo i love to fish slippery slippery fish");
        trackList.put("Maggie Moon","Magie moon rode a balloon i hope i see here soon before the end of june");
        trackList.put("Stairway to Hell","SATAN SATAN SCREaMMMMMMMMM RAWWWWWWWWWWWWWRR LOUD NOISES!!!!");
        trackList.put ("GangBang","GANGSTER THUGS FOR LIFE WHERE IS YOUR WIFE PROBABLY AT THE REHAB STUFFIN HER PIPE!");
        trackList.put ("Stupid Movie","STUPID STUPID MOVIES, STUPID STUPID MOVIES");
        
        String lyrics = trackList.get("GangBang");
        System.out.println("the lyrics for the song are: " + lyrics);

        Set<String> keys = trackList.keySet();
        for (String key : keys) {
            System.out.println(key);
            System.out.println(trackList.get(key));
        }
    }
    
}
