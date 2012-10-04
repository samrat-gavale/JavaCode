package arrays_stirngs;
import java.util.Scanner;


public class ReplaceSpace3 {
	public static char[] ReplaceFun(char[] str, int length) {
		
		int spaceCount = 0, newLength, i = 0;
			
		for (i = 0; i < length; i++) {
				
		if (str[i] == ' ') {
					
		spaceCount++;
				
		}
			
		}
			
		newLength = length + spaceCount * 2;
		
		char new_str[];
		new_str = new char[newLength+1];
		new_str[newLength] = '\0';
			
		for (i = length - 1; i >= 0; i--) {

		if (str[i] == ' ') {
					
		new_str[newLength - 1] = '0';
					
		new_str[newLength - 2] = '2';
					
		new_str[newLength - 3] = '%';
					
		newLength = newLength - 3;
				
		} else {
					
		new_str[newLength - 1] = str[i];
					
		newLength = newLength - 1;
				
		}
			
		}
		str = new char[newLength+1];
		str = new_str;
		return new_str;
		}

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		char str[] = scan.nextLine().toCharArray();
		ReplaceFun(str, str.length);
		System.out.println(str);
		}

}
