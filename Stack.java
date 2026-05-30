import java.util.Scanner;
public class Stack {
    int size;
    final int Capacity;
    int[] stack;
    Stack(int Capacity){
        this.Capacity=Capacity;
        size=-1;
        stack=new int[Capacity];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int Capacity=sc.nextInt();
        Stack st=new Stack(Capacity);
        while(true){
            System.out.println();
            System.out.println("1.Push");
            System.out.println("2.Pop");
            System.out.println("3.Traverse");
            System.out.println("4.Peek");
            System.out.println("0. Exit");
            System.out.println("Enter your choice");
            int ch=sc.nextInt();
            switch(ch){
                case 1:
                    System.out.println("Enter data element:");
                    int data=sc.nextInt();
                    st.push(data);
                    break;

                case 2:
                    st.pop();
                    break;
                
                case 3:
                    st.traverse();
                break;
            
                case 4:
                    st.peek();
                    break;
                case 0:
                    System.exit(0);
                }
        }

        
    }

    public void push(int key){
        if(size==Capacity-1){
            System.out.println("Stack is full");
        }
        size++;
        stack[size]=key;
    }
    public void pop(){
        if(size<0){
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Element Deleted: "+stack[size--]);
    }
    public void peek(){
        if(size==-1){
            System.out.println("Stack is empty.");
            return;
        }                           
        System.out.println("Element at top:" +stack[size]);

    }
    public void traverse(){
        if(size==-1){
            System.out.println("Stack is empty");
            return;
        }
        for(int i=0;i<=size;i++){
            System.out.print(stack[i]+" ");
        }
        System.out.println();

    }
    
}
