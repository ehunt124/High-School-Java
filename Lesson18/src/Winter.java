//Author: Ethan Hunt
//Period 1
import java.applet.*;
import java.awt.event.*;
import java.awt.*;
public class Winter extends Applet

{

Graphics b;

Image offscreen;

Dimension dim;

final int FLAKES = 8000;

int f = 10;

int[] fx = new int [FLAKES];

int[] fy = new int [FLAKES];

int[] fs = new int [FLAKES];

int sx = 100;

public void init ()

{

setSize (800, 600);

dim = getSize ();

setBackground (Color.black);

offscreen = createImage (dim.width, dim.height);

b = offscreen.getGraphics ();

//SNOWFLAKES

for (int i = 0 ; i < FLAKES ; i++)

{

fx [i] = (int) (Math.random () * 800);

fy [i] = (int) (Math.random () * 500);

fs [i] = (int) (Math.random () * 3) + 3;

}

}

public void paint (Graphics g)

{

b.clearRect (0, 0, dim.width, dim.width);

sx++;

if (sx > 800)

sx = -300;

santa (sx);

// Snowflakes

b.setColor (Color.white);

b.fillRect (0, 500, 800, 600);

if (f < 8000)

f++;

for (int i = 0 ; i < f ; i++)

{

fy [i] += fs [i];

if (fy [i] > 500)

fy [i] -= 500;

fx [i] += (int) (Math.random () * 7) - 3;

if (fx [i] > 800)

fx [i] -= 800;

if (fx [i] < 0)

fx [i] += 800;

b.fillOval (fx [i], fy [i], 3, 3);

}

for(int s=0;s<=750;s=s+150)
{
int treeX[] = {s, 70+s, 140+s};
int treeY[] = {400,300,400};
b.setColor (Color.green);
b.fillPolygon (treeX, treeY, 3);
b.setColor (new Color (128, 64, 0));
b.fillRect(45+s, 400, 50, 30);	
}

try

{

Thread.sleep (30);

}

catch (InterruptedException e)

{

}

g.drawImage (offscreen, 0, 0, this);

repaint ();

}

public void update (Graphics g)

{

paint (g);

}

//Create trees


public void santa (int x)

{

// sleigh

b.setColor (Color.red);

b.fillRect (x, 100, 75, 40);

b.fillRect (x + 20, 140, 5, 10);

b.fillRect (x + 55, 140, 5, 10);

b.fillRect (x, 150, 85, 3);

b.drawLine (x + 85, 150, x + 90, 140);

b.fillOval(x+20, 75, 50, 50);



b.setColor(new Color(255,224,189));
b.fillOval(x+40, 55, 25, 25);
b.setColor(Color.black);
b.fillOval(x+55, 60, 5, 5);

b.setColor(Color.red);
int hatX[]={x+44,x+54,x+64};
int hatY[]={57,40,57};
b.fillPolygon(hatX, hatY, 3);

b.setColor(Color.white);
b.fillOval(x+51, 40, 5, 5);

//One reindeer-however, there were more

reinDeer (x + 100);
reinDeer (x + 170);
reinDeer (x + 170+70);
reinDeer (x + 170+70+70);
reinDeer (x + 170+70+70+70);
reinDeer (x + 170+70+70+70+70);
}

// Create more reindeer and in more detail, use your graphs and sketches
public void reinDeer (int x)

{

b.setColor (new Color (128, 64, 0));
b.fillOval (x, 100, 50, 30);
b.drawLine(x + 0, 150, x + 30, 110);
b.drawLine(x + 50, 150, x + 25, 110);
b.fillRect(x+30, 90, 20, 30);
b.fillOval(x+30,75,40,30);
b.drawLine(x+60, 80, x+70, 60);
b.drawLine(x+40, 80, x+30, 60);
b.drawLine(x+33, 68, x+40, 60);
b.drawLine(x+67, 68, x+60, 60);
b.setColor(Color.red);
b.fillOval(x+60, 85, 15, 10);
b.setColor(Color.black);
b.fillOval(x+45, 80, 5, 5);
b.fillOval(x+55, 80, 5, 5);
}

}