// import java.util.Scanner;
public class Reverse_Queue {
    public static void main(String[] args) {
        int n =2;
        Queue q=new Queue(2);
        q.insert(1);
        q.insert(2);
        Stack st=new Stack(2);
        for(int i=0;i<n;i++){
            st.push(q.delele());
        }
        for(int i=0;i<n;i++){
            q.insert(st.pop());

        }
        q.display();
        
    }

    
}
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
        if(rear==size-1){
            return true;
        }
        else
            return false;
    }
    public boolean isEmpty(){
        if(rear==-1){
            return true;
        }
        else
            return false;
    }
}
class Stack {
    int size;
    final int Capacity;
    int[] stack;
    Stack(int Capacity){
        this.Capacity=Capacity;
        size=-1;
        stack=new int[Capacity];
    }
  
    public void push(int key){
        if(size==Capacity-1){
            System.out.println("Stack is full");
        }else{
            size++;
            stack[size]=key;
        }
    }
    public int pop(){
        if(size<0){
            System.out.println("Stack is empty");
            return 0;
        }
        return stack[size--];
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
    public boolean isFull(){
        if(size==Capacity-1){
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
    
}


