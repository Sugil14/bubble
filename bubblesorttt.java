import java.util.*;
import java.util.Scanner;
class bubblesorttt
{
	public static void main(String[]args)
{	
	int n;
	Scanner s=new Scanner(System.in);
	System.out.println("enter size: ");
	n=s.nextInt();

	int [] sugil = new int[n];
	System.out.println("enter elements : ");
	for(int c=0;c<n;c++)
{
	sugil[c]=s.nextInt();
}
	for(int c=0;c<n-1;c++)
{
	for(int d=0;d<n-c-1;d++)
{
	if( sugil[d] > sugil[d+1])
{
	int swap = sugil[d+1];
	sugil[d+1]= sugil[d];
	sugil[d] = swap;
}
}
}
System.out.println("after sorting :");
	for(int c=0;c<n;c++)
System.out.println(sugil[c]);
}
}
	