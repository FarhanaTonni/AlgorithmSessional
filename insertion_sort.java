
package javaapplication2;

public class insertion_sort {
public static void main(String[] arg) {
        int i,j,k,n,temp=0;
        int a[]={-1,5,4,6,3,2};
       
        n=a.length;
        for(i=1;i<n;i++){
            System.out.println(a[i]);
        }
        for(k=2;k<n;k++){
            temp=a[k];
            j=k-1;
            while(j>0&&temp<a[j]){
                a[j+1]=a[j];
                j=j-1;
            }
            a[j+1]=temp;
        }
        for(i=1;i<n;i++){
            System.out.println(a[i]);
        }
    }
                 }



