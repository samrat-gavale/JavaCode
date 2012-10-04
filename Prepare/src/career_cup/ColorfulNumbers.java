package career_cup;

import java.util.ArrayList;
import java.util.Collections;

/* returns true if product of all the substrings of a number 
 * is unique
 */
public class ColorfulNumbers {
	
	public static void main(String[] args){
		int n = 263;
		
		if(isColorful(n) == true)
			System.out.print(n + " is colorful\n");
		else
			System.out.print(n + " is not colorful\n");
	}

	public static boolean isColorful(int n){
		ArrayList<Integer> num = new ArrayList<Integer>();
		int temp = n;
		while(temp>0){
			num.add(0, temp%10);
			temp = temp / 10;
		}
		int i, j, product = 0;
		ArrayList<Integer> prod = new ArrayList<Integer>();
		
		for(i = 0;i<num.size();i++)
		{
			product = 1;
			for(j = i;j<num.size();j++)
			{
				product = product * num.get(j);
				prod.add(product);
			}
		}
		Collections.sort(prod);
		System.out.print(prod);
		for(i=0;i<prod.size()-1;i++)
			if(prod.get(i) == prod.get(i)+1)
				return false;
		return true;
	}
}
