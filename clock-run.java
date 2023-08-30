import java.util.*;
class HelloWorld 
{
    public static void main(String[] args) 
    {
        System.out.println("Hello, World!");
        Scanner d=new Scanner(System.in);
        int i,t,n,j;
        n=d.nextInt();
       int a[]=new int[10];
        for(i=0;i<n;i++)
            a[i]=d.nextInt();
	System.out.println("Hello, World!");
    for(j=0;j<n;j++)    
    {
        for(i=0;i<n;i++)
        {
            t=a[i];
		    a[i]=a[i+1];
            a[i+1]=t;
            System.out.print(a[i]+"    ");
        }
    System.out.println();
    }
}
}
