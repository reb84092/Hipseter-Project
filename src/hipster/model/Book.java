package hipster.model;

public class Book
{
	private int pageCount;
	private String author;
	private String subject;
	private String title;
	private double price;
	
	public Book()
	{
		this.pageCount = 0;
		this.author = "";
		this.subject = "";
		this.title = "";
		this.price = -0.00;
	}
	
	public Book(int pageCount, String author, String subject, String title, double price)
	{
		this.pageCount = pageCount;
		this.author = author;
		this.subject = subject;
		this.title = title;
		this.price = price;
	}
	
	public int getPageCount()
	{
		
	}
	
	public String getAuthor()
	{
		
	}
	
	public String getSubject()
	{
		
	}
	
	public String getTitle()
	{
		
	}
	
	public double getPrice()
	{
		
	}

	public void setPageCount(int pageCount)
	{
		this.pageCount = pageCount;
	}

	public void setAuthor(String author)
	{
		this.author = author;
	}

	public void setSubject(String subject)
	{
		this.subject = subject;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	public void setPrice(double price)
	{
		this.price = price;
	}

	
}
