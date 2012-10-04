package jp.co.worksap.recruiting;

import java.util.List;
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class ExamPeekableQueueImpl<E extends Comparable<E>> implements ExamPeekableQueue<E> {
	
	List<E> queue = new ArrayList();
	// do not delete the definition of default constructor
	public ExamPeekableQueueImpl() {
	}
	
	@Override
	public void enqueue(E e) {
		if ( e == null ) {
		      throw new IllegalArgumentException("Argument doen not have any content.");
		}
		else
			queue.add(e);
	}

	@Override
	public E dequeue() {
		if(queue.isEmpty())
			throw new NoSuchElementException("The queue is empty.");
		else
			return queue.remove(0);
	}

	public List sortList(){
		E temp;
		List<E> queue2 = new ArrayList<E>();
		for(int i=0;i<queue.size();i++){
			queue2.add(queue.get(i));
		}
			for(int i=0;i<queue2.size();i++){
			for(int j=i+1;j<queue2.size();j++)
				if( queue2.get(i).compareTo( queue2.get(j) ) > 0 ){  
					temp = queue2.get(i);
					queue2.set(i, queue2.get(j));
					queue2.set(j, temp);
				}
		}
		return queue2;
	}
	@Override
	public E peekMedian() {
		List<E> temp_list = sortList();
		
		/*
		 * we are not adding one to value passed to 'get' as given in
		 *  formula since list is indexed starting from zero
		 */
		return temp_list.get( temp_list.size()/2 );  
	}

	@Override
	public E peekMaximum() {
		if(queue.isEmpty())
			throw new NoSuchElementException("The queue is empty.");
		else{
			E max = queue.get(0);
			E temp;
			for(int i=1;i<queue.size();i++){
				if( ( temp = queue.get(i) ).compareTo(max) > 0)
					max = temp;
			}
			return max;
		}
	}

	@Override
	public E peekMinimum() {
		if(queue.isEmpty())
			throw new NoSuchElementException("The queue is empty.");
		else{
			E min = queue.get(0);
//			System.out.print(queue.size()+" is the size.");
			E temp;
			for(int i=1;i<queue.size();i++){
//				System.out.print(queue.get(i)+"\n");
				if( ( temp = queue.get(i) ).compareTo(min) < 0)
					min = temp;
			}
			return min;
		}
	}

	@Override
	public int size() {
		return queue.size();
	}
	
	public static void main(String args[]){
	      ExamPeekableQueueImpl<Integer> my_queue = new ExamPeekableQueueImpl<Integer>();
	      my_queue.enqueue(2);
	      my_queue.enqueue(1);
	      my_queue.enqueue(2);
	      my_queue.enqueue(2);
	      my_queue.enqueue(6);
	      my_queue.enqueue(4);
	      my_queue.enqueue(2);
	      my_queue.enqueue(5);

/*	      my_queue.enqueue(7);
	      my_queue.enqueue(1);
	      my_queue.enqueue(3);
	      my_queue.enqueue(3);
	      my_queue.enqueue(5);
	      my_queue.enqueue(1);
	      my_queue.enqueue(2);
	      my_queue.enqueue(4);
	      my_queue.enqueue(3);
*/	      
	      System.out.print("Min - "+my_queue.peekMinimum()+"\n");
	      System.out.print("Max - "+my_queue.peekMaximum()+"\n");
	      System.out.print("Median - "+my_queue.peekMedian()+"\n");
	      System.out.print("Size - "+my_queue.size()+"\n");
	      System.out.print("Dequeued element - "+my_queue.dequeue()+"\n");
	      System.out.print("Dequeued element - "+my_queue.dequeue()+"\n");

	}
}
