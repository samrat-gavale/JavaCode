package arrays_stirngs;
import java.util.Scanner;


public class UniqueChars {
	public static boolean unique_chars(String str){
		int l = str.length();
		int i,j;
		for(i=0;i<l;i++)
			for(j=i+1;j<l;j++)
				if(str.charAt(i)==str.charAt(j))
					return false;
		return true;
	}
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		if(unique_chars(str))
			System.out.println("Unique chars!\n");
		else
			System.out.println("Non unique chars!\n");
		}
	
	
}
