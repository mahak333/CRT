public class Power_Recursion {
    public static void main(String[] args) {
        System.out.println(power(2,3));
    }
    
static int power(int x,int y){
    if(x==1 || y==1){
        return x;
    }
    else if(y==0){
        return 1;
    }
    return x*power(x,y-1);
}
}

