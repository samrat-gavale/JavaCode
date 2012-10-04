package arrays_stirngs;
import java.util.Scanner;

public class ReplaceSpace2 {
	
	public static void replace_space(StringBuilder str)
	{
		int i,l = str.length();
		for(i=0;i<l;i++)
		{
			if(str.charAt(i) == ' ')
			{	
				str.replace(i, i+1, "%20");
			}
			l = str.length();
		} 
		return;	
	}	

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		StringBuilder str = new StringBuilder();
		str.append(scan.nextLine());
		replace_space(str);
		System.out.println(str);
		}
}
