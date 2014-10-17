import java.awt.Image;

import javax.swing.JOptionPane;

import org.francisparker.mmaunu.gameengine.AIObject;
import org.francisparker.mmaunu.gameengine.GameFrame;


public class Cuddles extends AIObject
{
	private int currDirection;
	private static int DIR_UP = 1, DIR_DOWN = 2;
	
	public Cuddles(int x, Image img)
	{
		super(x*100, 0, img, 100, 100, 1);
		currDirection = DIR_DOWN;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void act()
	{
		
		//Template...you will make your constructor just like this one and have it call
		//super just like this one...any extra variables get initialized as wel
			//just moves up and down...terrible AI...but does check for collisions
			
			int currY = getY();
			int speed = getSpeed();
			int height = getHeight();
			
			int newY = currY;
			
			if (newY==600)
				JOptionPane.showMessageDialog(null, "Game Over");
			else if (currDirection == DIR_DOWN && newY + height + speed  <= GameFrame.getHeightOfGameArea())
				newY += speed;
						
			setY(newY);		
		}
		
		// TODO Auto-generated method stub
		
	}