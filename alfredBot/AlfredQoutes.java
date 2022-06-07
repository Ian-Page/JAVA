import java.util.Date;

public class AlfredQoutes {

    public String basicGreeting() {
        
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name, String dayPeriod) {
        return String.format("Good %s, %s. your a horrible person", dayPeriod, name);
    }

    public String dateAnnouncement() {
        return String.format("the time currently is %s", new Date());
    }
    
    public String respondBeforeAlexis
        
    (String phrase) {

        if(phrase.indexOf("Alexis") > -1) {
            return "She's lame. What can I get for you?";
    }

        if (phrase.indexOf("Alfred") > -1) {
            return "Whatcha need homey? i got dem pokemons...";
        }

    return "You are super boring bye bye";
    } 
    
	// NINJA BONUS
	// See the specs to overload the guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned
}
