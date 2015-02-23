
package javaapplication2;
import java.util.Scanner;
public class Bin_Search {
    public static void main(String arg[]){
        int[] intArray=new int[10];
        int searchValue=0,index;
        System.out.println("Enter 10 numbers");
        Scanner input=new Scanner(System.in);
        for(int i=0;i<intArray.length;i++){
            intArray[i]=input.nextInt();
        }
        System.out.println("Enter a number to search for: ");
        searchValue=input.nextInt();
        index=binarySearch(intArray, searchValue);
        if(index!=1){
            System.out.println("Found a index: "+index);
        }
 else{
            System.out.println("Not found");
 }
    }
static int binarySearch(int[] intArray,int searchValue)
    {
    int low= 0,high,mid;
    high=intArray.length-1;
    while(low<=high)
    {
        mid=(low+high)/2;
        if(intArray[mid]==searchValue){
            return mid;
        }
 else if(intArray[mid]<searchValue)
        {
     low=mid+1;
 }
 else{
            high=mid-1;
 }
    }
    return-1;
}
}
                 

