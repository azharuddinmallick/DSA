import java.util.Scanner;
public class Linear {
    public static void main(String args[])    {
        Scanner in=new Scanner(System.in);
        int a[]={1,2,3,4,5,6,7,8,9,10};
        System.out.print("Enter the number you want to search :: ");
        int num=in.nextInt(),flag=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==num){
                System.out.println("Number found at index number "+i);
                flag=1;
            }
        }
        if(flag==0)
        System.out.println("Number not found");
        in.close();
    }
}
