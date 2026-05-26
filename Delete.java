import java.util.*;
class Delete {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={11,22,99,33,44,55};
        System.out.println("Enter location of the array:");
         int loc=sc.nextInt();
        for(int i=loc+1;i<arr.length;i++){
            arr[i-1]=arr[i];
        }
        for(int i=0;i<arr.length-1;i++){
        System.out.println(arr[i]);
        }
    }
}
