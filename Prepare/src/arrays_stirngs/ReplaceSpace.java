package arrays_stirngs;
import java.util.Scanner;


public class ReplaceSpace {
	
	public static void replace_space(char[] str)
	{
		if ( str.length == 0 )
			return;
		System.out.println("in replace\n");
		int i,j=0,l = str.length;
		char new_str[] = {};
		new_str.toString();
		for(i=0;i<l;i++)
		{
			System.out.println("in for\n");
			if(str[i] == ' ')
			{	System.out.println("in if\n");
				new_str[j++] = '%';
				new_str[j++] = '2';
				new_str[j++] = '0';
				System.out.println("if completed\n");
			}
			else
				new_str[j++] = str[i];
		} 
		str = new_str;
		return;	
	}	

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		char[] str = scan.nextLine().toCharArray();
		replace_space(str);
		System.out.println(str);
		}
}
