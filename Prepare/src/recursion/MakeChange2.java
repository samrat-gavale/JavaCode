package recursion;

public class MakeChange2 {

	public static int makeChange(int n){
		int i,j,k,l;
		if(n<5)
			return 1;
		else if(n>=5 && n<10)
			return 2;
		else if(n>=10 && n<25){
			i = n/10;
			j = (n%10)/5;
			return i*num_spec(10)*j*num_spec(5);
		}
		else{
			i = n/25;
			j = (n%25)/10;
			k = (n%10)/5;
			return i*num_spec(25)*j*num_spec(10)*k*num_spec(5);
		}
	}
	
	public static int num_spec(int n){
		switch(n){
			case 5: return 2;
			case 10: return 4;
			case 25: return 13;
			default: return 1;
		}
	}
	
	public static void main(String args[]){
		System.out.println(makeChange(60));
	}
}
