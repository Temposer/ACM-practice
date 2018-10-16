package oj;
import java.util.Scanner;
import java.util.Stack;

public class two {

	public static void main(String[] args) {
		Scanner ac=new Scanner(System.in);
		int num=ac.nextInt();
		String[] acm=new String[num];
		for(int i=0;i<num;i++) {
			acm[i]=ac.next();
		}
		for(int i=0;i<acm.length;i++) {
			boolean xx=isComplete(acm[i]);
			if(xx=false) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
		}
		/**
		
		
		
		for(int i=0;i<num;i++)
		{
			char [] aa=new char[acm[i].length()];
			int [] bb=new int[acm[i].length()];
			for(int j=0;j<acm[i].length();j++)
			{
				
				if(acm[i]!=null) 
				{
					aa[j]=acm[i].charAt(j);	
				}
				
			 }
			if(aa.length%2==0) {
				int sum=0;
				for(int h=0;h<aa.length;h++) {
					switch(aa[h]) {
					case '[':bb[h]=1;break;
					case ']':bb[h]=-1;break;
					case '(':bb[h]=500;break;
					case ')':bb[h]=-500;break;
					}
					sum=sum+bb[h];
				}
				if(sum==0) {
					int lsum=0,rsum=0;
					for(int m=0;m<bb.length/2;m++) {
						lsum=lsum+bb[m];
					}
					for(int m=bb.length/2;m<bb.length;m++) {
						rsum=rsum+bb[m];
					}
					if(lsum-rsum>=0) {
						System.out.print("这样做事错误解法");
					}
					else {
						System.out.print("no");
					}
				}
				else {
					System.out.println("no");
				}
				
			}
			else {
				System.out.println("no");
			}
			
			
		}
		**/
		

	}
	public static boolean isComplete(String s) {
		Stack<String> left=new Stack<String>();
		while(!s.isEmpty()) {
			String character=s.substring(0, 1);
			s=s.substring(1);
			if(character.equals("[")||character.equals("(")) {
				left.push(character);
			}
			else if(character.equals(")")||character.equals("]")){
				if(left.isEmpty()) {
					return false;
				}
					
				String leftChar=left.pop();
				if(character.equals("(")) {
					if(!leftChar.equals(")")) {
						return false;
					}
						
				}
				else if(character.equals("[")) {
					if(!leftChar.equals("]"))
					{
						return false;
					}
				}
			}
		}
		return left.isEmpty();
	}

}
