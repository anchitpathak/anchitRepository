package HelloWorld;

import java.util.Stack;

//import jdk.internal.net.http.RequestPublishers.EmptyPublisher;

public class Directory {

	static String currentDirectory(String str) {
		
		Stack<String> s = new Stack<String>();
		int len= str.length();
		String cdp= "";
		cdp=cdp+"/";
		for(int i=0;i<len;i++) {
			String dir = "";
			while(i<len && str.charAt(i)=='/')
				i++;
				while(i<len && str.charAt(i)!='/') {
					dir+=str.charAt(i);
					i++;
				}
				if(dir.equals("..")) {
					if(!s.empty()) s.pop();
				}
				else if(dir.equals("."))
					continue;
				else if(dir.length()!=0)
					s.push(dir);
				
		}
			Stack<String> sr = new Stack<String>();
			while(!s.empty()) {
				s.pop();
			}
			while(!sr.empty()) {
				if(sr.size()!=1) {
					cdp+=(sr.pop()+"/");
				}
				else {
					cdp+=sr.pop();
				}
			}
			return cdp;
		}
		
	public static void main(String args[]) {
		String str1 = new String("a/b/c/../d/./e/../f/./g");
		String str2 = new String("/../../../../../..");
		String res1=currentDirectory(str1);
		String res2=currentDirectory(str2);
		System.out.println(res1);
		res1="home/test" + res1;
		res2="home/test" + res2;
		System.out.println(res1);
		System.out.println(res2);
	}

}
