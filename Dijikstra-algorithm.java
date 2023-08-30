import java.util.Scanner;
class bell
{
int a[][]=new int[20][20];
int v[]=new int[20],c=0;
int queue[]=new int[20];
int d[]=new int[20];
int n,st;
void input()
{

Scanner e=new Scanner(System.in);
System.out.println("enter no of vertex");
n=e.nextInt();
for(int i=0;i<n;i++)
{
	for(int j=0;j<n;j++)
	{
		System.out.print("enter the path cost from vertex  "+(i+1)+"vertex  "+(j+1));
		a[i][j]=e.nextInt();
	}
}
System.out.println("the matrix");
for(int i=0;i<n;i++)
{
	for(int j=0;j<n;j++)
		System.out.print("     "+a[i][j]);
System.out.println("\n");
}
}
void valid()
{
int c=0;
 for(int i=0;i<n;i++)
{
	for( int j=0;j<n;j++)
		{
			if(a[i][j]<0)
			{
				c++;
			}
	}
}
	if(c==0)
	{
		long t=System.nanoTime();
		logic();
		long t1=System.nanoTime();
		System.out.println("time complexity"+(t1-t));
	}
	else
		System.out.println("-ve edge path cost exist,can't perform dijikstra");
}
void logic()
{
int i,j,cu,m,k,min,l=0;
int path[][]=new int[20][20];
Scanner e=new Scanner(System.in);
System.out.println("9999 is the infinity value");
System.out.println("starting vertex:");
st=e.nextInt();
for(i=0;i<n;i++)
{
	if(i==st)
		d[i]=0;
	else
		d[i]=999;
path[i][0]=st;
for(k=1;k<n;k++)
	path[i][k]=-1;
v[i]=0;
}
cu=st;
v[st]=1;
for(i=0;i<n;)
{
	for(j=0;j<n;j++)
	{
		if(v[j]==0)
		{
			if(a[cu][j]!=9999)
			{
					m=d[cu]+a[cu][j];
					if(++l>0&&d[j]==9999)
					{
						d[j]=m;
						for(k=0;k<n;k++)
							path[j][k]=path[cu][k];
						for(k=1;k<n && path[j][k] !=-1;k++);
						path[j][k]=j;
					}
					else if(++l>0&&d[j]>m)
					{
						d[j]=m;
						for(k=0;k<n;k++)
							path[j][k]=path[cu][k];
						for(k=1;k<n && path[j][k] !=-1;k++);
						path[j][k]=j;
					}
			}
		}
	}
m=cu;
min=9999;
	for(j=0;j<n;j++)
	{
		if(v[j]==0)
		{
			if(++l>0&&min==9999)
			{
					min=d[j];
						m=j;
			}
			if(++l>0&&min>d[j])
			{
				min=d[j];
				m=j;
			}
		}
	}
if(min!=9999)
{
	cu=m;
	v[m]=1;
	i++;
}
else
	break;
}    
System.out.println("path from source vertex to all other vertices");
for( i=0;i<n;i++)
{
     for(j=0;j<n && path[i][j]!=-1;j++)
                System.out.print(path[i][j]+"   ");
System.out.println("\n");
}
     System.out.println("path cost");
     for(j=0;j<n;j++)
                 System.out.println(d[j]+" ");
    

System.out.println("no of times basic operation execution"+l);
}
}
class main
{
public static void main(String v1[])
{
bell b=new bell();
b.input();
b.valid();
}
}
