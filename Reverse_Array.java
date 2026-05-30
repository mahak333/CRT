import java.util.Scanner;
public class Reverse_Array {
    // public static void main(String[] args) {
    //     int[] arr={1,2,3};
    //     System.out.println("Array before reverse:");
    //     for(int i=0;i<arr.length;i++){
    //         System.out.print(arr[i]+" ");
    //     }
    //     Stack<Integer> st=new Stack<>();
    //     for(int i=0;i<arr.length;i++){
    //         st.push(arr[i]);
    //     }
    //     int[] res=new int[arr.length];
    //     int ptr=0;
    //     while(!st.isEmpty()){
    //         res[ptr++]=st.pop();
    //     }
    //     System.out.println("\nArray After reverse:");
    //     for(int i=0;i<res.length;i++){
    //         System.out.print(res[i]+" ");
    //     }
    // }
    int size;
    final int Capacity;
    int[] stack;
    public Reverse_Array(int Capacity){
        this.Capacity=Capacity;
        size=-1;
        stack=new int[Capacity];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int[] arr={1,2,3};
        Reverse_Array st=new Reverse_Array(arr.length);
        System.out.println("Array before reverse:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        for(int i=0;i<arr.length;i++){
            st.push(arr[i]);
        }
        int[] res=new int[arr.length];
        int ptr=0;
        while(!st.isEmpty()){
            res[ptr]=st.pop();
            ptr++;
        }
        System.out.println("\nArray After reverse:");
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
        sc.close();
        
        }

    public void push(int key){
        if(size==Capacity-1){
            System.out.println("Stack is full");
        }
        size++;
        stack[size]=key;
    }
    public int pop(){
        return stack[size--];
        
    }
    boolean isEmpty(){
        if(size==-1){
            return true;
        }
        else return false;
    }
    

}
