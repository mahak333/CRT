public class Multiply_Recusion {
    public static void main(String[] args) {
        System.out.println(multiply(2,3));
    }
    
    static int multiply(int x,int y){
        if(x==1){
            return y;
        }
        else if(y==1){
            return x;
        }
        else if(x==0 || y==0){
            return 0;
        }
        return x+multiply(x,y-1);
    }
}
