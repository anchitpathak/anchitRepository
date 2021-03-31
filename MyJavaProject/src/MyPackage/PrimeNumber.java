package MyPackage;

public class PrimeNumber {
	
	public static boolean isPrime(int n) {
		int flag=0;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				flag=1;
			}
		}
		if(n<2||flag==1) {
			return false;
		}
		else
			return true;
			//System.out.println(n+" is prime number" );
	}
	public static void main(String args[]) {
		int n=4;
		System.out.println(isPrime(n));
		
	}

}
