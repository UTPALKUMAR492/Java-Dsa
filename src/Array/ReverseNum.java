package Array;


public class ReverseNum {
    public static void main(String[] args) {
        int[] arr = {5,6,8,0,0,8,0,9,6,3,1,6,5};

        int x= arr.length-1;
        int i=0;
        while(i<=x){
            int temp=arr[i];
            arr[i]=arr[x];
            arr[x]=temp;
            i++;
            x--;
        }

        for( int ele: arr){
            System.out.print(ele);
        }
    }
}
