import java.io.*;
import java.util.*;
  public class ArrayIn{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter N:");
      int N=sc.nextInt();
      System.out.println("Enter K:");
      int K=sc.nextInt();
      int A[]=new int[N+K];
      int i,j,max=0;
      System.out.println("Enter "+N+" Terms");
      for(i=0;i<N;i++)
      {
        A[i]=sc.nextInt();
      }
      System.out.println("Enter "+K+" Terms");
      for(i=N;i<N+K;i++)
      {
        A[i]=sc.nextInt();
		
				for(i=0;i<N+K;i++)
					{
					for(j=0;j<N+K;j++)
						{
							if(A[i]>A[j])
							{
								max=A[i];
							}
						}
					}
					System.out.println("MAX:"+max);
      }
      
      
    }
  }  
      
