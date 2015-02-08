package blackJackPackage;

public class HumanPlayer implements PlayerInterface {

	Integer handTotal = 0;
	private int handIndex = -1;
	BlackJackCard[] playerHand = new BlackJackCard[7];
	boolean stand = false;
	
	public HumanPlayer() 
	{
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

	public void hit(BlackJackCard card)
	{
		if(handIndex < 7 )
		{
			handTotal += card.getCardValue();
			handIndex++;
			playerHand[handIndex] = card;
		}
		else
			stand();
	}

	public void stand() 
	{
		stand = true;
	}
	
	public boolean isStanding()
	{
		return stand;
	}

	public boolean handHasAnAce(){
		boolean hasAce = false;
		for(int i = 0; i <= handIndex; i++)
			if(playerHand[i].getCardValue() == 11)
				hasAce = true;
		return hasAce;
	}
	
	public String toStringAtIndex(Integer i){
		return playerHand[i].toString();
	}

	@Override
	public boolean insurance() {
		// TODO Auto-generated method stub
		return false;
	}

	public void resetHand() {
		handTotal = 0;
		handIndex = -1;
		stand = false;
		for (int i = 0; i < 7; i++)
			playerHand[i] = null;
	}
}
