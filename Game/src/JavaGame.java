import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//Author: Ethan Hunt
//Period 1
public class JavaGame extends JFrame implements Runnable
{
	int x,y, xDirection,yDirection;
	private Image dbImage;
	private Graphics dbg;
	Image face;
	Font font=new Font("Arial",Font.BOLD|Font.ITALIC,30);
	public JavaGame()
	{
		ImageIcon i= new ImageIcon("D:/EthanH/workspace/Game/src/face.gif");
		face=i.getImage();
		
		addKeyListener(new AL());
		setTitle("Ethan's Main");
		setSize(250,250);
		setResizable(false);
		setVisible(true);
		setBackground(Color.blue);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		x=150;
		y=150;
	}
	public void run()
	{
		try
		{
			while(true)
			{
				move();
				Thread.sleep(1);
			}
		}
		catch(Exception e)
		{
			System.out.println("Error");
		}
	}
	public void move()
	{
		x+=xDirection;
		y+=yDirection;
		if(x<=0)
			x=0;
		if(x>=220)
			x=220;
		if(y<=30)
			y=30;
		if(y>=220)
			y=220;
	}
	public void setXDirection(int xdir)
	{
		xDirection=xdir;
	}
	public void setYDirection(int ydir)
	{
		yDirection=ydir;
	}
	
	public class AL extends KeyAdapter
	{
		public void keyPressed(KeyEvent e)
		{
			int keyCode = e.getKeyCode();
			if(keyCode==e.VK_LEFT)
			{
				setXDirection(-1);
			}
			if(keyCode==e.VK_RIGHT)
			{
				setXDirection(+1);
			}
			if(keyCode==e.VK_UP)
			{
				setYDirection(-1);
			}
			if(keyCode==e.VK_DOWN)
			{
				setYDirection(+1);
			}
		}
		public void keyReleased(KeyEvent e)
		{
			int keyCode = e.getKeyCode();
			if(keyCode==e.VK_LEFT)
			{
				setXDirection(0);
			}
			if(keyCode==e.VK_RIGHT)
			{
				setXDirection(0);
			}
			if(keyCode==e.VK_UP)
			{
				setYDirection(0);
			}
			if(keyCode==e.VK_DOWN)
			{
				setYDirection(0);
			}
		}
	}
	public void paint(Graphics g)
	{
		dbImage=createImage(getWidth(),getHeight());
		dbg=dbImage.getGraphics();
		paintComponent(dbg);
		g.drawImage(dbImage, 0, 0, this);
	}
	public void paintComponent(Graphics g)
	{
		g.setColor(Color.red);
		g.drawImage(face,x,y,this);
		repaint();
	}
	public static void main(String[] args) 
	{
		JavaGame jg= new JavaGame();
		Thread t1=new Thread(jg);
		t1.start();
	}
}
