package exercise1;
import java.util.Scanner;
/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author 
 * @author Zain Khan - Wed, Feb 1, 2023 
 */
public class CardTrick
{
    public static void main(String[] args)
    {
        Card[] hand = new Card[7];
        hand[0]= new Card();
        hand[0].setValue(1);
        hand[0].setSuit("Hearts");        
        hand[1]= new Card();
        hand[1].setValue(2);
        hand[1].setSuit("Clubs");        
        hand[2]= new Card();
        hand[2].setValue(3);
        hand[2].setSuit("Diamonds");
        hand[3]= new Card();
        hand[3].setValue(4);
        hand[3].setSuit("Spades");
        hand[4]= new Card();
        hand[4].setValue(5);
        hand[4].setSuit("Diamonds");
        hand[5]= new Card();
        hand[5].setValue(12);
        hand[5].setSuit("Clubs");
        hand[6]= new Card();
        hand[6].setValue(11);
        hand[6].setSuit("Hearts");
       
        Scanner input = new Scanner(System.in);
        System.out.println("Pick a card: ");
        int userValue = input.nextInt();
        String userSuit = input.nextLine();
        for (Card hand1 : hand)
        {
            if (hand1.getValue() == userValue && hand1.getSuit().equals(userSuit))
            {
                printInfo();
            } //end of if
        } //end of for

        for(int i = 0; i < hand.length; i++)
        {
            Card card = new Card();
            
            //card.value(insert call to random number generator here);
            //card.suit(Card.suit[insert call to random number between 0-3 here]);
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
        }
        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        // Then loop through the cards in the array to see if there's a match.
        
        // If the guess is successful, invoke the printInfo() method below.
    }
    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Zain Khan - Wed, Feb 1, 2023
     */
    private static void printInfo()
    {
        System.out.println("Congratulations, you guessed correctly!");
        System.out.println();
        
        System.out.println("My name is Zain, but you can call me Zainer.");
        System.out.println();
        
        System.out.println("How I'm doing in Sheridan: ");
        System.out.println("- Trying to study and have more time doing assignments.");
        System.out.println("- I Have a semester without any violations of academic integrity!");
	System.out.println();	

        System.out.println("My hobbies: ");
        System.out.println("- I like to help people (if they're lost) with directions without maps");
        System.out.println("- I like to Watch TV, do some map editing on Waze Map.");
        System.out.println("- I hope to ride a motorcycle one day.");
        System.out.println();
    }
}
