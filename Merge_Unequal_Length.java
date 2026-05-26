import java.util.Arrays;

public class Merge_Unequal_Length {
    public static void main(String[] args) {
        int[] arr1={1,3,5};
        int n1=arr1.length;
        int[] arr2={2,4,6,8,9};
        int n2=arr2.length;
        int[] arr3=new int[n1+n2];
        int i=0,j=0,k=0;
        int length=Math.min(n1, n2);
        while(i<length){
            if(arr1[i]<arr2[j]){
                arr3[k]=arr1[i];
                i++;
                k++;
            }
            else{
                arr3[k]=arr2[j];
                k++;
                j++;
            }
        }
        if(n1>n2){
            for(int ptr=i;ptr<n1;ptr++){
                arr3[k]=arr1[ptr];
                k++;
            }
        }
        else{
            for(int ptr=j;ptr<n2;ptr++){
                arr3[k]=arr2[ptr];
                k++;
            }
        }
        System.out.println(Arrays.toString(arr3));
    }
}
    

