public class CapG {
    public static void main(String[] args) {
        String s="aabbbeeeeffggg";
        int count=0;
        StringBuilder res=new StringBuilder();
        int i=0;
        while(i < s.length()){
            count=0;
            for(int j=i;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    count ++;
                }
                else{
                    break;
                }
            }
                res.append(s.charAt(i));

            if(count >1 ){
                res.append(count);
            }
            i=i+count;
        }
        System.out.println(res.toString());
    }
    
}
