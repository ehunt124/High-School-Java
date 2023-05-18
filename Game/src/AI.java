import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class AI implements Runnable
{
	Rectangle AI,target;
	int xDir,yDir;
	boolean resting=false;
	public AI(Rectangle r,Rectangle t)
	{
		AI=r;
		target=t;
	}
	public void draw(Graphics g)
	{
		g.setColor(Color.LIGHT_GRAY);
		if(AI!=null)
			g.fillRect(AI.x, AI.y, AI.width, AI.height);
		g.setColor(Color.GREEN);
	}
	public void findPathToTarget()
	{
		if(AI.x<target.x)
			setXDirection(1);
		if(AI.x>target.x)
			setXDirection(-1);
		if(AI.y<target.y)
			setYDirection(1);
		if(AI.y>target.y)
			setYDirection(-1);
	}
	public void detectEdges()
	{
		if(AI.x<=0)
			setXDirection(1);
		if(AI.x>=600-AI.width)
			setXDirection(-1);
		if(AI.y<=25)
			setYDirection(1);
		if(AI.y>400-AI.height)
			setYDirection(-1);
	}
	public void setXDirection(int dir)
	{
		xDir=dir;
	}
	public void setYDirection(int dir)
	{
		yDir=dir;
	}
	public void move()
	{
		AI.x+=xDir;
		AI.y+=yDir;
	}
	@Override
	public void run() 
	{
		try
		{
			while(true)
			{
				if(!resting)
				{
					long start =System.currentTimeMillis();
					long end =start+3*500;
					while(System.currentTimeMillis()<end)
					{
						findPathToTarget();
						move();
						detectEdges();
						Thread.sleep(10);
					}
					resting=true;
				}
				else
				{
					Thread.sleep(2000);
					resting=false;
				}
			}
		}
		catch(Exception ex)
		{
			System.err.println(ex.getMessage());
		}
	}
}
