import java.util.Date; 
import java.applet.*; 
import java.awt.*; 

public class WelcomeApplet extends Applet 
{ 
	Image smile; 
	public void paint(Graphics g) 
	{ 
		resize(400, 250);
		Date currentDate = new Date();
		
		g.drawString("Welcome to my day!", 180,70); 
		g.drawString("Daily planner for Victoria Longsworth", 180,100); 
		g.drawString(currentDate.toString(),180,130); 
		
		smile = getImage(getCodeBase(),"happy.gif"); 
		g.drawImage(smile,37,37,this);
		setBackground(Color.cyan);
	} 
} 