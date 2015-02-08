package blackJackPackage;

public interface PlayerInterface 
{
	Integer handTotal = 0;

	public Integer getTotalScoreInt();
	
	public String getTotalScoreToString();
	
	public void hit(BlackJackCard card);
	
	public void stand();
	
	public void resetHand();
	
	public boolean isStanding();
	
	public boolean handHasAnAce();
	
	public boolean insurance();
	
	public String toStringAtIndex(Integer i);
}
