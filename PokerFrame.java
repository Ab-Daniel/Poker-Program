import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class PokerFrame extends JFrame
{
	
	public PokerFrame()
	{
		
		JFrame frame = new JFrame();
		frame.setSize(750, 250);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel controlPanel = new JPanel();
		JPanel displayPanel = new JPanel();
		area.setSize(750, 200);
		JScrollPane sp = new JScrollPane(area);
		
		//displayPanel.add(area);
		JButton testButton = makeButton("Poker Test");
		JButton simButton = makeButton("Poker Simulation");
		controlPanel.add(testButton);
		controlPanel.add(simButton);
		frame.add(controlPanel, BorderLayout.NORTH);
		//frame.add(displayPanel);
		frame.getContentPane().add(sp);
		//displayPanel.add(simulationButton);
		
	}
	
	public JButton makeButton(final String btnName)
	{
		JButton button = new JButton(btnName);		
		
		class ButtonListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{											
				if(btnName == "Poker Test")
				{
					PerformPokerTest();														
				}
				
				if(btnName == "Poker Simulation")
				{					
					PerformPokerSimulation();					
				}
				
			}
		}
		
		// set the action listener and return the button
		ActionListener listener = new ButtonListener();
		button.addActionListener(listener);
		return button;
		
	}
	

	
	private JTextArea area = new JTextArea();

	
	private void PerformPokerTest()
	{
		String c1 = null;
		String c2 = null;
		String c3 = null;
		String c4 = null;
		String c5 = null;
		
		Hand hand = new Hand();
		
		area.setText("");
		area.setFont(new Font("Courier New", Font.BOLD, 13));
		try
		{   
			FileReader reader = new FileReader("Cards.txt");   
			Scanner file = new Scanner(reader);   
			int handNumber = 0;   
			
			
			while(file.hasNextInt( ))   
			{        
				
				
					for(int i = 0; i < 5; i++)
					{
					
						int valueData = file.nextInt();
						int suiteData = file.nextInt();
					
						String valueString;
						switch (valueData) 
						{
			            	case 1:  valueString = "A ";
			            			break;
			            	case 2:  valueString = "2 ";
			                     	break;
			            	case 3:  valueString = "3 ";
			                     	break;
			            	case 4:  valueString = "4 ";
			            			break;
			            	case 5:  valueString = "5 ";
			                     	break;
			            	case 6:  valueString = "6 ";
			                     	break;
			            	case 7:  valueString = "7 ";
			                     	break;
			            	case 8:  valueString = "8 ";
			                     	break;
			            	case 9:  valueString = "9 ";
			                     	break;
			            	case 10: valueString = "10 ";
			                     	break;
			            	case 11: valueString = "J ";
			                     break;
			            	case 12: valueString = "Q ";
			                     	break;
			            	case 13:  valueString = "K ";
	                     			break;
			            	default: valueString = "oops, value";
			                     	break;
						}
			        
						String suiteString;
						switch (suiteData) 
						{
			            	case 1:  suiteString = "C ";
			                     	break;
			            	case 2:  suiteString = "D ";
			                     	break;
			            	case 3:  suiteString = "H ";
			                     	break; 
			            	case 4:  suiteString = "S ";
			                     	break;
			            	default: suiteString = "oops, suite";
			                     	break;
						}
			        
						if(i == 0)
						{
							c1 = valueString + suiteString;
							//System.out.println(c1);
						}
						if(i == 1)
						{
							c2 = valueString + suiteString;
							//System.out.println(c2);
						}
						if(i == 2)
						{
							c3 = valueString + suiteString;
							//System.out.println(c3);
						}
						if(i == 3)
						{
							c4 = valueString + suiteString;
							//System.out.println(c4);
						}
						if(i == 4)
						{
							c5 = valueString + suiteString;
							//System.out.println(c5);
						}
				
			        
			        //System.out.println(c1);
						
			        
					}
				
				//System.out.println(c1 + c2 + c3 + c4 + c5);
				//area.append();
					handNumber++;
				area.append(" \n hand " + handNumber + ": " + "|" + c1 + "|" + c2 + "|" + c3 + "|" + c4 + "|" + c5 + "|" + hand.evaluateHand(c1, c2, c3, c4, c5));
				
				
				
				///...
				
			}   
			file.close( );
			
		}
		
		catch (FileNotFoundException e)
		{   
			area.append(" Error processing file: " + e);
			
		}
	}
	
	private void PerformPokerSimulation()
	{
		
		Hand hand = new Hand();
		
		area.setText("");
		area.setFont(new Font("Courier New", Font.BOLD, 13));
		area.scrollRectToVisible(getBounds());
					
		try
		{
			
			FileReader reader = new FileReader("Deck.txt");   
			Scanner file = new Scanner(reader);   
			
			ArrayList<Card> deck = new ArrayList<Card>();
			
			ArrayList<Card> player1 = new ArrayList<Card>();
			ArrayList<Card> player2 = new ArrayList<Card>();
			ArrayList<Card> player3 = new ArrayList<Card>();
			ArrayList<Card> player4 = new ArrayList<Card>();
			
		//	deck.add(new Card(1,"C"));
			
		//	Collections.shuffle(deck);
						
			while(file.hasNextInt())
			{
				
				int valueData = file.nextInt();
				int suiteData = file.nextInt();
				
				String valueString;
				switch (valueData) 
				{
	            	case 1:  valueString = "A ";
	            			break;
	            	case 2:  valueString = "2 ";
	                     	break;
	            	case 3:  valueString = "3 ";
	                     	break;
	            	case 4:  valueString = "4 ";
	            			break;
	            	case 5:  valueString = "5 ";
	                     	break;
	            	case 6:  valueString = "6 ";
	                     	break;
	            	case 7:  valueString = "7 ";
	                     	break;
	            	case 8:  valueString = "8 ";
	                     	break;
	            	case 9:  valueString = "9 ";
	                     	break;
	            	case 10: valueString = "10 ";
	                     	break;
	            	case 11: valueString = "J ";
	                     break;
	            	case 12: valueString = "Q ";
	                     	break;
	            	case 13:  valueString = "K ";
                 			break;
	            	default: valueString = "oops, value";
	                     	break;
				}
	        
				String suiteString;
				switch (suiteData) 
				{
	            	case 1:  suiteString = "C ";
	                     	break;
	            	case 2:  suiteString = "D ";
	                     	break;
	            	case 3:  suiteString = "H ";
	                     	break; 
	            	case 4:  suiteString = "S ";
	                     	break;
	            	default: suiteString = "oops, suite";
	                     	break;
				}
				
				deck.add(new Card(valueString, suiteString));
				
			}	file.close();
			
			Card c;
			
			area.append("Original Deck:\n");
			for(int i = 0; i < deck.size(); i++)
			{
				c = (Card)deck.get(i);
				area.append(c.getCard() + " ");
			}
			
			Collections.shuffle(deck);
			
			area.append("\n\nShuffled Deck:\n");
			for(int i = 0; i < deck.size(); i++)
			{
				c = (Card)deck.get(i);
				area.append(c.getCard() + " ");
			}
			
			
			area.append("\n Player 1: ");
			for(int j = 0; j<17; j=j+4)
			{
				
				c = (Card)deck.get(j);
				player1.add(c);
				area.append(c.getCard() + " ");
				
			}
			
			area.append(Hand.evaluateHand(player1));
			
			area.append("\n Player 2: ");
			for(int j = 1; j<18; j=j+4)
			{
				
				c = (Card)deck.get(j);
				player2.add(c);
				area.append(c.getCard() + " ");
				
			}
			
			area.append(Hand.evaluateHand(player2));
			
			area.append("\n Player 3: ");
			for(int j = 2; j<19; j=j+4)
			{
				
				c = (Card)deck.get(j);
				player3.add(c);
				area.append(c.getCard() + " ");
				
			}
			
			area.append(Hand.evaluateHand(player3));
			
			area.append("\n Player 4: ");
			for(int j = 3; j<20; j=j+4)
			{
				
				c = (Card)deck.get(j);
				player4.add(c);
				area.append(c.getCard() + " ");
				
				
			}
			
			area.append(Hand.evaluateHand(player4));
			
		}
		catch (FileNotFoundException e)
		{   
			area.append(" Error processing file: " + e);
			
		}
	
	}
	
	
}
