package career_cup;

public class Sum_Smaller_Than_Current {

public static int getSumofLessSum(int[] test,int begin,int end){
	if(begin==end){
		return 0;
		}
	if(begin==end-1){
	if(test[begin]<=test[end]){
	return test[begin];
	}
	else{
	swap(test,begin,end);
	return 0;
	}
	}
	int mid=(begin+end)/2;
	int leftPart=getSumofLessSum(test,begin,mid);
	int rightPart=getSumofLessSum(test,mid+1,end);
	int mergeSum=mergeTwoPartGetSum(test,begin,mid,end);
	return leftPart+rightPart+mergeSum;
}
public static int mergeTwoPartGetSum(int[] test,int begin,int mid,int end){
	int[] helpArray=new int[end-begin+1];
	int begin1=begin;
	int end1=mid;
	int begin2=mid+1;
	int end2=end;
	int result=0;
	int helpArrayIndex=0;
	
	while(begin1<=end1&&begin2<=end2){
	if(test[begin1]<=test[begin2]){
	result+=test[begin1]*(end2-begin2+1);
	helpArray[helpArrayIndex++]=test[begin1++];
	}
	else{
	helpArray[helpArrayIndex++]=test[begin2++];
	}
	}
	
	if(begin1>end1){
		for(;begin2!=end2+1;){
			helpArray[helpArrayIndex++]=test[begin2++];
		}
	}
	else{
		for(;begin1!=end1+1;){
			helpArray[helpArrayIndex++]=test[begin1++];
		}
	}
	
	for(int i=0;i!=helpArray.length;i++){
		test[begin++]=helpArray[i];
	}
	
return result;
}
public static void swap(int[] test,int begin,int end){
int tmp=test[begin];
test[begin]=test[end];
test[end]=tmp;
}
public static void main(String[] args) {
int[] test={3,1,2,4,6,2,7,5};
System.out.println(getSumofLessSum(test,0,test.length-1));

int answer=(1)+(3+1+2)+(3+1+2+4)+(1+2)+(3+1+2+4+6+2)+(3+1+2+4+2);
System.out.println(answer);
}

}