package object_oriented.online_book_reader;

import java.util.ArrayList;

public class Catalogue {
	
	private ArrayList<Book> list = new ArrayList<Book>();  //stores the list of books in order of names
	
	public void add(Book b){
		int i;
		if(search(b.getName()) != null){
			System.out.print("This book already exists in the catalogue.\n");
			return;
		}
		for(i=0;i<this.list.size();i++){
			if(b.findPlace(this.list.get(i)) == 0){
				list.add(i, b);
				return;
			}
		}
	}
	
	public Book search(String s){
		int i;
		for(i=0;i<this.list.size();i++){
			if(this.list.get(i).getName()==s)
				return this.list.get(i);
		}
		return null;
	}
	
	public void remove(Book b){
		int i;
		for(i=0;i<this.list.size();i++){
			if(this.list.get(i)==b){
				this.list.remove(i);
				return;
			}
		}
	}
	
}
