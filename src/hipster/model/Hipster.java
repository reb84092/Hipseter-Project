package hipster.model;

/*
 * @author rbar3155
 * @version 0.x Nov 19, 2015
 * 
 */
public class Hipster
{
	private String name;
	private String [] hipsterPhrases;
	private Book [] hipsterBooks;
	
	public Hipster()
	{
		this.name = "";
		this.hipsterPhrases = new String[4];
		this.hipsterBooks = new Book [3];
		setupArray();
		setupBooks();
	}
	
	private void setupArray()
	{
		
		
		
		
	}

	private void setupBooks()
	{
		Book firstBook, secondBook, thirdBook;
		firstBook = new Book();
		firstBook.setAuthor("Rosella Bowers");
		firstBook.setTitle("Escaping Eden");
		firstBook.setSubject("Science Fiction");
		firstBook.setPageCount(405);
		firstBook.setPrice(24.99);
		
		secondBook = new Book();
		secondBook.setAuthor("Rosella Bowers");
		secondBook.setTitle("The Dream Whisperer");
		secondBook.setSubject("Fantasy");
		secondBook.setPageCount(365);
		secondBook.setPrice(12.24);
		
		thirdBook = new Book(855, "Rosella Bowers", "Book of Light", "Fantasy", 124.99);
		
		
		hipsterBooks[0] = firstBook;
		hipsterBooks[1] = secondBook;
		hipsterBooks[2] = thirdBook;
	}
	
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String[] getHipsterPhrases()
	{
		return hipsterPhrases;
	}

	public void setHipsterPhrases(String[] hipsterPhrases)
	{
		this.hipsterPhrases = hipsterPhrases;
	}

	public Book[] getHipsterBooks()
	{
		return hipsterBooks;
	}

	public void setHipsterBooks(Book[] hipsterBooks)
	{
		this.hipsterBooks = hipsterBooks;
	}

	public Hipster(String name)
	{
		this.name = name;
	}
}
