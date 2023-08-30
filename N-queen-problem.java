import java.util.Scanner;
class queen
{
	int a[][]=new int[20][20];
	int i,j,k,n;
	void input()
	{
		Scanner d=new Scanner(System.in);
		System.out.println("Enter the n");
		n=d.nextInt();
	}
	int logic(int i,int j,int n)
	{
		for(int p=i,u=0;u<n;u++)
		{
			if(a[p][u]==1)
				return 0;
		}
		
		for(int k=i,m=j;k>=0 && m<n;k--,m++)	
		{
			if(a[k][m]==1)
				return 0;
		}
		for(int z=i,y=j;z>=0&&j>=0;z--,y--)
		{
			if(a[z][y]==1)
				return 0;
		}
		return 1;	
	}
	void sid()
	{
		int i=0;
		if(i<n)
		{
			for(int j=0;j<n;j++)
			{
				if(logic(i,j,n)==1)
				{
					a[i][j]=1;
					i++;
					sid();
				}
			}
		}
	}
void dis()
{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
				System.out.print("    "+a[i][j]);
		System.out.println();
		}
}
}
class m
{
	public static void main(String v[])
	{
	queen h=new queen();
	h.input();
	h.sid();
	h.dis();
	}
}