package object_oriented.online_book_reader;

public class Book {

	public enum Genre{
						SCIENCE(1), 
						FICTION(2), 
						TRAVEL(3), 
						ROMANCE(4);
						private int value;
						private Genre(int n){
							value = n;
						}
						public int getValue(){
							return value;
						}
	}
	
	public void Book(){		
	}
	
	public Book(String name, String author, String edition, String publisher,
			Genre genre) {
		this.name = name;
		this.author = author;
		this.edition = edition;
		this.publisher = publisher;
		this.genre = genre;
	}

	private String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getEdition() {
		return edition;
	}

	public void setEdition(String edition) {
		this.edition = edition;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	private String author;
	private String edition;
	private String publisher;
	private Genre genre;

	public int findPlace(Book b){
		String s1 = name;
		String s2 = b.name;
		int i=0;
		while(s1.charAt(i)==s2.charAt(i))
			i++;
		if(s1.charAt(i)>s2.charAt(i))
			return 1;
		else
			return 0;
	}

}
