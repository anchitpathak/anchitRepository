package HelloWorld;

public class NoOfOccurenceOfCharacter{
    
    public static void Occurence(String str){
        
        int len=str.length();
        int count[]=new int[256];
        for(int i=0;i<len;i++){
            count[str.charAt(i)]++;
        }
        
        char ch[]= new char[len];
        for(int i=0;i<len;i++){
            ch[i]=str.charAt(i);
            int temp=0;
            for(int j=0;j<=i;j++){
                if(ch[i]==ch[j]){
                   temp++; 
                }
            }
            if(temp==1){
                System.out.println(ch[i]+"="+count[ch[i]]);
            }
        }
    }
    
    public static void main(String[] args){
        String str="aabbcb";
        Occurence(str);
    }
}
