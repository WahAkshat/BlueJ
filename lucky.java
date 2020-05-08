import java.util.*;
class lucky
{
    int c=5;
    
    void make(int a[],int i){
        for(int j=0;j<c;j=j+i)
        {
            if (j==0)
            continue;
            else
            a[j]=0;
        }
        int b[]= new int[c];
        int k=0;
        for(int j=0;j<c;j=j++)
        {
            System.out.println(a[j]);
        }
        
        for(int j=0;j<c;j=j++)
        {
            if(a[j]!=0)
            b[k++]=a[j];
        }
        for(int j=0;j<c;j=j++)
        {
            System.out.println(b[j]);
        }
        
        
    }
    
    // void main(int d){
        // c=d;
        // this.a=new int [c];
        // for(int j=0;j<c;j=j++)//1st time values
            // a[j]=j+1;
           
        // for(int i=1;i<=c;i++)
            // a = make(a,i);
        
        // for(int j=0;j<c;j=j++)
            // System.out.println(a[j]);
            
        // }
    }
            
    