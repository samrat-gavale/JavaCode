package Chapter1;

import java.util.ArrayList;
import java.util.Scanner;

public class Prob1 {
	public static void main(String args[]){
		int n, winner_found = 0;
		Scanner s = new Scanner(System.in);
		String str;
		n = s.nextInt();
		s.nextLine(); //scan the new line character at the end of the first line to go to the next line
		int votes[][] = new int[100][n];
		int min_vote_count = 0;
		ArrayList<Integer> temp_vote_count = new ArrayList<Integer>(n);
		ArrayList<String> candidates = new ArrayList<String>();
		int temp = n;
		while(temp != 0){			
			candidates.add(s.nextLine());
			System.out.print("Candidate - "+candidates.get(candidates.size()-1)+"\n");
			temp--;
		}
		temp = 0;
		int i,j,min,max=0,max_index=0,is_diff = 0;
		ArrayList<Integer> min_indexes = new ArrayList<Integer>();
		for(temp=0;temp<5;temp++)
			for(i=0;i<n;i++){
				votes[temp][i] = s.nextInt();
//				System.out.print("votes["+temp+"]["+i+"] - " + votes[temp][i]);				
			}
		int pref = 1;
		for(i=0;i<5;i++){
			if(temp_vote_count.size()>i)
				temp_vote_count.set(votes[i][1], temp_vote_count.get(votes[i][1])+1);
			else
				temp_vote_count.add(i, votes[i][1]);
		}
		while(true){
			for(i=0;i<n;i++){
				if(temp_vote_count.get(i)>max){
					max = temp_vote_count.get(i);
					max_index = i;
				}
				if((i>0) && (temp_vote_count.get(i-1)!=temp_vote_count.get(i)))
					is_diff = 1;
				if(temp_vote_count.get(i)>5/2){
					System.out.print(candidates.get(i));
					winner_found = 1;
					break;  //break the for loop
				}
			}
			if(winner_found == 1)
				break;      //break the while loop
			else if(is_diff == 0){
				System.out.print("Vote count of all the remaining "+n+"candidates tied.\n");
				break;
			}
			else{
				min = 1000;
				min_vote_count = 0;
				min_indexes.removeAll(null);
				for(i=0;i<n;i++)
					if(temp_vote_count.get(i)<min){
						min_vote_count = 1;   //reset the value to  1
						min = temp_vote_count.get(i);
						min_indexes.removeAll(null);
						min_indexes.add(i);
					}
					else if(temp_vote_count.get(i)==min){
						min_vote_count++;						
						min_indexes.add(i);
					}
				temp_vote_count.set(max_index, temp_vote_count.get(max_index)+min_vote_count);
				for(i=0;i<min_indexes.size();i++){
					temp_vote_count.remove(i);
					candidates.remove(i);
					n = n-min_vote_count;
				}		
			}
		}
	}
}
