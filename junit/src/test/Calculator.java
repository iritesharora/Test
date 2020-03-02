package test;

public class Calculator {
   int res=0;
	public int add(int... a  )
	{
		 for(int i=0;i<a.length;i++){res+=a[i];}
		 return res;
	}
	public int mul(int... a) {
		// TODO Auto-generated method stub
		int res1=1;
		 for(int i=0;i<a.length;i++){res1*=a[i];}
		 return res1;
		
	}
	public int div(int a,int b)
	{
		
		 return a/b;
	}
	public int sub(int a,int b)
	{
		
		 return a-b;
	}
}
