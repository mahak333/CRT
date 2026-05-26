import java.util.Scanner;
public class Binary_Search {
    public static void main(String[] args) {
        int [] arr={11,22,33,44,55,66,77};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter element to search:");
        int target=sc.nextInt();
        int left=0;
        int right=arr.length-1;
        int mid=(left+right)/2;
        while(left<=right){
            if(arr[mid]==target){
                System.out.println("Element found at location: "+mid);
                break;
            }
            else if(arr[mid] <target){
                left=mid+1;

            }
            else{
                right=mid-1;
            }

            mid=(left+right)/2;
        }
        if(left>right){
            System.out.println("Element not found");
        }

    }
    
}
