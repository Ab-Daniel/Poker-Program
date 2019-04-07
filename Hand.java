import java.util.ArrayList;

public class Hand 
{
	
	public Hand()
	{
		
		
	}
	
	public static String evaluateHand(ArrayList<Card> aHand)
	{
		
		int[] num = new int[13];
		int[] suite = new int[4];
		int[] cards = new int [5];
		
		for(int i = 0; i<aHand.size(); i++)
		{
			
			Card card = (Card)aHand.get(i);
			
			switch (card.getNumber()) 
	        {
	            case "A ":  num[0] = num[0] + 1;
	                     cards[0] = 0;
	                     break;
	            case "2 ":  num[1] = num[1] + 1;
	                     break;
	            case "3 ":  num[2] = num[2] + 1;
	                     break;
	            case "4 ":  num[3] = num[3] + 1;
	                     break;
	            case "5 ":  num[4] = num[4] + 1;
	                     break;
	            case "6 ":  num[5] = num[5] + 1;
	                     break;
	            case "7 ":  num[6] = num[6] + 1;
	                     break;
	            case "8 ":  num[7] = num[7] + 1;
	                     break;
	            case "9 ":  num[8] = num[8] + 1;
	                     break;
	            case "10 ": num[9] = num[9] + 1;
	                     break;
	            case "J ": num[10] = num[10] + 1;
	                     break;
	            case "Q ": num[11] = num[11] + 1;
	                     break;
	            case "K ":  num[12] = num[12] + 1;
                 		break;
	            default: System.out.println("Oops, ve:0");
                		break;
	        }
			
			
			
			switch (card.getSuite()) 
	        {
	            case "C ":  suite[0] = suite[0] + 1;
	                     break;
	            case "D ":  suite[1] = suite[1] + 1;
	                     break;
	            case "H ":  suite[2] = suite[2] + 1;
	                     break;
	            case "S ":  suite[3] = suite[3] + 1;
	                     break;
	            default: System.out.println("Oops, se:0");
	                     break;
	        }
			
			System.out.println("Card: " + card.getNumber() + card.getSuite());
			
		}
		
		int pairs = 0;
		int straight = 0;
		int threeOfAKind = 0;
		int flush = 0;
		int fullHouse = 0;
		int fourOfAKind = 0;
		int straightFlush = 0;
		int royalStraight = 0;
		int royalFlush = 0;
		//int otherHalfOfARoyalFlush = 0;
		for (int i = 0;  i < num.length;  i++)
		{
			
			if(num[i] == 2)
			{
				pairs++;
			}
			
			if(num[i] == 3)
			{
				threeOfAKind = 1;
			}
			
			if(num[i] == 4)
			{
				fourOfAKind = 1;
			}
			
			if(i<5)
			{
				if(num[i] == 1 && num[i+1] == 1 && num[i+2] == 1 && num[i+3] == 1 && num[i+4] == 1)
				{
					straight++;
				}
			}
		}
		
		if(num[10] == 1 && num[11] == 1 && num[12] == 1 && num[9] == 1 && num[0] == 1)
			{
				straight=1;
				royalStraight = 1;
			}
			
		
		
		
		for(int j = 0; j<suite.length; j++)
		{
			if(suite[j] == 5)
			{
				flush = 1;
			}
			
		}
		
		System.out.println();
		System.out.println("pairs: " + pairs);
		System.out.println("Straight: " + straight);
		System.out.println("three of a kind: " + threeOfAKind);
		System.out.println("flush :" + flush);
		System.out.println("four of a kind: " + fourOfAKind);
		System.out.println("royalStraight: " + royalStraight);
		
		if(pairs == 0 && threeOfAKind == 0 && fourOfAKind == 0 && straight == 0 && flush == 0)
		{									
			return " --> No Pair";
		}
		
		else if(pairs == 1 && threeOfAKind == 0 && straight == 0 && flush == 0)
		{
			return " --> One Pair";
		}
		
		else if(pairs == 2 && threeOfAKind == 0 && straight == 0 && flush == 0)
		{
			return " --> Two Pairs";
		}
		
		else if(threeOfAKind == 1 && pairs != 1 && flush == 0)
		{
			return " --> Three of a kind";
		}
		
		else if(straight == 1 && flush == 0)
		{
			return " --> Straight";
		}
		
		else if(flush == 1 && straight == 0)
		{
			return " --> Flush";
		}
		
		else if(threeOfAKind == 1 && pairs == 1)
		{
			return " --> Full House";
		}
		
		else if(fourOfAKind == 1)
		{
			return " --> Four of a kind";
		}
		
		else if(straight == 1 && royalStraight == 0 && flush == 1)
		{
			return " --> Straight flush";
		}
		
		else if(royalStraight == 1 && flush ==1)
		{
			return " --> Royal Flush";
		}
		
		else 
		{
			return "oops, evaluated hand wrong";
		}
		
	}
	
	
	
