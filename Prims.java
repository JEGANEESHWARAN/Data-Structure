import java.util.Scanner;
class prims
{
	int a[][]=new int[20][20];
	int v[]=new int[20];
	int co[]=new int[20];
	int pa[][]=new int[20][20];
	int n,s;
	void input()
	{	
		int i,k,j;
		Scanner d=new Scanner(System.in);

		System.out.println("entyer the vertics");
		n=d.nextInt();

		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{	
				System.out.print("enter the path cost vertex  "+i+"  to  "+j+"=");
				a[i][j]=d.nextInt();	
			}
		}
		System.out.println("enter source vertex");
		s=d.nextInt();
		for(i=1;i<=n;i++)
		{
			for(k=1;k<=n;k++)
				pa[i][k]=-1;	
	
		pa[i][1]=s;
	}
	}
	void logic()
	{	
		int st=s,m=s,i=0,j=0,c=0,t=0,l=0,x=0,k,u=0;
		v[st]=1; 
	while(c<n-1)
	{	
		int min=999;
		for(i=1;i<=n;i++)
		{
			if(++u>0&&v[i]==1)
			{
			for(j=1;j<=n;j++)
			{
				if(++u>0&&v[j]!=0&&a[i][j]!=0)
				{
					if(a[i][j]<min)
						{
							min=a[i][j];
							m=j;
							x=i;
							for(k=1;k<=n;k++)
								pa[j][k]=pa[x][k];
							for(k=2;k<=n&&pa[j][k]!=-1;k++);
							pa[j][k]=j;
						}
				}
			}
		}
		}
		v[m]=1;
		co[l++]=min;
		c++;
	}
	System.out.println("no of times basic operation ="+u);
	}
	void disply()
	{	int y=0,i,j;
		System.out.println("total no of path cost");
		for(i=0;i<n;i++)
		{		
			y=y+co[i];
		}
		System.out.println(y);
		System.out.println("path from source vertex to all possible vertices");
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n&&pa[i][j]!=-1;j++)
				System.out.print("    "+pa[i][j]);
		System.out.println("\n");
		}
	}

}
class main
{
	public static void main(String r[])
	{
		prims p=new prims();
		p.input();
		long t=System.nanoTime();
		p.logic();
		long t1=System.nanoTime();
		System.out.println("time complexity"+(t1-t));
		p.disply();
	}
}