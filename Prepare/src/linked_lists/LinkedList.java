package linked_lists;

public class LinkedList {
	Node head;
	
	public LinkedList(int n){
		Node new_node = new Node(n);
		this.head = new_node;
	}
	
	public void append(int n){
		Node new_node = new Node(n);
		Node current = this.head;
		Node prev = null;
		while(current != null){
			prev = current;
			current = current.getNext();
		}
		prev.setNext(new_node);
	}
	
	public void print_list(){
		Node current = this.head;
		while(current != null){
			System.out.print(current.getVal());
			System.out.print(' ');
			current = current.getNext();
		}
		System.out.print('\n');
	}
	
	public void print_node(Node current){
			System.out.print(current.getVal());
			System.out.print(' ');
		System.out.print('\n');
	}
	public void create_circle(){
		Node current = this.head;
		Node prev = null;
		while(current != null){
			prev = current;
			current = current.getNext();
		}
		prev.setNext(head.getNext());
	}
	
	public Node find_circle(){
		int counter = 1;
		int temp;
		Node key = this.head;
		Node current = head.getNext();
		while(true){
			current = head.getNext();
			temp = 0;
			while(temp<counter){
				if(current == key)
					return key;
				else{
					current = current.getNext();
					temp++;
				}
			}
			counter++;
			key = key.getNext();
		}
	}
	
	public void reverse(){
		Node temp = this.head.getNext();
		Node temp_next = temp.getNext();
		Node prev = this.head;
		this.head.setNext(null);
		while(temp != null){
			temp_next = temp.getNext();
			temp.setNext(prev);
			prev = temp;
			temp = temp_next;
		}
		this.head = prev;
	}
}