	public String evaluateHand(String c1, String c2, String c3, String c4, String c5)
	{
		
		String card1 = c1;
		String card2 = c2;
		String card3 = c3;
		String card4 = c4;
		String card5 = c5;
		
		int[] num = new int[13];
		int[] suite = new int[4];
		int[] cards = new int [5];
		
		for(int i = 0; i < 5; i++)
		{
			
			String ve = null;
			String se = null;
					
			if(i == 0)
			{
				//ve = card.getNumber(card1);
				switch (Card.getNumber(card1)) 
		        {
		            case "A":  num[0] = num[0] + 1;
		                     cards[0] = 0;
		                     break;
		            case "2":  num[1] = num[1] + 1;
		                     break;
		            case "3":  num[2] = num[2] + 1;
		                     break;
		            case "4":  num[3] = num[3] + 1;
		                     break;
		            case "5":  num[4] = num[4] + 1;
		                     break;
		            case "6":  num[5] = num[5] + 1;
		                     break;
		            case "7":  num[6] = num[6] + 1;
		                     break;
		            case "8":  num[7] = num[7] + 1;
		                     break;
		            case "9":  num[8] = num[8] + 1;
		                     break;
		            case "10": num[9] = num[9] + 1;
		                     break;
		            case "J": num[10] = num[10] + 1;
		                     break;
		            case "Q": num[11] = num[11] + 1;
		                     break;
		            case "K":  num[12] = num[12] + 1;
                     		break;
		            default: System.out.println("Oops, ve:0");
                    		break;
		        }
				
				
				se = Card.getSuite(card1);
				switch (se) 
		        {
		            case "C":  suite[0] = suite[0] + 1;
		                     break;
		            case "D":  suite[1] = suite[1] + 1;
		                     break;
		            case "H":  suite[2] = suite[2] + 1;
		                     break;
		            case "S":  suite[3] = suite[3] + 1;
		                     break;
		            default: System.out.println("Oops, se:0");
		                     break;
		        }
				
				
			}
			
			if(i == 1)
			{
				
				ve = Card.getNumber(card2);
				switch (ve) 
		        {
		            case "A":  num[0] = num[0] + 1;
		                     break;
		            case "2":  num[1] = num[1] + 1;
		                     break;
		            case "3":  num[2] = num[2] + 1;
		                     break;
		            case "4":  num[3] = num[3] + 1;
		                     break;
		            case "5":  num[4] = num[4] + 1;
		                     break;
		            case "6":  num[5] = num[5] + 1;
		                     break;
		            case "7":  num[6] = num[6] + 1;
		                     break;
		            case "8":  num[7] = num[7] + 1;
		                     break;
		            case "9":  num[8] = num[8] + 1;
		                     break;
		            case "10": num[9] = num[9] + 1;
		                     break;
		            case "J": num[10] = num[10] + 1;
		                     break;
		            case "Q": num[11] = num[11] + 1;
		                     break;
		            case "K":  num[12] = num[12] + 1;
                     		break;
		            default: System.out.println("Oops, ve:1");
                    		break;
		        }
				
				se = Card.getSuite(card2);
				switch (se) 
		        {
		            case "C":  suite[0] = suite[0] + 1;
		                     break;
		            case "D":  suite[1] = suite[1] + 1;
		                     break;
		            case "H":  suite[2] = suite[2] + 1;
		                     break;
		            case "S":  suite[3] = suite[3] + 1;
		                     break;
		            default: System.out.println("Oops, se:1");
		                     break;
		        }
				
				//ve = card.getNumber(c1);
				//se = card.getSuite(c1);
				
			}
			
			if(i == 2)
			{
				
				
				ve = Card.getNumber(card3);
				switch (ve) 
		        {
		            case "A":  num[0] = num[0] + 1;
		                     break;
		            case "2":  num[1] = num[1] + 1;
		            		 break;
		            case "3":  num[2] = num[2] + 1;
		                     break;
		            case "4":  num[3] = num[3] + 1;
		                     break;
		            case "5":  num[4] = num[4] + 1;
		                     break;
		            case "6":  num[5] = num[5] + 1;
		                     break;
		            case "7":  num[6] = num[6] + 1;
		                     break;
		            case "8":  num[7] = num[7] + 1;
		                     break;
		            case "9":  num[8] = num[8] + 1;
		                     break;
		            case "10": num[9] = num[9] + 1;
		                     break;
		            case "J": num[10] = num[10] + 1;
		                     break;
		            case "Q": num[11] = num[11] + 1;
		                     break;
		            case "K":  num[12] = num[12] + 1;
                     		break;
		            default: System.out.println("Oops, ve:2");
                    		break;
		        }
				
				se = Card.getSuite(card3);
				switch (se) 
		        {
		            case "C":  suite[0] = suite[0] + 1;
		                     break;
		            case "D":  suite[1] = suite[1] + 1;
		                     break;
		            case "H":  suite[2] = suite[2] + 1;
		                     break;
		            case "S":  suite[3] = suite[3] + 1;
		                     break;
		            default: System.out.println("Oops, se:2");
		                     break;
		        }
				
				//ve = card.getNumber(c1);
				//se = card.getSuite(c1);
				
			}
			
			if(i == 3)
			{
				
				
				ve = Card.getNumber(card4);
				switch (ve) 
		        {
		            case "A":  num[0] = num[0] + 1;
		                     break;
		            case "2":  num[1] = num[1] + 1;
		                     break;
		            case "3":  num[2] = num[2] + 1;
		                     break;
		            case "4":  num[3] = num[3] + 1;
		                     break;
		            case "5":  num[4] = num[4] + 1;
		                     break;
		            case "6":  num[5] = num[5] + 1;
		                     break;
		            case "7":  num[6] = num[6] + 1;
		                     break;
		            case "8":  num[7] = num[7] + 1;
		                     break;
		            case "9":  num[8] = num[8] + 1;
		                     break;
		            case "10": num[9] = num[9] + 1;
		                     break;
		            case "J": num[10] = num[10] + 1;
		                     break;
		            case "Q": num[11] = num[11] + 1;
		                     break;
		            case "K":  num[12] = num[12] + 1;
                     		break;
		            default: System.out.println("Oops, ve:3");
                    		break;
		        }
				
				se = Card.getSuite(card4);
				switch (se) 
		        {
		            case "C":  suite[0] = suite[0] + 1;
		                     break;
		            case "D":  suite[1] = suite[1] + 1;
		                     break;
		            case "H":  suite[2] = suite[2] + 1;
		                     break;
		            case "S":  suite[3] = suite[3] + 1;
		                     break;
		            default: System.out.println("Oops, se:3");
		                     break;
		        }
				
				//ve = card.getNumber(c1);
				//se = card.getSuite(c1);
				
			}
			
			if(i == 4)
			{
				
				
				ve = Card.getNumber(card5);
				switch (ve) 
		        {
		            case "A":  num[0] = num[0] + 1;
		                     break;
		            case "2":  num[1] = num[1] + 1;
		                     break;
		            case "3":  num[2] = num[2] + 1;
		                     break;
		            case "4":  num[3] = num[3] + 1;
		                     break;
		            case "5":  num[4] = num[4] + 1;
		                     break;
		            case "6":  num[5] = num[5] + 1;
		                     break;
		            case "7":  num[6] = num[6] + 1;
		                     break;
		            case "8":  num[7] = num[7] + 1;
		                     break;
		            case "9":  num[8] = num[8] + 1;
		                     break;
		            case "10": num[9] = num[9] + 1;
		                     break;
		            case "J": num[10] = num[10] + 1;
		                     break;
		            case "Q": num[11] = num[11] + 1;
		                     break;
		            case "K":  num[12] = num[12] + 1;
                     		break;
		            default: System.out.println("Oops, ve:4");
                    		break;
		        }
				
				se = Card.getSuite(card5);
				switch (se) 
		        {
		            case "C":  suite[0] = suite[0] +1;
		                     break;
		            case "D":  suite[1] = suite[1] +1;
		                     break;
		            case "H":  suite[2] = suite[2] +1;
		                     break;
		            case "S":  suite[3] = suite[3] +1;
		                     break;
		            default: System.out.println("Oops, se:4");
		                     break;
		        }
				
				//ve = card.getNumber(c1);
				//se = card.getSuite(c1);
				
			}
			
			
			
		}
		
		
	
		int pairs = 0;
		int straight = 0;
		int threeOfAKind = 0;
		int flush = 0;
		int fullHouse = 0;
		int fourOfAKind = 0;
		int straightFlush = 0;
		int royalStraight = 0;
		int royalFlush = 0;
		//int otherHalfOfARoyalFlush = 0;
		for (int i = 0;  i < num.length;  i++)
		{
			
			if(num[i] == 2)
			{
				pairs++;
			}
			
			if(num[i] == 3)
			{
				threeOfAKind = 1;
			}
			
			if(num[i] == 4)
			{
				fourOfAKind = 1;
			}
			
			if(i<5)
			{
				if(num[i] == 1 && num[i+1] == 1 && num[i+2] == 1 && num[i+3] == 1 && num[i+4] == 1)
				{
					straight++;
				}
			}
		}
		
		if(num[10] == 1 && num[11] == 1 && num[12] == 1 && num[9] == 1 && num[0] == 1)
			{
				straight=1;
				royalStraight = 1;
			}
			
		
		
		
		for(int j = 0; j<suite.length; j++)
		{
			if(suite[j] == 5)
			{
				flush = 1;
			}
			
		}
		
		System.out.println();
		System.out.println("pairs: " + pairs);
		System.out.println("Straight: " + straight);
		System.out.println("three of a kind: " + threeOfAKind);
		System.out.println("flush :" + flush);
		System.out.println("four of a kind: " + fourOfAKind);
		System.out.println("royalStraight: " + royalStraight);
		
		if(pairs == 0 && threeOfAKind == 0 && fourOfAKind == 0 && straight == 0 && flush == 0)
		{									
			return " --> No Pair";
		}
		
		else if(pairs == 1 && threeOfAKind == 0 && straight == 0 && flush == 0)
		{
			return " --> One Pair";
		}
		
		else if(pairs == 2 && threeOfAKind == 0 && straight == 0 && flush == 0)
		{
			return " --> Two Pairs";
		}
		
		else if(threeOfAKind == 1 && pairs != 1 && flush == 0)
		{
			return " --> Three of a kind";
		}
		
		else if(straight == 1 && flush == 0)
		{
			return " --> Straight";
		}
		
		else if(flush == 1 && straight == 0)
		{
			return " --> Flush";
		}
		
		else if(threeOfAKind == 1 && pairs == 1)
		{
			return " --> Full House";
		}
		
		else if(fourOfAKind == 1)
		{
			return " --> Four of a kind";
		}
		
		else if(straight == 1 && royalStraight == 0 && flush == 1)
		{
			return " --> Straight flush";
		}
		
		else if(royalStraight == 1 && flush ==1)
		{
			return " --> Royal Flush";
		}
		
		else 
		{
			return "oops, evaluated hand wrong";
		}
		
	}
	
	
	
}
