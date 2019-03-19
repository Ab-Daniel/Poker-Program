
public class Hand 
{
	public Hand()
	{
		
		Card card = new Card();
		
	}
	
	public String evaluateHand(String c1, String c2, String c3, String c4, String c5)
	{
		
		String card1 = c1;
		String card2 = c2;
		String card3 = c3;
		String card4 = c4;
		String card5 = c5;
		
		
		
		for(int i = 0; i < 5; i++)
		{
			
			String ve = null;
			String se = null;
			
			Card card = new Card();
			
			if(i == 0)
			{
				//ve = card.getNumber(card1);
				switch (card.getNumber(card1)) 
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
		            default: System.out.println("Oops, ve:0");
                    		break;
		        }
				
				se = card.getSuite(card1);
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
				
			}
			
			if(i == 1)
			{
				
				ve = card.getNumber(card2);
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
				
				se = card.getSuite(card2);
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
			
			if(i == 2)
			{
				
				
				ve = card.getNumber(card3);
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
				
				se = card.getSuite(card3);
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
	        			break;		        }
				
				//ve = card.getNumber(c1);
				//se = card.getSuite(c1);
				
			}
			
			if(i == 3)
			{
				
				
				ve = card.getNumber(card4);
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
				
				se = card.getSuite(card4);
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
			
			if(i == 4)
			{
				
				
				ve = card.getNumber(card5);
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
				
				se = card.getSuite(card5);
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
				threeOfAKind++;
			}
			
			if(num[i] == 4)
			{
				fourOfAKind++;
			}
			
			if(i<9)
			{
				if(num[i] == 1 && num[i + 1] == 1 && num[i + 2] == 1 && num[i + 3] == 1 && num[i + 4] == 1)
				{
					straight++;
				}
			}
			
			if(i == 10)
			{
				if(num[i] == 1 && num[i + 1] == 1 && num[i + 2] == 1 && num[i + 3] == 1 && num[0] == 1)
				{
					straight++;
					royalStraight++;
				}
			}
			
			if(threeOfAKind == 1 && pairs == 1)
			{
				fullHouse++;
			}
			
			if(straight == 1 && flush == 1 && royalStraight == 0)
			{
				straightFlush++;
			}
			
		}
		
		/*
		for(int j = 0; j < 10; j++)
		{
			
			if(j<9)
			{
				if(num[j] == 1 && num[j + 1] == 1 && num[j + 2] == 1 && num[j + 3] == 1 && num[j + 4] == 1)
				{
					straight++;
				}
			}
			
			if(j == 10)
			{
				if(num[j] == 1 && num[j + 1] == 1 && num[j + 2] == 1 && num[j + 3] == 1 && num[0] == 1)
				{
					straight++;
					royalStraight++;
				}
			}
			
		}
		*/
		
		for(int k = 0; k<suite.length; k++)
		{
			
			if(suite[k] == 5)
			{
				
				flush++;
				
				if(royalStraight == 1 && flush == 1)
				{
					royalFlush++;
				}
				
				if(straight == 1 && flush == 1 && royalStraight == 0)
				{
					straightFlush++;
				}
				
			}
			
		}
		
		if(straight == 1 && flush == 1 && royalStraight == 0)
		{
			straightFlush++;
		}
		
		/*
		if(royalStraight == 1)
		{
			royalFlush++;
		}
		*/
		/*
		if(threeOfAKind == 1 && pairs == 1)
		{
			fullHouse++;
		}
		
		if(straight == 1 && flush == 1 && royalStraight == 0)
		{
			straightFlush++;
		}
		*/
		
		if(royalFlush == 1)
		{
			System.out.println("pairs: " + pairs + " " + "Straights: " + straight + " " + "Three Of A Kind: " + threeOfAKind); 
			System.out.println("flush: " + flush + " " + "Full House: " + fullHouse + " " + "Four Of A Kind: " + fourOfAKind);
			System.out.println("Straight Flush: " + straightFlush + " " + "Royal Straight: " + royalStraight 
					+ " " + "Royal Flush: " + royalFlush);
			System.out.println("");
			return " --> Royal Flush";
		}
		if(fullHouse == 1)
		{
			System.out.println("pairs: " + pairs + " " + "Straights: " + straight + " " + "Three Of A Kind: " + threeOfAKind); 
			System.out.println("flush: " + flush + " " + "Full House: " + fullHouse + " " + "Four Of A Kind: " + fourOfAKind);
			System.out.println("Straight Flush: " + straightFlush + " " + "Royal Straight: " + royalStraight 
					+ " " + "Royal Flush: " + royalFlush);
			System.out.println("");
			return " --> Full House";
		}
		if(flush == 1 && royalStraight == 0 && straight == 0)
		{ 
			System.out.println("pairs: " + pairs + " " + "Straights: " + straight + " " + "Three Of A Kind: " + threeOfAKind); 
			System.out.println("flush: " + flush + " " + "Full House: " + fullHouse + " " + "Four Of A Kind: " + fourOfAKind);
			System.out.println("Straight Flush: " + straightFlush + " " + "Royal Straight: " + royalStraight 
					+ " " + "Royal Flush: " + royalFlush);
			System.out.println("");
			return " --> Flush";
		}
		if(straightFlush == 1)
		{
			System.out.println("pairs: " + pairs + " " + "Straights: " + straight + " " + "Three Of A Kind: " + threeOfAKind); 
			System.out.println("flush: " + flush + " " + "Full House: " + fullHouse + " " + "Four Of A Kind: " + fourOfAKind);
			System.out.println("Straight Flush: " + straightFlush + " " + "Royal Straight: " + royalStraight 
					+ " " + "Royal Flush: " + royalFlush);
			System.out.println("");
			return " --> Straight Flush";
		}
		if(straight == 1 && flush == 0)
		{
			System.out.println("pairs: " + pairs + " " + "Straights: " + straight + " " + "Three Of A Kind: " + threeOfAKind); 
			System.out.println("flush: " + flush + " " + "Full House: " + fullHouse + " " + "Four Of A Kind: " + fourOfAKind);
			System.out.println("Straight Flush: " + straightFlush + " " + "Royal Straight: " + royalStraight 
					+ " " + "Royal Flush: " + royalFlush);
			System.out.println("");
			return " --> Straight";
		}
		if(fourOfAKind == 1)
		{
			System.out.println("pairs: " + pairs + " " + "Straights: " + straight + " " + "Three Of A Kind: " + threeOfAKind); 
			System.out.println("flush: " + flush + " " + "Full House: " + fullHouse + " " + "Four Of A Kind: " + fourOfAKind);
			System.out.println("Straight Flush: " + straightFlush + " " + "Royal Straight: " + royalStraight 
					+ " " + "Royal Flush: " + royalFlush);
			System.out.println("");
			return " --> Four Of A Kind";
		}
		if(threeOfAKind == 1 && pairs == 0)
		{
			System.out.println("pairs: " + pairs + " " + "Straights: " + straight + " " + "Three Of A Kind: " + threeOfAKind); 
			System.out.println("flush: " + flush + " " + "Full House: " + fullHouse + " " + "Four Of A Kind: " + fourOfAKind);
			System.out.println("Straight Flush: " + straightFlush + " " + "Royal Straight: " + royalStraight 
					+ " " + "Royal Flush: " + royalFlush);
			System.out.println("");
			return " --> Three Of A Kind";
		}
		if(pairs == 1 && threeOfAKind == 0 && flush == 0)
		{
			System.out.println("pairs: " + pairs + " " + "Straights: " + straight + " " + "Three Of A Kind: " + threeOfAKind); 
			System.out.println("flush: " + flush + " " + "Full House: " + fullHouse + " " + "Four Of A Kind: " + fourOfAKind);
			System.out.println("Straight Flush: " + straightFlush + " " + "Royal Straight: " + royalStraight 
					+ " " + "Royal Flush: " + royalFlush);
			System.out.println("");
			return " --> One Pair";
		}
		if(pairs == 2 && threeOfAKind == 0 && flush == 0)
		{
			System.out.println("pairs: " + pairs + " " + "Straights: " + straight + " " + "Three Of A Kind: " + threeOfAKind); 
			System.out.println("flush: " + flush + " " + "Full House: " + fullHouse + " " + "Four Of A Kind: " + fourOfAKind);
			System.out.println("Straight Flush: " + straightFlush + " " + "Royal Straight: " + royalStraight 
					+ " " + "Royal Flush: " + royalFlush);
			System.out.println("");
			return " --> Two Pairs";
		}
		if(pairs == 0 && threeOfAKind == 0 && straight == 0 && flush == 0)
		{
			System.out.println("pairs: " + pairs + " " + "Straights: " + straight + " " + "Three Of A Kind: " + threeOfAKind); 
			System.out.println("flush: " + flush + " " + "Full House: " + fullHouse + " " + "Four Of A Kind: " + fourOfAKind);
			System.out.println("Straight Flush: " + straightFlush + " " + "Royal Straight: " + royalStraight 
					+ " " + "Royal Flush: " + royalFlush);
			System.out.println("");
			return " --> No Pairs";
		}
		else 
		{
			System.out.println("pairs: " + pairs + " " + "Straights: " + straight + " " + "Three Of A Kind: " + threeOfAKind); 
			System.out.println("flush: " + flush + " " + "Full House: " + fullHouse + " " + "Four Of A Kind: " + fourOfAKind);
			System.out.println("Straight Flush: " + straightFlush + " " + "Royal Straight: " + royalStraight 
					+ " " + "Royal Flush: " + royalFlush);
			System.out.println("");
			return " --> Oops, evaluated hand wrong";
		}
		///return card5;
		
	}
	
	int[] num = new int[13];
	int[] suite = new int[4];
	
}
