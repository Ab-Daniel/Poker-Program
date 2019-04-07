import java.util.StringTokenizer;

public class Card 
{
	private String cardValue;
	private String cardSuite;

	public Card(String valueData, String suiteData) 
	{
		cardValue = valueData;
		cardSuite = suiteData;
	}
	
	public String getNumber()
	{
		return cardValue;
	}
	
	public String getSuite()
	{
		return cardSuite;
	}
	
	public String getCard()
	{
		return cardValue + cardSuite;
	}

	public static String getNumber(String card) {
		 
		String[] result = card.split("\\s");
		 String number = result[result.length-2];
		 
		//StringTokenizer st = new StringTokenizer(card);
		 //System.out.println(number);
		 return number; 
	}

	public static String getSuite(String card) {
		String[] result = card.split("\\s");
		String suite = result[result.length - 1];
		//System.out.println(suite);
		return suite;
	}
	
}
