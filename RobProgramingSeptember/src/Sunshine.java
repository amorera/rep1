import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

import org.francisparker.mmaunu.gameengine.ControllableObject;
import org.francisparker.mmaunu.gameengine.GameFrame;


public class Sunshine extends ControllableObject
{

	public Sunshine(Image img) 
	{
		super(200, 400,img , 100, 100, 8);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void act()
	{
		if (this.isMovingLeft())
		{
			int currX = getX();
			int speed = getSpeed();
			
			int newX = currX;
			
			if ( newX + speed  >= 0)
				newX -= speed;
						
			setX(newX);		
		}
		
		else if(this.isMovingRight())
		{
			int currX = getX();
			int speed = getSpeed();
			int width = getWidth();
			
			int newX = currX;
			
			if ( newX + width + speed  <= GameFrame.getWidthOfGameArea())
				newX += speed;
						
			setX(newX);
		}
		else if(this.isMovingUp())
		{
			//shoot
		}
		
	}
	
	public boolean isMovingDown()
	{
		return false;
	}
	
}
