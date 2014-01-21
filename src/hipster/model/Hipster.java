package hipster.model;

/**
 * Creates the Hipster object.
 * @author RyanT
 * @version 1.3 20/11/13 Added getters/setters, overloaded constructor for additional hipsters, documentation comments.
 */
public class Hipster
{
	/**
	 * The name of the Hipster.
	 */
	private String name;
	/**
	 * The Hipster's type.
	 */
	private String hipsterType;
	/**
	 * The catch-phrase of the Hipster.
	 */
	private String hipsterPhrase;
	/**
	 * The Hipster's list of books.
	 */
	private String [] hipsterBooks;
	
	/**
	 * Creates a default Hipster object with values based on me.
	 */
	public Hipster()
	{
		hipsterBooks = new String[5];
		name = "Ryan";
		hipsterType = "Non-Hipster";
		hipsterPhrase = "I'm not a hipster.";
		
		fillTheBooks();
	}
	
	/**
	 * Creates a Hipster Object with the specified parameters to fill the component data members.
	 * @param name The name of the created Hipster.
	 * @param hipsterType The type of the created Hipster.
	 * @param hipsterPhrase The catch-phrase of this created Hipster.
	 * @param hipsterBooks An array of books for the Hipster.
	 */
	public Hipster(String name, String hipsterType, String hipsterPhrase, String [] hipsterBooks)
	{
		this.name = name;
		this.hipsterBooks = hipsterBooks;
		this.hipsterPhrase = hipsterPhrase;
		this.hipsterType = hipsterType;
	}
	
	/**
	 * Fills the array of Books for the Hipster to read.
	 */
	private void fillTheBooks()
	{
		hipsterBooks[0] = "Oxford Dictionary";
		hipsterBooks[1] = "The Hipster Handbook";
		hipsterBooks[2] = "The Dresden Files";
		hipsterBooks[3] = "The Wool Omnibus";
		hipsterBooks[4] = "A Song of Ice and Fire: A Game of Thrones";
	}
	
	/**
	 * Getter method to get the name.
	 * @return The name of the Hipster.
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * Getter method to get he Hipster Type.
	 * @return The type of the Hipster.
	 */
	public String getHipsterType()
	{
		return hipsterType;
	}
	
	/**
	 * Getter method to get the Hipster catch-phrase.
	 * @return The hipster catch-phrase.
	 */
	public String getHipsterPhrase()
	{
		return hipsterPhrase;
	}
	
	/**
	 * Getter method to get the array of books for Hipster to read.
	 * @return The array of books for the Hipster.
	 */
	public String[] getHipsterBooks()
	{
		return hipsterBooks;
	}
	
	/**
	 * Setter for the name of the Hipster.
	 * @param name The name of the Hipster.
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	
	/**
	 * Setter for the Type of the Hipster.
	 * @param hipsterType The type of the Hipster.
	 */
	public void setHipsterType(String hipsterType)
	{
		this.hipsterType = hipsterType;
	}
	
	/**
	 * Setter for the Hipster catch-phrase.
	 * @param hipsterPhrase The catch-phrase of the hipster.
	 */
	public void setHipsterPhrase(String hipsterPhrase)
	{
		this.hipsterPhrase = hipsterPhrase;
	}
	
	/**
	 * Setter for the array of Books for the Hipster.
	 * @param hipsterBooks The array of Books for the Hipster.
	 */
	public void setHipsterBooks(String[] hipsterBooks)
	{
		this.hipsterBooks = hipsterBooks;
	}

}
