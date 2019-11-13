import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class PlayerFrame extends JFrame implements MouseListener
{
	private Board board = new Board();
	public static final int LENGTH = 1600;
    public static final int HEIGHT = 1000;
	
    
	public PlayerFrame()
	{
		super("Seven Wonders");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(null);
        setVisible(true);
        setBounds(150,25,LENGTH,HEIGHT);
        addMouseListener(this);
	}
	
	public void paint(Graphics g)
	{
		try
		{
			BufferedImage background = ImageIO.read(new File("images\\background.jpg"));
			BufferedImage sampleWonder = ImageIO.read(new File("images\\wonders\\babylon.png"));
			int rand = (int)(Math.random()*(7))+1;
			System.out.println(rand);
			if(rand==1)
			{
				sampleWonder = ImageIO.read(new File("images\\wonders\\alexandria.png"));
			}
			if(rand==2)
			{
				sampleWonder = ImageIO.read(new File("images\\wonders\\babylon.png"));
			}
			if(rand==3)
			{
				sampleWonder = ImageIO.read(new File("images\\wonders\\ephesos.png"));
			}
			if(rand==4)
			{
				sampleWonder = ImageIO.read(new File("images\\wonders\\gizah.png"));
			}
			if(rand==5)
			{
				sampleWonder = ImageIO.read(new File("images\\wonders\\halikarnassus.png"));
			}
			if(rand==6)
			{
				sampleWonder = ImageIO.read(new File("images\\wonders\\olympia.png"));
			}
			if(rand==7)
			{
				sampleWonder = ImageIO.read(new File("images\\wonders\\rhodos.png"));
			}
			g.drawImage(background, 0, 0, LENGTH, HEIGHT, null);
			g.drawImage(sampleWonder, 425, 250, 700, 300, null);
		}
		catch (IOException e)
		{
			System.out.println(e);
		}
		
		g.setColor(Color.black);
		g.drawRect(425, 250, 700, 300); //Current player's wonder
		g.drawRect(425, 575, 100, 75); //button to show cards current player has built
		g.drawRect(625, 575, 100, 75); //war minus points
		g.drawRect(825, 575, 100, 75); //war plus points
		g.drawRect(1025, 575, 100, 75); //coins
		g.drawRect(500, 100, 75, 75); //current rotation
		g.drawRect(700, 100, 75, 75); //current age
		g.setColor(Color.red);
		g.drawRect(475, 475, 175, 75); //Wonder stage 1
		g.drawRect(685, 475, 175, 75); //Wonder stage 2
		g.drawRect(895, 475, 175, 75); //Wonder stage 3
		
	}
	
	public void paintWonder(Graphics g)
	{
		
	}
	public void mouseClicked(MouseEvent arg0) 
	{
		
	}
	public void mouseEntered(MouseEvent arg0) 
	{
		
	}
	public void mouseExited(MouseEvent arg0) 
	{
		
	}
	public void mousePressed(MouseEvent arg0) 
	{
			
	}
	public void mouseReleased(MouseEvent arg0) 
	{
		
	}
	public Board getBoard() 
	{
		return board;
	}

	public void setBoard(Board board) 
	{
		this.board = board;
	}
	
	public static void main(String[] args)
	{
		PlayerFrame g = new PlayerFrame();
	}
	
}