import java.util.*;
class Tdid
{
              public static void main(String arg[])
              {
                     int[][] a=new int[10][10];
	   
	   
	   int i,j,n,m,f=0;
                     Scanner t=new Scanner(System.in);
                     System.out.println("Enter n");
                     n=t.nextInt();
	   System.out.println("Enter m");
                     m=t.nextInt();
	   System.out.println(" enter array A matrix value");
                    for (i=0;i<n;i++)
                    {
                          for(j=0;j<m;j++)
                          {
	          
                             a[i][j]=t.nextInt();
	          
	         }
                          
                     }
                  
	         
                   
	  for(i=0;i<n;i++)
                   {
                        for(j=0;j<m;j++)
                        {
                               System.out.print(a[i][j]+"     ");
                          }
                        System.out.println();
                     }
	 for (i=0;i<n;i++)
                    {
                          for(j=0;j<m;j++)
                          {
	           if(i==j && a[i][j]==1)
                               {
	                  f=1;
		break; 
                                }
                             if(i!=j && a[i][j]==0)
                               {
	                  f=1;
		break; 
                                }
                             
	         }
	}
	if(f==1)
                    
                       System.out.println("enter matrix is identity matrix");
                     }
                     else{
                              System.out.println("enter matrix is not identity matrix");
                         }
                
       }
}

          
