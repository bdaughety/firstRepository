package blackJackPackage;

import java.util.Arrays;
import java.util.Collections;

public class SevenBlackJackDecks extends BlackJackDeck {
	BlackJackCard[] cards = new BlackJackCard[364];
	int index = -1;
	public SevenBlackJackDecks() {
		
	    int numberOfDecks = 7;
	    int startingCardCount = 0;
	    
		// build deck
	    for (int j = 0; j < numberOfDecks; j++)
	    {
	        for (int i = 0; i < 52; i++) {
	            if (i<13) cards[i + startingCardCount] = new BlackJackCard('s',i);
	            else if (i<26) cards[i + startingCardCount] = new BlackJackCard('c',i-13);
	            else if (i<39) cards[i + startingCardCount] = new BlackJackCard('d',i-26);
	            else if (i<52) cards[i + startingCardCount] = new BlackJackCard('h',i-39);
	        }
	        startingCardCount += 52;
	    }
        // shuffle deck
        Collections.shuffle(Arrays.asList(cards));
	}
	
	public BlackJackCard drawCard() {
        index++;
        cards[index].drawn();
        return cards[index];
    }

}
