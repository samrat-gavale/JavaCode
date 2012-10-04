
public class CommonFind{
public static void main(String[] args){

 String s1 = new String("AMITABH BACCHAN");
 String s2 = new String("RAJNIKANTH");

 int[] arr = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};

	int l1 = s1.length();
	int l2 = s2.length();
	
	int counter = 0;
	for(counter = 0;counter < l1; counter++){
		if ( (Character.isLetter(s1.charAt(counter)) ) && (arr[s1.charAt(counter) - 'A'] == 0) )
				arr[s1.charAt(counter) - 'A']++;				
	}
	for(counter = 0;counter < l2; counter++){
		if ( (arr[s2.charAt(counter) - 'A'] == 1) )
				arr[s2.charAt(counter) - 'A']++;				
	}
	for(counter = 0;counter < 26; counter++){
		if (arr[counter] == 2)
			System.out.print((char)('a' + counter));
	}
}
}

