import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

public class BallMain extends JFrame
{
	Image dbImage;
	Graphics dbg;
	boolean gameStarted=false;
	boolean startHover;
	boolean difficultyHover;
	boolean hardDifficulty=false;
	Thread ball=new Thread(b);
	Thread p1=new Thread(b.p1);
	Thread p2=new Thread(b.p2);
	Rectangle startButton=new Rectangle(150,100,100,25);
	Rectangle difficultyButton=new Rectangle(150,150,100,25);
	static Ball b=new Ball(193,143);
	public BallMain()
	{
		this.setTitle("Pong Game");
		this.setSize(400,300);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setBackground(Color.DARK_GRAY);
		this.addKeyListener(new KeyHandler());
		this.addMouseListener(new MouseHandler());
		this.addMouseMotionListener(new MouseHandler());
	}
	public void startGame()
	{
		gameStarted=true;
		ball.start();
		p1.start();
		p2.start();
	}
	public static void main(String[] args)
	{
		BallMain m=new BallMain();
	}
	@Override
	public void paint(Graphics g)
	{
		dbImage=createImage(getWidth(),getHeight());
		dbg=dbImage.getGraphics();
		draw(dbg);
		g.drawImage(dbImage,0,0,this);
	}
	public void draw(Graphics g)
	{
		if(!gameStarted)
		{
			g.setFont(new Font("Arial",Font.BOLD,26));
			g.setColor(Color.WHITE);
			g.drawString("Pong Game!",125,75);
			if(!startHover)
				g.setColor(Color.CYAN);
			else
				g.setColor(Color.PINK);
			g.fillRect(startButton.x, startButton.y, startButton.width, startButton.height);
			g.setFont(new Font("Arial",Font.BOLD,12));
			g.setColor(Color.gray);
			g.drawString("Start Game", startButton.x+20, startButton.y+17);
			if(!difficultyHover)
				g.setColor(Color.CYAN);
			else
				g.setColor(Color.PINK);
			g.fillRect(difficultyButton.x, difficultyButton.y, difficultyButton.width, difficultyButton.height);
			g.setColor(Color.GRAY);
			g.drawString("Difficulty:", difficultyButton.x+5, difficultyButton.y+17);
			if(!hardDifficulty)
			{
				g.setColor(Color.BLUE);
				g.drawString("Easy", difficultyButton.x+65, difficultyButton.y+17);
			}
			else
			{
				g.setColor(Color.RED);
				g.drawString("Hard", difficultyButton.x+65, difficultyButton.y+17);
			}
		}
		else
		{
			b.draw(g);
			b.p1.draw(g);
			b.p2.draw(g);
			g.setColor(Color.WHITE);
			g.drawString(""+b.p1Score,15,50);
			g.drawString(""+b.p2Score,370,50);
		}
		repaint();
	}
	public class KeyHandler extends KeyAdapter
	{
		@Override
		public void keyPressed(KeyEvent e)
		{
			b.p1.keyPressed(e);
			b.p2.keyPressed(e);
		}
		@Override
		public void keyReleased(KeyEvent e)
		{
			b.p1.keyReleased(e);
			b.p2.keyReleased(e);
		}
	}
	public class MouseHandler extends MouseAdapter
	{
		@Override
		public void mouseMoved(MouseEvent e)
		{
			int mx=e.getX();
			int my=e.getY();
			if(mx>startButton.x&&mx<startButton.x+startButton.width&&my>startButton.y&&my<startButton.y+startButton.height)
				startHover=true;
			else
				startHover=false;
			if(mx>difficultyButton.x&&mx<difficultyButton.x+difficultyButton.width&&my>difficultyButton.y&&my<difficultyButton.y+difficultyButton.height)
				difficultyHover=true;
			else
				difficultyHover=false;
		}
		@Override
		public void mousePressed(MouseEvent e)
		{
			int mx=e.getX();
			int my=e.getY();
			if(mx>startButton.x&&mx<startButton.x+startButton.width&&my>startButton.y&&my<startButton.y+startButton.height)
				startGame();
			if(mx>difficultyButton.x&&mx<difficultyButton.x+difficultyButton.width&&my>difficultyButton.y&&my<difficultyButton.y+difficultyButton.height)
				if(!hardDifficulty)
				{
					b.setDificulty(4);
					hardDifficulty=true;
				}
				else
				{
					b.setDificulty(7);
					hardDifficulty=false;
				}
		}
	}
}
