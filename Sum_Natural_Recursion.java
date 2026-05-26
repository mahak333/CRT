public class Sum_Natural_Recursion {
    public static void main(String[] args) {
        System.out.println(sum(5));
    }
    static int sum(int x){
        if(x==1){
            return 1;
        }
        return x+sum(x-1);
    }
}
