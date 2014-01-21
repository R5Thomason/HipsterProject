package hipster.view;

import hipster.controller.HipsterController;

import javax.swing.JFrame;

/**
 * The Frame used in the Hipster Project.
 * @author Ryan T.
 * @version 1.1 Added basic framework, added Documentation.
 */
public class HipsterFrame extends JFrame
{
	/**
	 * Reference to the controller object.
	 */
	private HipsterController baseController;
	/**
	 * Reference to the Panel for the Hipster Project.
	 */
	private HipsterPanel basePanel;
	
	/**
	 * Constructor for the Frame for the Hipster project.
	 * @param baseController Reference to the Controller object.
	 */
	public HipsterFrame(HipsterController baseController)
	{
		this.baseController = baseController;
		basePanel = new HipsterPanel(baseController);
		
		setupFrame();
	}
	
	/**
	 * Method to establish the Frame properties and put the panel inside it.
	 */
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(1000, 650);
		this.setVisible(true);
	}
}