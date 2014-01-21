package hipster.view;

import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 * This is the panel that contains the picture of the Hipster being talked about.
 * @author Ryan T.
 * @version 1.0 Created Class and did everything.
 */
public class PicturePanel extends JPanel
{
	/**
	 * This is the original image in the frame.
	 */
	private Image baseImage;
	
	/**
	 * This is where the picture is coming from.
	 */
	private ImageIcon pictureSource;
	
	/**
	 * This is the how wide the panel is.
	 */
	private int width;
	
	/**
	 * This is how tall the panel is.
	 */
	private int height;
	
	/**
	 * This tells the class where to get the picture.
	 * @param imagePath This is the URL of the picture.
	 */
	public void setPictureSource(URL imagePath)
	{
		this.pictureSource = new ImageIcon(imagePath);
	}
	
	/**
	 * Creates a PicturePanel object with the specified URL path, width, and height.
	 * @param imagePath The URL address for the picture.
	 * @param width The width of the panel.
	 * @param height The height of the panel.
	 */
	public PicturePanel(URL imagePath, int width, int height)
	{
		this.width = width;
		this.height = height;
		this.pictureSource = new ImageIcon(imagePath);
	}
	
	/**
	 * Overrides the paintComponent method of JPanel to draw the image to fill the entire panel.
	 */
	@Override
	protected void paintComponent(Graphics panelGraphics)
	{
		super.paintComponent(panelGraphics);
		baseImage = pictureSource.getImage();
		panelGraphics.drawImage(baseImage, 0, 0, width, height, null);
	}

}
