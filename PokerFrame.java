import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PokerFrame extends JFrame
{
	
	public PokerFrame()
	{
		
		JPanel displayPanel = new JPanel();
		displayPanel.add(testButton);
		displayPanel.add(simulationButton);
		
	}
	
	private JButton testButton;
	private JButton simulationButton;
	
}
