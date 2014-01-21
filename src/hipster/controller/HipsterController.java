package hipster.controller;

import javax.swing.JOptionPane;

import hipster.model.Hipster;
import hipster.view.HipsterFrame;

/**
 * Controller for the Hipster project.
 * @author Ryan Thomason
 * @version 1.1 11/19/13 Added constructor information, Added documentation.
 */
public class HipsterController
{
	/**
	 * The Frame that will be used in the project.
	 */
	private HipsterFrame appFrame;
	/**
	 * The Hipster that is me.
	 */
	private Hipster selfHipster;
	/**
	 * The array of Hipsters in my class.
	 */
	private Hipster [] classHipsters;
	/**
	 * The number of Hipsters in the classHipsters array.
	 */
	private int hipsterCount;
	
	/**
	 * Creates the controller for the Hipster Project to be used as part of the MVC paradigm.
	 */
	public HipsterController()
	{
		selfHipster = new Hipster();
		classHipsters = new Hipster [5];
		hipsterCount = 0;
	}
	
	/**
	 * Returns the selfHipster object.
	 * @return The Hipster that is in the selfHipster object.
	 */
	public Hipster getSelfHipster()
	{
		return selfHipster;
	}
	
	/**
	 * Changes the current Hipster.
	 * @param selfHipster The Hipster that will be changed into.
	 */
	public void setSelfHipster(Hipster selfHipster)
	{
		this.selfHipster = selfHipster;
	}
	
	/**
	 * Starts the app.
	 */
	public void start()
	{
		appFrame = new HipsterFrame(this);
	}
	
	/**
	 * Retrieves the Hipster from the specified position in the array.
	 * @param position The location in the array. It must be between 0 and cubbbyHipsters.length.
	 * @return The Hipster at the position in the array.
	 */
	public Hipster getSpecifiedHipster(int position)
	{
		Hipster currentHipster = null;
		
		if(position < classHipsters.length && position >= 0)
		{
			currentHipster = classHipsters[position];
		}
		
		return currentHipster;
	}
	
	/**
	 * Used to retrieve a random Hipster object from the array of class Hipsters.
	 * @return The random Hipster that is returned.
	 */
	public Hipster getRandomHipster()
	{
		Hipster currentHipster = null;
		
		int randomIndex = 0;
		double random = Math.random();
		randomIndex = (int)(random * classHipsters.length);
		currentHipster = classHipsters[randomIndex];
		
		return currentHipster;
	}
	
	/**
	 * This returns the Array of hipsters.
	 * @return This is the Array that is returned.
	 */
	public Hipster [] getClassHipsters()
	{
		return classHipsters;
	}
	
	/**
	 * Adds a new hipster to the classHipsters array.
	 * @param books The array of books that the hipster can read.
	 * @param name The name of the hipster.
	 * @param type What type the hipster is.
	 * @param phrase The catch-phrase of the hipster.
	 */
	public void addHipster (String [] books, String name, String type, String phrase)
	{
		if(hipsterCount < classHipsters.length)
		{
			Hipster tempHipster = new Hipster(name, type, phrase, books);
			classHipsters[hipsterCount] = tempHipster;
			hipsterCount++;
		}
		else
		{
			JOptionPane.showMessageDialog(appFrame, "The class is full. You are too mainstream to be added.");
		}
	}
}
