import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[] arr={6,4,8,23,43,33,1,80};
        for(int i=0;i<arr.length;i++){
            int min=arr[i];
            int loc=i;
            for(int j=i+1;j<arr.length;j++){
                if(min>arr[j]){
                    min=arr[j];
                    loc=j;
                }
            }
            int temp=arr[i];
            arr[i]=min;
            arr[loc]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
