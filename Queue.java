//Queue Implementation
import java.util.Scanner;
class Queue{
    int queue[],size,front,rear;
    public Queue(int n){
     size=n;
     queue=new int[size];
     front=0;
     rear=-1;
    }
    public void insert(int data){
        if(isFull()){
            System.out.println("Queue is full.");

        }
        else{
            rear++;
            queue[rear]=data;
        }
       
    }
    public int delele(){
        if(isEmpty()){
            return 0;
        }else{
            int temp=queue[front];
            for(int i=1;i<=rear;i++){
                queue[i-1]=queue[i];
            }
            rear--;
            return temp; 
        }
       
    }
    public void display(){
        if(isEmpty()){
            System.out.println("Queue is empty.");
        }
        else{
            for(int i=0;i<=rear;i++){
                System.out.print(queue[i]+" ");
            }
            System.out.println();
        }
      
    }
    public int peek(){
        if(isEmpty()){
            return 0;
        }else{
            System.out.println(queue[front]);
            return queue[front];
        }
    }
    public boolean isFull(){
        if(size==size-1){
            return true;
        }
        else
            return false;
    }
    public boolean isEmpty(){
        if(size==-1){
            return true;
        }
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Queue: ");
        int n=sc.nextInt();
        int data;
        Queue obj=new Queue(n);
        while(true){
            System.out.println("\n1. Insert");
            System.out.println("2. Delele");
            System.out.println("3. Display");
            System.out.println("4. Peek");
            System.out.println("0. Exit");
            int ch=sc.nextInt();
            switch(ch){
            case 1: System.out.println("Enter data: ");
                    data=sc.nextInt();
                    obj.insert(data);
                    break;
            case 2: data=obj.delele();
                    System.out.println(data+" is Deleled");
                    break;
            case 3: obj.display();
                    break;
            case 4: data=obj.peek();                    
                    break;
            case 0: System.exit(0);
            }
        }

    }
}