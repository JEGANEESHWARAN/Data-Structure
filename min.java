import java.util.Scanner;
class min
{
	int a[]=new int[20];
	int n,min,max,c;
	void input()
	{
		Scanner d=new Scanner(System.in);
		System.out.println("enter the number");
		n=d.nextInt();
		for(int i=0;i<n;i++)
			a[i]=d.nextInt();
		long t=System.nanoTime();
		div(a,0,n-1);
		long t1=System.nanoTime();
		System.out.println("time complexity"+(t1-t));
	}
	void div(int a[],int st,int end)
	{	int mid,m,m1;
		if(++c>0&&st==end)
		{
			min=a[st];
			max=a[st];
		}
		else
		{
			mid=(st+end)/2;
			div(a,st,mid);
			m=min;
			m1=max;
			div(a,mid+1,end);
			if(++c>0&&m<min)
				min=m;
			else if(++c>0&&m1>max)
				max=m1;
		}
}
void dis()
	{
	System.out.println("number times basic operation execution"+c);
	System.out.println("minimun element"+min);
	System.out.println("maximum element"+max);
	}
}
class main
{
	public static void main(String v[])
	{
		min m=new min();
		m.input();
		m.dis();
	}
}