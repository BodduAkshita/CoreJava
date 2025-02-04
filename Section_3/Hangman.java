import java.util.Arrays;
import java.util.Scanner;
public class Hangman {
    public static String[] words = {"ant", "baboon", "badger", "bat", "bear","beaver", "camel", "cat", "clam", "cobra", "cougar", "coyote", "crow", "deer", "dog", "donkey", "duck", "eagle", "ferret", "fox", "frog", "goat", "goose", "hawk", "lion", "lizard", "llama", "mole", "monkey", "moose", "mouse", "mule", "newt", "otter", "owl", "panda", "parrot", "pigeon", "python", "rabbit", "ram", "rat", "raven","rhino", "salmon", "seal", "shark", "sheep", "skunk", "sloth", "snake", "spider", "stork", "swan", "tiger", "toad", "trout", "turkey","turtle", "weasel", "whale", "wolf", "wombat", "zebra"};
    public static String[] gallows = {
        "+---+\n" +
        "|   |\n" +
        "    |\n" +
        "    |\n" +   //if the user didn't miss any guesses.
        "    |\n" +
        "    |\n" +
        "=========\n",
       
        "+---+\n" +
        "|   |\n" +
        "O   |\n" +   //if the user missed one guess.
        "    |\n" +
        "    |\n" +
        "    |\n" +
        "=========\n",
         
        "+---+\n" +
        "|   |\n" +
        "O   |\n" +    //if the user missed two guesses.
        "|   |\n" +
        "    |\n" +
        "    |\n" +
        "=========\n",
        
        " +---+\n" +
        " |   |\n" +
        " O   |\n" +   //if the user missed three guesses.
        "/|   |\n" +
        "     |\n" +
        "     |\n" +
        " =========\n",
        
        " +---+\n" +
        " |   |\n" +
        " O   |\n" +
        "/|\\  |\n"+   //if the user missed four guesses.
        "     |\n" +
        "     |\n" +
        " =========\n",
        
        " +---+\n" +
        " |   |\n" +
        " O   |\n" +
        "/|\\  |\n" +  //if the user missed five guesses.
        "/    |\n" +
        "     |\n" +
        " =========\n",
        
        " +---+\n" +
        " |   |\n" +
        " O   |\n" +
        "/|\\  |\n" +   //if the user missed six guesses.
        "/ \\  |\n" +
        "     |\n" +
        " =========\n"};
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String word = randomWord();
            int size = word.length();
            char[] placeholder = new char[size];
            for (int i = 0; i < size; i++){
                placeholder[i] = '_';
            }
            int misses = 0;
            char[] missedGuesses =  new char[6];  
            while (misses <= 6){
                System.out.print(gallows[misses]);
                System.out.print("Word : ");
                printPlaceholders(placeholder, size);
                
                System.out.print("\n");

                System.out.print("Misses:   ");
                
                printMissesedGusses(missedGuesses);
                System.out.print("\n\n");
                System.out.print("Guess:   ");
                char guess = scan.nextLine().charAt(0);
                System.out.print("\n");

                if (checkWord(guess, word)) {
                    updatePlaceholder(guess, word, placeholder);
                } else {
                    missedGuesses[misses] = guess;
                    misses++;
                }
                
                if (Arrays.equals(placeholder, word.toCharArray())) {
                    System.out.print(gallows[misses]);
                    System.out.print("\nWord:   ");
                    printPlaceholders(placeholder, size);
                    System.out.println("\nGOOD WORK!");                
                    break;
                }
            }

                if (misses == 6) {
                    System.out.print(gallows[6]);
                    System.out.println("\nRIP!");
                    System.out.println("\nThe word was: '" + word + "'");
                }

            scan.close();
        }
        public static String randomWord()
        {
            int numWord = words.length;
            Double randomDouble = Math.random();
            int randomIndex = (int) (randomDouble * numWord);
            return words[randomIndex];
        }
        public static boolean checkWord(char guess, String word){
            for (int i = 0; i < word.length(); i++){
                if (word.charAt(i) == guess){
                    return true;
                }
            }
            return false;
        }
        public static void updatePlaceholder(char guess, String word, char[] placeholder){
            for (int i = 0; i < word.length(); i++){
                if (word.charAt(i) == guess){
                    placeholder[i] = guess;
                }
            }
        }
        public static void printPlaceholders(char[] placeholders, int size) {
            for (int i = 0; i < size; i++) {
                    System.out.print(" " + placeholders[i]);
                }
            System.out.println();
        }
        public static void printMissesedGusses(char[] misses){
            for (int i = 0; i < misses.length; i++) {
                System.out.print(misses[i]);
            }

        }
    
    
}
