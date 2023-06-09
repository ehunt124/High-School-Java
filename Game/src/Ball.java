import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;
public class Ball implements Runnable 
{
	int x,y,xDir,yDir;
	int difficulty =7;
	int p1Score,p2Score;
	Paddle p1=new Paddle(15,140,1);
	Paddle p2=new Paddle(370,140,2);
	Rectangle ball =new Rectangle();
	public Ball(int x, int y)
	{
		p1Score=p2Score=0;
		this.x=x;
		this.y=y;
		Random r=new Random();
		int rDir=r.nextInt(2);
		if(rDir==0)
			rDir--;
		setXDirection(rDir);
		int yrDir=r.nextInt(2);
		if(yrDir==0)
			yrDir--;
		setYDirection(yrDir);
		ball=new Rectangle(this.x,this.y,7,7);
	}
	public void draw(Graphics g)
	{
		g.setColor(Color.WHITE);
		g.fillRect(ball.x,ball.y,ball.width,ball.height);
	}
	public void move()
	{
		collision();
		ball.x+=xDir;
		ball.y+=yDir;
		if(ball.x<=0)
		{
			setXDirection(+1);
			p2Score++;
		}
		if(ball.x>=385)
		{
			setXDirection(-1);
			p1Score++;
		}
		if(ball.y<=25)
			setYDirection(+1);
		if(ball.y>=285)
			setYDirection(-1);
	}
	public void collision()
	{
		if(ball.intersects(p1.paddle))
			setXDirection(+1);
		if(ball.intersects(p2.paddle))
			setXDirection(-1);
	}
	public void setXDirection(int xdir)
	{
		xDir=xdir;
	}
	public void setYDirection(int ydir)
	{
		yDir=ydir;
	}
	@Override
	public void run()
	{
		try
		{
			while(true)
			{
				move();
				Thread.sleep(difficulty);
			}
		}catch(Exception e){System.err.println(e.getMessage());}
	}
	public void setDificulty(int diff)
	{
		difficulty=diff;
	}
}
