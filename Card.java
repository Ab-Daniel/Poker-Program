import java.util.StringTokenizer;

public class Card 
{
	

	public String getNumber(String card) {
		 
		String[] result = card.split("\\s");
		 String number = result[result.length-2];
		 
		//StringTokenizer st = new StringTokenizer(card);
		 System.out.println(number);
		 return number; 
	}

	public String getSuite(String card) {
		String[] result = card.split("\\s");
		String suite = result[result.length - 1];
		System.out.println(suite);
		return suite;
	}
	
}
