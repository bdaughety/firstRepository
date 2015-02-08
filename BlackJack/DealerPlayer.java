package blackJackPackage;

public class DealerPlayer implements PlayerInterface {
	
	Integer handTotal = 0;
	private int handIndex = -1;
	BlackJackCard[] dealerHand = new BlackJackCard[7];
	boolean stand = false;

	public DealerPlayer() {
		handTotal = 0;
	}
	
	public Integer getTotalScoreInt() {
		return handTotal;
	}
	
	public String getTotalScoreToString() 
	{
		if(handHasAnAce()) {
			Integer extra = handTotal - 10;
			return handTotal.toString() + " (" + extra.toString() + ")";
		}
		else return handTotal.toString();
	}

	public void hit(BlackJackCard card) {
		if(handIndex < 7 )
		{
			handTotal += card.getCardValue();
			handIndex++;
			dealerHand[handIndex] = card;
			if (handTotal >= 17 && !handHasAnAce())
				stand();
			else if (handTotal >= 27 && handHasAnAce())
				stand();
		}
		else
			stand();
	}

	public void stand() {
		stand = true;
	}

	public boolean isStanding() {
		return stand;
	}
	
	public boolean handHasAnAce(){
		boolean hasAce = false;
		for(int i = 0; i <= handIndex; i++)
			if(dealerHand[i].getCardValue() == 11)
				hasAce = true;
		return hasAce;
	}
		
	public String toStringAtIndex(Integer i){
		String returnString;
		returnString = dealerHand[i].toString();
		return returnString;
	}

	public boolean insurance() {
		if (dealerHand[0].getCardValue() == 11)
			return true;
		else return false;
	}
	
	public void resetHand() {
		handTotal = 0;
		handIndex = -1;
		stand = false;
		for (int i = 0; i < 7; i++)
			dealerHand[i] = null;
	}
}
