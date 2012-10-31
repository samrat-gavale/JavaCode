package recursion;

public class SeqAdd {

	// finds numbers that match the following pattern

	public static boolean validity(String num){

	int leng = num.length();
	//( for example) leng = 6 ) 121224
	// + is 1~leng/2
	// = is +~leng-1
	// . is =~leng

	for( int a = 0; a<leng/2; a++){
	for( int i = a+1; i<leng/2 ; i++){
	for(int j= i+1; j< leng -1; j++){
	for( int k=j+1; k<=leng; k++){
	int x = Integer.parseInt(num.substring(a, i));
	int y = Integer.parseInt(num.substring(i, j));
	int z = Integer.parseInt(num.substring(j, k));
	System.out.println( x+","+y+","+z);
	if(x+y==z){

	System.out.println( "------up-------");
	if(k==leng){
	return true;
	}else{
	continue;
	}

	}
	}
	}
	}
	}
	return false;

	}



	public static void main(String[] args){
	System.out.println(validity("22426"));
	}
	}
