import java.awt.Color;
import java.awt.Image;
import java.io.File;

import javax.imageio.ImageIO;

import org.francisparker.mmaunu.gameengine.GameFrame;


public class SunshineGame
{
	//This simply constructs one of these objects...the real fun is in the constructor below
		public static void main(String[] args)
		{
			new SunshineGame();
		}
		

		@SuppressWarnings("static-access")
		public SunshineGame()
		{
			//Load up some images
			Image heroImg = null, baddyImg = null, flowerImg = null;
			try
			{	
				//read images relative to this class' location
				heroImg = ImageIO.read(new File ("sunshine.jpg"));
				baddyImg = ImageIO.read(new File ("cuddles.jpg"));
			
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
			
			//Create user-controlled characters and other game elements
			Sunshine hero = new Sunshine(heroImg);
			Cuddles c1 = new Cuddles(1,baddyImg);
					
			
			//Create a GameFrame object which represents the game or a container for the game
			GameFrame mainWindow = new GameFrame("Your Title Here", 600, 600, true, false);
			
			//Add the controllable character and the other objects to the game
			mainWindow.setControllableObject(hero);
			mainWindow.addDrawableObject(c1);
//			mainWindow.addDrawableObject(baddy2);
//			mainWindow.addDrawableObject(baddy3);
//			mainWindow.addDrawableObject(flower1);
//			mainWindow.addDrawableObject(flower2);

			//set a few settings
			mainWindow.setGameBackground(Color.red);
			mainWindow.setScoreBackground(Color.blue);
			mainWindow.setNumberLivesBackground(Color.green);
			mainWindow.setFPS(24);
			
			//show the game
			mainWindow.setVisible(true);

		}
}
