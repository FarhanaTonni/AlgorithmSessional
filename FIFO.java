import java.util.Scanner;
class FIFO
{
public static void main(String args[])
{
int pagefrm[]=new int[3];
int n;
Scanner br=new Scanner((System.in));
System.out.println("Enter the number of inputs :");
n=br.nextInt();
int inp[]=new int[n];
System.out.println("Enter the inputs:");
for(int i=0;i<n;i++)
inp[i]=br.nextInt();
System.out.println("—————");
for(int i=0;i<3;i++)
pagefrm[i]=-1;
int inp_matchd=0;
int Fault=0;
int j=0;
boolean check;
for(int i=0;i<n;i++)
{
check=false;
for(int k=0;k<3;k++)
if(pagefrm[k]==inp[i])
{
check=true;
inp_matchd=inp_matchd+1;
}
if(check==false)
{
pagefrm[j]=inp[i];
j++;
if(j>=3)
j=0;
Fault=Fault+1;
}
      System.out.print("frame : ");
            for(int k=0; k<3; k++)
                System.out.print(pagefrm[k]+" ");
            System.out.println();
           
        }

System.out.println("Inp_Matchd:"+inp_matchd+" FAULT:"+Fault);
}
}