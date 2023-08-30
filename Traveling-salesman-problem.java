import java.util.Scanner;
class  near
{
int a[][]=new int[20][20];
int n,i,j,r,c,st,l;
int s[]=new int[20];
void input()
	{
		Scanner d=new Scanner(System.in);
		System.out.println("enter the vertics");
		n=d.nextInt();
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
				{
					if(i!=j)
					{
						System.out.print("Enter the vertices  "+(i+1)+"  ,  "+(j+1)+"  = ");
							a[i][j]=d.nextInt();
							if(a[i][j]==0)
							{   
							     l++;
								System.out.println("Not complete graph");
								break;
							}
						}
				}
			if(l!=0)
				break;
		}
	if(l==0)
	{
		System.out.println("enter start vertices");
		st=d.nextInt();
	}
}
void logic()
{
	int p,h=0;
	s[r++]=st;
	for(i=0,p=st+1;i<n;i++)
		{
			if(p<n-1&&++h>0)
			{
				c+=a[p][p+1];
				s[r++]=p;
				p++;
			}
			else if(p==n-1 && ++h>0)
			{
				c+=a[p][0];
				s[r++] =p;
				p=0;	
			}
		}
	System.out.println("total cost = "+c);
	for(i=0;i<=n;i++)
		System.out.print(s[i]+"  - ");
	System.out.println();
	System.out.println("Number of times basic of operation excution ="+h);
}
}
class m
{
	public static void main(String v[])
	{
		near p=new near();
		p.input();
		if(p.l==0)
		{
		long t=System.nanoTime();
		p.logic();
		long t1=System.nanoTime();
		System.out.println("time complexity = "+(t1-t));
		}
	}
}