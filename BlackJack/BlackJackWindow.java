package blackJackPackage;

import javax.swing.*;	// Needed for Swing classes

import java.awt.*;
import java.awt.event.*;

public class BlackJackWindow extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6169167571604187021L;
	private JPanel playerNamePanel;
	private JPanel dealerNamePanel;
	private JPanel playerTotalPanel;
	private JPanel dealerTotalPanel;
	private JPanel playerFirstPanel;
	private JPanel playerSecondPanel;
	private JPanel playerThirdPanel;
	private JPanel playerFourthPanel;
	private JPanel playerFifthPanel;
	private JPanel playerSixthPanel;
	private JPanel playerSeventhPanel;
	private JPanel playerEighthPanel;
	private JPanel dealerFirstPanel;
	private JPanel dealerSecondPanel;
	private JPanel dealerThirdPanel;
	private JPanel dealerFourthPanel;
	private JPanel dealerFifthPanel;
	private JPanel dealerSixthPanel;
	private JPanel dealerSeventhPanel;
	private JPanel dealerEighthPanel;
	private JPanel buttonPanel;
	
	private JLabel playerLabel;
	private JLabel dealerLabel;
	private JLabel playerTotalLabel;
	private JLabel dealerTotalLabel;
	private JLabel playerFirstLabel;
	private JLabel playerSecondLabel;
	private JLabel playerThirdLabel;
	private JLabel playerFourthLabel;
	private JLabel playerFifthLabel;
	private JLabel playerSixthLabel;
	private JLabel playerSeventhLabel;
	private JLabel playerEighthLabel;
	private JLabel dealerFirstLabel;
	private JLabel dealerSecondLabel;
	private JLabel dealerThirdLabel;
	private JLabel dealerFourthLabel;
	private JLabel dealerFifthLabel;
	private JLabel dealerSixthLabel;
	private JLabel dealerSeventhLabel;
	private JLabel dealerEighthLabel;
	private JButton hitButton;
	private JButton standButton;
	private JButton doubleButton;
	private JButton splitButton;
	private JButton dealButton;
	private final int WINDOW_WIDTH  = 600, // Window width in pixels
		  			  WINDOW_HEIGHT = 750; // Window height in pixels
	
	SevenBlackJackDecks blackJackDeck = new SevenBlackJackDecks();
	private PlayerInterface human = new HumanPlayer();
	private PlayerInterface dealer = new DealerPlayer();
	private Integer humanCardIndex, dealerCardIndex;
	
	private boolean GAME_OVER = true;
	
	
	public BlackJackWindow()
	{
		// Call the JFrame constructor and pass the title.
		super("BlackJack");
		// Set the size of this window.
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		// Specify what happens when the close button is clicked.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Add a GridLayout manager to the content pane.
		setLayout(new GridLayout(0, 2));
		// Build the panel.
		buildPlayerAndDealerPanel();
		buildButtonPanel();
		// Add the panel to the frame's content pane.
		add(playerNamePanel);
		add(playerTotalPanel);
		add(playerFirstPanel);
		add(playerSecondPanel);
		add(playerThirdPanel);
		add(playerFourthPanel);
		add(playerFifthPanel);
		add(playerSixthPanel);
		add(playerSeventhPanel);
		add(playerEighthPanel);
		add(dealerNamePanel);
		add(dealerTotalPanel);
		add(dealerFirstPanel);
		add(dealerSecondPanel);
		add(dealerThirdPanel);
		add(dealerFourthPanel);
		add(dealerFifthPanel);
		add(dealerSixthPanel);
		add(dealerSeventhPanel);
		add(dealerEighthPanel);
		add(buttonPanel, BorderLayout.SOUTH);
		// Display the window.
		setVisible(true);
		hitButton.setEnabled(false);
		standButton.setEnabled(false);
		doubleButton.setEnabled(false);
		splitButton.setEnabled(false);
		// Enable/Disable buttons
		if(playerTotalLabel.equals("0")){
			hitButton.setEnabled(false);
			standButton.setEnabled(false);
			doubleButton.setEnabled(false);
			splitButton.setEnabled(false);
		}
		else if(!playerTotalLabel.equals("0") && GAME_OVER == false){
			
			splitButton.setEnabled(false);
			
		}
	}
	
	private void buildPlayerAndDealerPanel()
	{
		// Create label and button components.
		// Player
		playerLabel = new JLabel("You: ");
		playerTotalLabel = new JLabel("0");
		playerFirstLabel = new JLabel("");
		playerSecondLabel = new JLabel("");
		playerThirdLabel = new JLabel("");
		playerFourthLabel = new JLabel("");
		playerFifthLabel = new JLabel("");
		playerSixthLabel = new JLabel("");
		playerSeventhLabel = new JLabel("");
		playerEighthLabel = new JLabel("");
		// Dealer
		dealerLabel = new JLabel("Dealer: ");
		dealerTotalLabel = new JLabel("0");
		dealerFirstLabel = new JLabel("");
		dealerSecondLabel = new JLabel("");
		dealerThirdLabel = new JLabel("");
		dealerFourthLabel = new JLabel("");
		dealerFifthLabel = new JLabel("");
		dealerSixthLabel = new JLabel("");
		dealerSeventhLabel = new JLabel("");
		dealerEighthLabel = new JLabel("");
		// Create a panel to hold the components.
		playerNamePanel = new JPanel();
		dealerNamePanel = new JPanel();
		playerTotalPanel = new JPanel();
		dealerTotalPanel = new JPanel();
		playerFirstPanel = new JPanel();
		playerSecondPanel = new JPanel();
		playerThirdPanel = new JPanel();
		playerFourthPanel = new JPanel();
		playerFifthPanel = new JPanel();
		playerSixthPanel = new JPanel();
		playerSeventhPanel = new JPanel();
		playerEighthPanel = new JPanel();
		dealerFirstPanel = new JPanel();
		dealerSecondPanel = new JPanel();
		dealerThirdPanel = new JPanel();
		dealerFourthPanel = new JPanel();
		dealerFifthPanel = new JPanel();
		dealerSixthPanel = new JPanel();
		dealerSeventhPanel = new JPanel();
		dealerEighthPanel = new JPanel();
		// Add the labels and buttons to the panel.
		// Player
		playerNamePanel.add(playerLabel);
		playerTotalPanel.add(playerTotalLabel);
		playerFirstPanel.add(playerFirstLabel);
		playerSecondPanel.add(playerSecondLabel);
		playerThirdPanel.add(playerThirdLabel);
		playerFourthPanel.add(playerFourthLabel);
		playerFifthPanel.add(playerFifthLabel);
		playerSixthPanel.add(playerSixthLabel);
		playerSeventhPanel.add(playerSeventhLabel);
		playerEighthPanel.add(playerEighthLabel);
		// Dealer
		dealerNamePanel.add(dealerLabel);
		dealerTotalPanel.add(dealerTotalLabel);
		dealerFirstPanel.add(dealerFirstLabel);
		dealerSecondPanel.add(dealerSecondLabel);
		dealerThirdPanel.add(dealerThirdLabel);
		dealerFourthPanel.add(dealerFourthLabel);
		dealerFifthPanel.add(dealerFifthLabel);
		dealerSixthPanel.add(dealerSixthLabel);
		dealerSeventhPanel.add(dealerSeventhLabel);
		dealerEighthPanel.add(dealerEighthLabel);
	}
	
	private void buildButtonPanel()
	{
		// Create label and button components.
		hitButton = new JButton("Hit");
		standButton = new JButton("Stand");
		doubleButton = new JButton("Double");
		splitButton = new JButton("Split");
		dealButton = new JButton("Deal");
		// Add action listeners to the buttons.
		hitButton.addActionListener(new HitButtonListener());
		standButton.addActionListener(new StandButtonListener());
		doubleButton.addActionListener(new DoubleButtonListener());
		splitButton.addActionListener(new SplitButtonListener());
		dealButton.addActionListener(new DealButtonListener());
		// Create a panel to hold the components.
		buttonPanel = new JPanel();
		// Add the labels and buttons to the panel.
		buttonPanel.add(hitButton);
		buttonPanel.add(standButton);
		buttonPanel.add(doubleButton);
		buttonPanel.add(splitButton);
		buttonPanel.add(dealButton);
	}
	/**
	 * Private inner class that handles the event when the user
	 * clicks the Hit button.
	 */
		
	private class HitButtonListener implements ActionListener
	{
		
		public void actionPerformed(ActionEvent e)
		{
			
		}
	}
	/**
	 * Private inner class that handles the event when the user
	 * clicks the Hit button.
	 */
	
	private void dealTheDealer()
	/**
	 * 
	 *
	 */
	
	// NOT WORKING CORRECTLY AFTER INSURANCE
	{
		hitButton.setEnabled(false);
		standButton.setEnabled(false);
		doubleButton.setEnabled(false);
		splitButton.setEnabled(false);
		dealButton.setEnabled(true);
		
		dealerTotalLabel.setText(dealer.getTotalScoreToString());
		dealerSecondLabel.setText(dealer.toStringAtIndex(dealerCardIndex));
		
		while(!dealer.isStanding()){
			dealer.hit(blackJackDeck.drawCard());
			dealerCardIndex++;
			switch(dealerCardIndex){
				case 2 : 
					dealerThirdLabel.setText(dealer.toStringAtIndex(dealerCardIndex));
					dealerTotalLabel.setText(dealer.getTotalScoreToString());
					break;
				case 3 : 
					dealerFourthLabel.setText(dealer.toStringAtIndex(dealerCardIndex));
					dealerTotalLabel.setText(dealer.getTotalScoreToString());
					break;
				case 4 : 
					dealerFifthLabel.setText(dealer.toStringAtIndex(dealerCardIndex));
					dealerTotalLabel.setText(dealer.getTotalScoreToString());
					break;
				case 5 : 
					dealerSixthLabel.setText(dealer.toStringAtIndex(dealerCardIndex));
					dealerTotalLabel.setText(dealer.getTotalScoreToString());
					break;
				case 6 : 
					dealerSeventhLabel.setText(dealer.toStringAtIndex(dealerCardIndex));
					dealerTotalLabel.setText(dealer.getTotalScoreToString());
					break;
			}
		}
		
	}
	
	private class StandButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if(dealer.insurance())
			{
				standButton.setText("Stand");
				hitButton.setText("Hit");
				dealerSeventhLabel.setText("");
				doubleButton.setEnabled(true);
				splitButton.setEnabled(true);
				if(dealer.getTotalScoreInt() == 21)
				{
					dealerTotalLabel.setText(dealer.getTotalScoreToString());
					dealerSecondLabel.setText(dealer.toStringAtIndex(dealerCardIndex));
					hitButton.setEnabled(false);
					standButton.setEnabled(false);
					doubleButton.setEnabled(false);
					splitButton.setEnabled(false);
					dealButton.setEnabled(true);
					if(human.getTotalScoreInt() != 21)
						playerEighthLabel.setText("Dealer Wins");
					else
						playerEighthLabel.setText("You Win!!!");
				}
			}
			else 
				dealTheDealer();
			
			
		}
	}
	/**
	 * Private inner class that handles the event when the user
	 * clicks the Hit button.
	 */
	private class DoubleButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{

		}
	}
	/**
	 * Private inner class that handles the event when the user
	 * clicks the Hit button.
	 */
	private class SplitButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{

		}
	}
	/**
	 * Private inner class that handles the event when the user
	 * clicks the Hit button.
	 */
	private class DealButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if(blackJackDeck.getIndex() > (52 * 7) - 14)
				// New deck is created and shuffled.
				blackJackDeck = new SevenBlackJackDecks();
			humanCardIndex = -1;
			dealerCardIndex = -1;
			human.resetHand();
			dealer.resetHand();
			// Reset labels after game
			playerTotalLabel.setText("0");
			playerFirstLabel.setText("");
			playerSecondLabel.setText("");
			playerThirdLabel.setText("");
			playerFourthLabel.setText("");
			playerFifthLabel.setText("");
			playerSixthLabel.setText("");
			playerSeventhLabel.setText("");
			playerEighthLabel.setText("");
			// Dealer
			dealerTotalLabel.setText("0");
			dealerFirstLabel.setText("");
			dealerSecondLabel.setText("");
			dealerThirdLabel.setText("");
			dealerFourthLabel.setText("");
			dealerFifthLabel.setText("");
			dealerSixthLabel.setText("");
			dealerSeventhLabel.setText("");
			dealerEighthLabel.setText("");
			
			// Enable the game buttons
			hitButton.setEnabled(true);
			standButton.setEnabled(true);
			doubleButton.setEnabled(true);
			splitButton.setEnabled(true);
							
			// 1. Player is dealt first card.
			human.hit(blackJackDeck.drawCard());
			humanCardIndex++;
			playerFirstLabel.setText(human.toStringAtIndex(humanCardIndex));
			playerTotalLabel.setText(human.getTotalScoreToString());
						
			// 2. Dealer is dealt first card.
			dealer.hit(blackJackDeck.drawCard());
			dealerCardIndex++;
			dealerFirstLabel.setText(dealer.toStringAtIndex(dealerCardIndex));
			dealerTotalLabel.setText(dealer.getTotalScoreToString());
			
			// 3. Player is dealt second card.
			human.hit(blackJackDeck.drawCard());
			humanCardIndex++;
			playerSecondLabel.setText(human.toStringAtIndex(humanCardIndex));
			playerTotalLabel.setText(human.getTotalScoreToString());
			
			// 4. Dealer is dealt hidden second card.
			dealer.hit(blackJackDeck.drawCard());
			dealerCardIndex++;
			// do not show total of dealer's cards
			//dealerFirstLabel.setText(dealer.toStringAtIndex(1));
			//dealerTotalLabel.setText(dealer.getTotalScoreToString());
			
						
			// insurance
			if(dealer.insurance()){
				dealerSeventhLabel.setText("Insurance?");
				hitButton.setText("Yes");
				standButton.setText("No");
				doubleButton.setEnabled(false);
				splitButton.setEnabled(false);
				dealButton.setEnabled(false);				
			}
						
			// player has BlackJack and insurance is not required
			// OR dealer has blackjack and player does not and ace is hidden
			else if((dealer.getTotalScoreInt() == 21 || human.getTotalScoreInt() == 21) && !dealer.insurance())
			{
				dealerTotalLabel.setText(dealer.getTotalScoreToString());
				dealerSecondLabel.setText(dealer.toStringAtIndex(dealerCardIndex));
				hitButton.setEnabled(false);
				standButton.setEnabled(false);
				splitButton.setEnabled(false);
				doubleButton.setEnabled(false);
				dealButton.setEnabled(true);
				if(human.getTotalScoreInt() != 21)
					playerEighthLabel.setText("Dealer Wins");
				else
					playerEighthLabel.setText("You Win!!!");
			}
						
			else dealButton.setEnabled(false);
			
		}
	}
	
	public void main(String[] args) {
		new BlackJackWindow();
	}
}
