package blackJackPackage;

import javax.swing.*;	// Needed for Swing classes

import java.awt.*;
import java.awt.event.*;

public class FirstBlackJackWindow extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6169167571604187021L;
	private JPanel playerAndDealerPanel1;
	private JPanel playerAndDealerPanel2;
	private JPanel playerAndDealerPanel3;
	private JPanel playerAndDealerPanel4;
	private JPanel playerAndDealerPanel5;
	private JPanel playerAndDealerPanel6;
	private JPanel playerAndDealerPanel7;
	private JPanel playerAndDealerPanel8;
	private JPanel playerAndDealerPanel9;
	private JPanel playerAndDealerPanel10;
	private JPanel playerAndDealerPanel11;
	private JPanel playerAndDealerPanel12;
	private JPanel playerAndDealerPanel13;
	private JPanel playerAndDealerPanel14;
	private JPanel playerAndDealerPanel15;
	private JPanel playerAndDealerPanel16;
	private JPanel playerAndDealerPanel17;
	private JPanel playerAndDealerPanel18;
	private JPanel playerAndDealerPanel19;
	private JPanel playerAndDealerPanel20;
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
	
	BlackJackDeck blackJackDeck = new BlackJackDeck();
	private boolean GAME_OVER = true;
	private int playerHitCount = 0;
	private int playerHandTotal = 0, 
				dealerHandTotal = 0;
	private BlackJackCard currentCard = new BlackJackCard('s', 0);
	private BlackJackCard playersFirstCard = new BlackJackCard('s', 0);
	private BlackJackCard dealersFirstCard = new BlackJackCard('s', 0);
	private BlackJackCard playersSecondCard = new BlackJackCard('s', 0);
	private BlackJackCard dealersSecondCard = new BlackJackCard('s', 0);
	private BlackJackCard playersThirdCard = new BlackJackCard('s', 0);
	private BlackJackCard dealersThirdCard = new BlackJackCard('s', 0);
	private BlackJackCard playersFourthCard = new BlackJackCard('s', 0);
	private BlackJackCard dealersFourthCard = new BlackJackCard('s', 0);
	private BlackJackCard playersFifthCard = new BlackJackCard('s', 0);
	private BlackJackCard dealersFifthCard = new BlackJackCard('s', 0);
	private BlackJackCard playersSixthCard = new BlackJackCard('s', 0);
	private BlackJackCard dealersSixthCard = new BlackJackCard('s', 0);
	private BlackJackCard playersSeventhCard = new BlackJackCard('s', 0);
	private BlackJackCard dealersSeventhCard = new BlackJackCard('s', 0);
	
	public FirstBlackJackWindow()
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
		add(playerAndDealerPanel1);
		add(playerAndDealerPanel2);
		add(playerAndDealerPanel3);
		add(playerAndDealerPanel4);
		add(playerAndDealerPanel5);
		add(playerAndDealerPanel6);
		add(playerAndDealerPanel7);
		add(playerAndDealerPanel8);
		add(playerAndDealerPanel9);
		add(playerAndDealerPanel10);
		add(playerAndDealerPanel11);
		add(playerAndDealerPanel12);
		add(playerAndDealerPanel13);
		add(playerAndDealerPanel14);
		add(playerAndDealerPanel15);
		add(playerAndDealerPanel16);
		add(playerAndDealerPanel17);
		add(playerAndDealerPanel18);
		add(playerAndDealerPanel19);
		add(playerAndDealerPanel20);
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
			if(playersFirstCard.getCardValue() == playersSecondCard.getCardValue()){
				splitButton.setEnabled(true);
			}
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
		playerAndDealerPanel1 = new JPanel();
		playerAndDealerPanel2 = new JPanel();
		playerAndDealerPanel3 = new JPanel();
		playerAndDealerPanel4 = new JPanel();
		playerAndDealerPanel5 = new JPanel();
		playerAndDealerPanel6 = new JPanel();
		playerAndDealerPanel7 = new JPanel();
		playerAndDealerPanel8 = new JPanel();
		playerAndDealerPanel9 = new JPanel();
		playerAndDealerPanel10 = new JPanel();
		playerAndDealerPanel11 = new JPanel();
		playerAndDealerPanel12 = new JPanel();
		playerAndDealerPanel13 = new JPanel();
		playerAndDealerPanel14 = new JPanel();
		playerAndDealerPanel15 = new JPanel();
		playerAndDealerPanel16 = new JPanel();
		playerAndDealerPanel17 = new JPanel();
		playerAndDealerPanel18 = new JPanel();
		playerAndDealerPanel19 = new JPanel();
		playerAndDealerPanel20 = new JPanel();
		// Add the labels and buttons to the panel.
		// Player
		playerAndDealerPanel1.add(playerLabel);
		playerAndDealerPanel2.add(playerTotalLabel);
		playerAndDealerPanel3.add(playerFirstLabel);
		playerAndDealerPanel4.add(playerSecondLabel);
		playerAndDealerPanel5.add(playerThirdLabel);
		playerAndDealerPanel6.add(playerFourthLabel);
		playerAndDealerPanel7.add(playerFifthLabel);
		playerAndDealerPanel8.add(playerSixthLabel);
		playerAndDealerPanel9.add(playerSeventhLabel);
		playerAndDealerPanel10.add(playerEighthLabel);
		// Dealer
		playerAndDealerPanel11.add(dealerLabel);
		playerAndDealerPanel12.add(dealerTotalLabel);
		playerAndDealerPanel13.add(dealerFirstLabel);
		playerAndDealerPanel14.add(dealerSecondLabel);
		playerAndDealerPanel15.add(dealerThirdLabel);
		playerAndDealerPanel16.add(dealerFourthLabel);
		playerAndDealerPanel17.add(dealerFifthLabel);
		playerAndDealerPanel18.add(dealerSixthLabel);
		playerAndDealerPanel19.add(dealerSeventhLabel);
		playerAndDealerPanel20.add(dealerEighthLabel);
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
			if(dealersFirstCard.getCardValue() == 1)
			{
				playerHitCount = -1;
				standButton.setText("Stand");
				hitButton.setText("Hit");
				if(dealersSecondCard.getCardValue() == 10)
				{
					hitButton.setEnabled(false);
					standButton.setEnabled(false);
					doubleButton.setEnabled(false);
					splitButton.setEnabled(false);
					dealerTotalLabel.setText(Integer.toString(dealerHandTotal));
					dealerSecondLabel.setText(dealersSecondCard.toString());
				}
			}
			// switch used to find which panel to place card
			switch(playerHitCount)
			{
			// Third Card
			case 0 : 
				playersThirdCard = blackJackDeck.drawCard();
				playerThirdLabel.setText(playersThirdCard.toString());
				playerHandTotal += playersThirdCard.getCardValue();
				playerTotalLabel.setText(Integer.toString(playerHandTotal));
				if(playerHandTotal < 11 && (playersFirstCard.getCardValue() == 1 || playersSecondCard.getCardValue() == 1 || 
						playersThirdCard.getCardValue() == 1))
					playerTotalLabel.setText(Integer.toString(playerHandTotal + 10) + "(" + Integer.toString(playerHandTotal) + ")");
				if(playerHandTotal == 21 || (playerHandTotal == 11 && (playersFirstCard.getCardValue() == 1 || playersSecondCard.getCardValue() == 1 || 
						playersThirdCard.getCardValue() == 1)))
					playerTotalLabel.setText("21");
				if(playerHandTotal >= 21 || (playerHandTotal == 11 && (playersFirstCard.getCardValue() == 1 || playersSecondCard.getCardValue() == 1 ||
						playersThirdCard.getCardValue() == 1)))
				{
					hitButton.setEnabled(false);
					standButton.setEnabled(false);
					doubleButton.setEnabled(false);
					splitButton.setEnabled(false);
					dealButton.setEnabled(true);
					playerHitCount = -1;
					if(playerHandTotal <= 21)
						dealTheDealer();
				}
				break;
			// Fourth Card
			case 1 :
				playersFourthCard = blackJackDeck.drawCard();
				playerFourthLabel.setText(playersFourthCard.toString());
				playerHandTotal += playersFourthCard.getCardValue();
				playerTotalLabel.setText(Integer.toString(playerHandTotal));
				if(playerHandTotal < 11 && (playersFirstCard.getCardValue() == 1 || playersSecondCard.getCardValue() == 1 || playersThirdCard.getCardValue() == 1 || 
						playersFourthCard.getCardValue() == 1))
					playerTotalLabel.setText(Integer.toString(playerHandTotal + 10) + "(" + Integer.toString(playerHandTotal) + ")");
				if(playerHandTotal == 21 || (playerHandTotal == 11 && (playersFirstCard.getCardValue() == 1 || playersSecondCard.getCardValue() == 1 || 
						playersThirdCard.getCardValue() == 1 || playersFourthCard.getCardValue() == 1)))
					playerTotalLabel.setText("21");
				if(playerHandTotal >= 21 || (playerHandTotal == 11 && (playersFirstCard.getCardValue() == 1 || playersSecondCard.getCardValue() == 1 ||
						playersThirdCard.getCardValue() == 1 || playersFourthCard.getCardValue() == 1)))
				{
					hitButton.setEnabled(false);
					standButton.setEnabled(false);
					doubleButton.setEnabled(false);
					splitButton.setEnabled(false);
					dealButton.setEnabled(true);
					playerHitCount = -1;
					if(playerHandTotal <= 21)
						dealTheDealer();
				}
				break;
			// Fifth Card
			case 2 :
				playersFifthCard = blackJackDeck.drawCard();
				playerFifthLabel.setText(playersFifthCard.toString());
				playerHandTotal += playersFifthCard.getCardValue();
				playerTotalLabel.setText(Integer.toString(playerHandTotal));
				if(playerHandTotal < 11 && (playersFirstCard.getCardValue() == 1 || playersSecondCard.getCardValue() == 1 || 
						playersThirdCard.getCardValue() == 1 || playersFourthCard.getCardValue() == 1 || playersFifthCard.getCardValue() == 1))
					playerTotalLabel.setText(Integer.toString(playerHandTotal + 10) + "(" + Integer.toString(playerHandTotal) + ")");
				if(playerHandTotal == 21 || (playerHandTotal == 11 && (playersFirstCard.getCardValue() == 1 || playersSecondCard.getCardValue() == 1 || 
						playersThirdCard.getCardValue() == 1 || playersFourthCard.getCardValue() == 1 || playersFifthCard.getCardValue() == 1)))
					playerTotalLabel.setText("21");
				if(playerHandTotal >= 21 || (playerHandTotal == 11 && (playersFirstCard.getCardValue() == 1 || playersSecondCard.getCardValue() == 1 ||
						playersThirdCard.getCardValue() == 1 || playersFourthCard.getCardValue() == 1 || playersFifthCard.getCardValue() == 1)))
				{
					hitButton.setEnabled(false);
					dealButton.setEnabled(true);
					standButton.setEnabled(false);
					doubleButton.setEnabled(false);
					splitButton.setEnabled(false);
					playerHitCount = -1;
					if(playerHandTotal <= 21)
						dealTheDealer();
				}
				break;
			// Sixth Card
			case 3 :
				playersSixthCard = blackJackDeck.drawCard();
				playerSixthLabel.setText(playersSixthCard.toString());
				playerHandTotal += playersSixthCard.getCardValue();
				playerTotalLabel.setText(Integer.toString(playerHandTotal));
				if(playerHandTotal < 11 && (playersFirstCard.getCardValue() == 1 || playersSecondCard.getCardValue() == 1 || 
						playersThirdCard.getCardValue() == 1 || playersFourthCard.getCardValue() == 1 || playersFifthCard.getCardValue() == 1 || 
						playersSixthCard.getCardValue() == 1))
					playerTotalLabel.setText(Integer.toString(playerHandTotal + 10) + "(" + Integer.toString(playerHandTotal) + ")");
				if(playerHandTotal == 21 || (playerHandTotal == 11 && (playersFirstCard.getCardValue() == 1 || playersSecondCard.getCardValue() == 1 || 
						playersThirdCard.getCardValue() == 1 || playersFourthCard.getCardValue() == 1 || playersFifthCard.getCardValue() == 1 || 
						playersSixthCard.getCardValue() == 1)))
					playerTotalLabel.setText("21");
				if(playerHandTotal >= 21 || (playerHandTotal == 11 && (playersFirstCard.getCardValue() == 1 || playersSecondCard.getCardValue() == 1 ||
						playersThirdCard.getCardValue() == 1 || playersFourthCard.getCardValue() == 1 || playersFifthCard.getCardValue() == 1 ||
						playersSixthCard.getCardValue() == 1)))
				{
					hitButton.setEnabled(false);
					dealButton.setEnabled(true);
					standButton.setEnabled(false);
					doubleButton.setEnabled(false);
					splitButton.setEnabled(false);
					playerHitCount = -1;
					if(playerHandTotal <= 21)
						dealTheDealer();
				}
				break;
			// Seventh Card
			case 4 :
				playersSeventhCard = blackJackDeck.drawCard();
				playerSeventhLabel.setText(playersSeventhCard.toString());
				playerHandTotal += playersSeventhCard.getCardValue();
				playerTotalLabel.setText(Integer.toString(playerHandTotal));
				// If there is an ace in the hand
				if(playerHandTotal < 11 && (playersFirstCard.getCardValue() == 1 || playersSecondCard.getCardValue() == 1 || 
						playersThirdCard.getCardValue() == 1 || playersFourthCard.getCardValue() == 1 || playersFifthCard.getCardValue() == 1 || 
						playersSixthCard.getCardValue() == 1 || playersSeventhCard.getCardValue() == 1))
					playerTotalLabel.setText(Integer.toString(playerHandTotal + 10) + "(" + Integer.toString(playerHandTotal) + ")");
				if(playerHandTotal == 21 || (playerHandTotal == 11 && (playersFirstCard.getCardValue() == 1 || playersSecondCard.getCardValue() == 1 || 
						playersThirdCard.getCardValue() == 1 || playersFourthCard.getCardValue() == 1 || playersFifthCard.getCardValue() == 1 || 
						playersSixthCard.getCardValue() == 1 || playersSeventhCard.getCardValue() == 1)))
					playerTotalLabel.setText("21");
				hitButton.setEnabled(false);
				standButton.setEnabled(false);
				doubleButton.setEnabled(false);
				splitButton.setEnabled(false);
				dealButton.setEnabled(true);
				playerHitCount = -1;
				if(playerHandTotal <= 21)
					dealTheDealer();
				break;
			}
			// Dealer has blackjack
			if(dealersFirstCard.getCardValue() == 1 && dealersSecondCard.getCardValue() == 10)
			{
				standButton.setText("Stand");
				hitButton.setText("Hit");
			}

			++playerHitCount;
		}
	}
	/**
	 * Private inner class that handles the event when the user
	 * clicks the Hit button.
	 */
	
	private void dealTheDealer()// need to change this to 11 instead of one
	/**
	 * 
	 *
	 */
	{
		hitButton.setEnabled(false);
		standButton.setEnabled(false);
		doubleButton.setEnabled(false);
		splitButton.setEnabled(false);
		
		playerHitCount = 0;
		
		dealerSecondLabel.setText(dealersSecondCard.toString());
		dealerTotalLabel.setText(Integer.toString(dealerHandTotal));
		if(dealerHandTotal < 11 && (dealersFirstCard.getCardValue() == 1 || dealersSecondCard.getCardValue() == 1))
			dealerTotalLabel.setText(Integer.toString(dealerHandTotal + 10) + "(" + Integer.toString(dealerHandTotal) + ")");
		
		// Hit third dealer card if dealer hand total is less than 17
		if((dealerHandTotal < 17 && (dealersFirstCard.getCardValue() != 1 && dealersSecondCard.getCardValue() != 1))
				|| (dealerHandTotal < 6 && (dealersFirstCard.getCardValue() == 1 || dealersSecondCard.getCardValue() == 1))
				|| (dealerHandTotal < 17 && dealerHandTotal > 11 && (dealersFirstCard.getCardValue() == 1 || dealersSecondCard.getCardValue() == 1)))
		{
			dealersThirdCard = blackJackDeck.drawCard();
			dealerHandTotal += dealersThirdCard.getCardValue();
			dealerThirdLabel.setText(dealersThirdCard.getCardName());
			dealerTotalLabel.setText(Integer.toString(dealerHandTotal)); // need cases for aces
			if(dealerHandTotal < 11 && (dealersFirstCard.getCardValue() == 1 || dealersSecondCard.getCardValue() == 1 || 
					dealersThirdCard.getCardValue() == 1))
				dealerTotalLabel.setText(Integer.toString(dealerHandTotal + 10) + "(" + Integer.toString(dealerHandTotal) + ")");
			// Hit fourth dealer card if dealer hand total is less than 17
			if((dealerHandTotal < 17 && (dealersFirstCard.getCardValue() != 1 && dealersSecondCard.getCardValue() != 1 &&
					dealersThirdCard.getCardValue() != 1))
					|| (dealerHandTotal < 6 && (dealersFirstCard.getCardValue() == 1 || dealersSecondCard.getCardValue() == 1 ||
					dealersThirdCard.getCardValue() == 1))
					|| (dealerHandTotal < 17 && dealerHandTotal > 11 && (dealersFirstCard.getCardValue() == 1 || dealersSecondCard.getCardValue() == 1 ||
							dealersThirdCard.getCardValue() == 1)))
			{
				dealersFourthCard = blackJackDeck.drawCard();
				dealerHandTotal += dealersFourthCard.getCardValue();
				dealerFourthLabel.setText(dealersFourthCard.getCardName());
				dealerTotalLabel.setText(Integer.toString(dealerHandTotal));
				if(dealerHandTotal < 11 && (dealersFirstCard.getCardValue() == 1 || dealersSecondCard.getCardValue() == 1 || 
						dealersThirdCard.getCardValue() == 1 || dealersFourthCard.getCardValue() == 1))
					dealerTotalLabel.setText(Integer.toString(dealerHandTotal + 10) + "(" + Integer.toString(dealerHandTotal) + ")");
				// Hit fifth dealer card if dealer hand is less than 17
				if(dealerHandTotal < 17 && (dealersFirstCard.getCardValue() != 1 && dealersSecondCard.getCardValue() != 1 &&
						dealersThirdCard.getCardValue() != 1 && dealersFourthCard.getCardValue() != 1) 
						|| (dealerHandTotal < 6 && (dealersFirstCard.getCardValue() == 1 || dealersSecondCard.getCardValue() == 1 ||
						dealersThirdCard.getCardValue() == 1 || dealersFourthCard.getCardValue() == 1))
						|| (dealerHandTotal < 17 && dealerHandTotal > 11 && (dealersFirstCard.getCardValue() == 1 || dealersSecondCard.getCardValue() == 1 ||
							dealersThirdCard.getCardValue() == 1 || dealersFourthCard.getCardValue() == 1)))
				{
					dealersFifthCard = blackJackDeck.drawCard();
					dealerHandTotal += dealersFifthCard.getCardValue();
					dealerFifthLabel.setText(dealersFifthCard.getCardName());
					dealerTotalLabel.setText(Integer.toString(dealerHandTotal)); // need cases for aces
					if(dealerHandTotal < 11 && (dealersFirstCard.getCardValue() == 1 || dealersSecondCard.getCardValue() == 1 || 
							dealersThirdCard.getCardValue() == 1 || dealersFourthCard.getCardValue() == 1 || dealersFifthCard.getCardValue() == 1))
						dealerTotalLabel.setText(Integer.toString(dealerHandTotal + 10) + "(" + Integer.toString(dealerHandTotal) + ")");
					// Hit sixth dealer card if dealer hand is less than 17
					if(dealerHandTotal < 17 && (dealersFirstCard.getCardValue() != 1 && dealersSecondCard.getCardValue() != 1 &&
							dealersThirdCard.getCardValue() != 1 && dealersFourthCard.getCardValue() != 1 && dealersFifthCard.getCardValue() != 1)
							|| (dealerHandTotal < 6 && (dealersFirstCard.getCardValue() == 1 || dealersSecondCard.getCardValue() == 1 ||
							dealersThirdCard.getCardValue() == 1 || dealersFourthCard.getCardValue() == 1 || dealersFifthCard.getCardValue() == 1))
							|| (dealerHandTotal < 17 && dealerHandTotal > 11 && (dealersFirstCard.getCardValue() == 1 || dealersSecondCard.getCardValue() == 1 ||
							dealersThirdCard.getCardValue() == 1 || dealersFourthCard.getCardValue() == 1 || dealersFifthCard.getCardValue() == 1)))
					{
						dealersSixthCard = blackJackDeck.drawCard();
						dealerHandTotal += dealersSixthCard.getCardValue();
						dealerSixthLabel.setText(dealersSixthCard.getCardName());
						dealerTotalLabel.setText(Integer.toString(dealerHandTotal)); // need cases for aces
						if(dealerHandTotal < 11 && (dealersFirstCard.getCardValue() == 1 || dealersSecondCard.getCardValue() == 1 || 
								dealersThirdCard.getCardValue() == 1 || dealersFourthCard.getCardValue() == 1 || dealersFifthCard.getCardValue() == 1 ||
								dealersSixthCard.getCardValue() == 1))
							dealerTotalLabel.setText(Integer.toString(dealerHandTotal + 10) + "(" + Integer.toString(dealerHandTotal) + ")");
						// Hit seventh dealer card if dealer hand is less than 17
						if(dealerHandTotal < 17 && (dealersFirstCard.getCardValue() != 1 && dealersSecondCard.getCardValue() != 1 &&
								dealersThirdCard.getCardValue() != 1 && dealersFourthCard.getCardValue() != 1 && dealersFifthCard.getCardValue() != 1 &&
								dealersSixthCard.getCardValue() != 1)
								|| (dealerHandTotal < 6 && (dealersFirstCard.getCardValue() == 1 || dealersSecondCard.getCardValue() == 1 ||
								dealersThirdCard.getCardValue() == 1 || dealersFourthCard.getCardValue() == 1 || dealersFifthCard.getCardValue() == 1 ||
								dealersSixthCard.getCardValue() == 1))
								|| (dealerHandTotal < 17 && dealerHandTotal > 11 && (dealersFirstCard.getCardValue() == 1 || dealersSecondCard.getCardValue() == 1 ||
								dealersThirdCard.getCardValue() == 1 || dealersFourthCard.getCardValue() == 1 || dealersFifthCard.getCardValue() == 1 ||
								dealersSixthCard.getCardValue() == 1)))
						{
							dealersSeventhCard = blackJackDeck.drawCard();
							dealerHandTotal += dealersSixthCard.getCardValue();
							dealerSeventhLabel.setText(dealersSeventhCard.getCardName());
							dealerTotalLabel.setText(Integer.toString(dealerHandTotal)); // need cases for aces
							if(dealerHandTotal < 11 && (dealersFirstCard.getCardValue() == 1 || dealersSecondCard.getCardValue() == 1 || 
									dealersThirdCard.getCardValue() == 1 || dealersFourthCard.getCardValue() == 1 || dealersFifthCard.getCardValue() == 1 ||
									dealersSixthCard.getCardValue() == 1 || dealersSeventhCard.getCardValue() == 1))
								dealerTotalLabel.setText(Integer.toString(dealerHandTotal + 10) + "(" + Integer.toString(dealerHandTotal) + ")");
						}
					}
				}
			}
		}
	}
	
	private class StandButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if(dealersFirstCard.getCardValue() == 1)
			{
				standButton.setText("Stand");
				hitButton.setText("Hit");
				if(dealersSecondCard.getCardValue() == 10)
				{
					hitButton.setEnabled(false);
					standButton.setEnabled(false);
					doubleButton.setEnabled(false);
					splitButton.setEnabled(false);
					dealerTotalLabel.setText(Integer.toString(dealerHandTotal));
					dealerSecondLabel.setText(dealersSecondCard.toString());
				}
			}
			else if(dealerHandTotal != 11 || (dealerHandTotal == 11 && dealersFirstCard.getCardValue() != 1 && dealersSecondCard.getCardValue() != 1))
				dealTheDealer();
			dealButton.setEnabled(true);
			
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
			playerHandTotal = 0;
			dealerHandTotal = 0;
			playerHitCount = 0;
			
			if(blackJackDeck.getIndex() > 52 - 14)
				// New deck is created and shuffled.
				blackJackDeck = new BlackJackDeck();
			
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
			currentCard = blackJackDeck.drawCard();
			playerHandTotal += currentCard.getCardValue();
			playersFirstCard = currentCard;
			playerFirstLabel.setText(playersFirstCard.toString());
			playerTotalLabel.setText(Integer.toString(playerHandTotal));
			if(playersFirstCard.getCardValue() == 11)
				playerTotalLabel.setText(Integer.toString(playerHandTotal) + "(1)");
						
			// 2. Dealer is dealt first card.
			currentCard = blackJackDeck.drawCard();
			dealerHandTotal += currentCard.getCardValue();
			dealersFirstCard = currentCard;
			dealerFirstLabel.setText(dealersFirstCard.toString());
			dealerTotalLabel.setText(Integer.toString(dealerHandTotal));
			if(dealersFirstCard.getCardValue() == 11)
				dealerTotalLabel.setText("11(" + Integer.toString(dealerHandTotal) + ")");
			
			// 3. Player is dealt second card.
			currentCard = blackJackDeck.drawCard();
			playerHandTotal += currentCard.getCardValue();
			playersSecondCard = currentCard;
			playerSecondLabel.setText(playersSecondCard.toString());
			playerTotalLabel.setText(Integer.toString(playerHandTotal));
			if(playersSecondCard.getCardValue() == 11 || playersFirstCard.getCardValue() == 11)
				playerTotalLabel.setText(Integer.toString(playerHandTotal) + "(" + Integer.toString(playerHandTotal - 10) + ")");
			
			// 4. Dealer is dealt hidden second card.
			currentCard = blackJackDeck.drawCard();
			dealersSecondCard = currentCard;
			dealerHandTotal += currentCard.getCardValue();
			dealersSecondCard = currentCard;
			dealerSecondLabel.setText("Hidden Card");
						
			// dealer has blackjack
			if(dealersFirstCard.getCardValue() == 11)
			{
				dealerTotalLabel.setText("Insurance?");
				hitButton.setEnabled(true);
				hitButton.setText("Yes");
				standButton.setEnabled(true);
				standButton.setText("No");
				if(dealersFirstCard.getCardValue() == 11)//here maybe where dealer has blackjack?
				{
					
					splitButton.setEnabled(false);
					doubleButton.setEnabled(false);
					dealButton.setEnabled(true);
					// insurance??
				}
			}
						
			// Case for Player BlackJack
			else if(playerHandTotal == 11 && (playersSecondCard.getCardValue() == 11 || playersFirstCard.getCardValue() == 11))
			{
				playerTotalLabel.setText("21");
				hitButton.setEnabled(false);
				standButton.setEnabled(false);
				splitButton.setEnabled(false);
				doubleButton.setEnabled(false);
				dealButton.setEnabled(true);
				// player wins
			}
			else dealButton.setEnabled(false);
			
		}
	}
	public void main(String[] args) {
		
		new FirstBlackJackWindow();

		

	/* 	// Print entire deck
		for(int i = 0; i < 52; ++i)
		{
			currentCard = blackJackDeck.drawCard();
			System.out.println(currentCard);
		}
	*/
	}
}
