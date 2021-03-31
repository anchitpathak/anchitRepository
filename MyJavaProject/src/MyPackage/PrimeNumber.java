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
	public static void numberBetween(int a, int b) {
		for(int i=a;i<=b;i++) {
			boolean res = isPrime(i);
			if(res)
				System.out.println(i);
		}
	}
	public static void main(String args[]) {
		int a=1, b=100;
		numberBetween(a,b);
		
	}

}
