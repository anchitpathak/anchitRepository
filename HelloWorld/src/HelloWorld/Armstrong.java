package HelloWorld;
import java.util.*;


public class Armstrong{
    
    int power(int x, int y){
        if(y==0)
            return 1;
        if(y%2==0)
            return power(x,y/2)*power(x,y/2);
        return x*power(x,y/2)*power(x,y/2);
    }
    
    int order(int num){
        int n=0;
        while(num!=0){
            n++;
            num/=10;
        }
        return n;
    }
    
    boolean isArmstrong(int num){
        
        int find=num;
        int sum=0;
        int n=order(num);
        while(find!=0){
            int rem=find%10;
            sum+=power(rem,n);
            find/=10;
        }
        return(num==sum);
    }
    
    public static void main(String args[]){
        
        Armstrong a= new Armstrong();
        Scanner sc= new Scanner(System.in);
        
        int num[]= new int[5];
        System.out.println("Enter Numbers");
        for(int i=0;i<5;i++){
            num[i]= sc.nextInt();
        }
        HashMap<Integer, Boolean> map = new HashMap<>();
        for(int i=0;i<5;i++){
            map.put(num[i],a.isArmstrong(num[i]));
        }
        for(Map.Entry<Integer,Boolean> e: map.entrySet()){
        	if(e.getValue())
        		System.out.println(e.getKey()+"="+e.getValue());
        }
        
        //System.out.println(a.isArmstrong(num));
    }
}
