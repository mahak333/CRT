import java.util.Scanner;
public class Linear_Search {
    public static void main(String[] args) {
        int[] arr={25,234,4,346,45,41,77};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter element to search:");
        int target=sc.nextInt();
        int index=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                index=i;
                break;
            }
        }
        if(index==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at location: "+ index);
        }

    }
    
}
