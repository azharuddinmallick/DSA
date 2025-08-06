public class Prefix_sum
{
    public static void main(){
        int arr[] = {1,2,3,4,5};
        int carr[] = new int[5];
        int sum=0;
        for(int i=0;i<5;i++){
            sum+=arr[i]
            carr[i] = sum;
        }
        for(int i=0;i<5;i++){
            System.out.println(carr[i]);
        }
    }
}