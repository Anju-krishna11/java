package Javapack;

public class forprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=11;
int count=0;
if(n<=1) {
	System.out.println("The number is not prime");
	return;
}
	for(int i=1;i<=n/2;i++) {
		if(n%i==0) {
			count++;
		}
	}
	if(count>1) {
		System.out.println("The number is not prime");
		}
	else {
		System.out.println("The number is prime");
	}}}
	


