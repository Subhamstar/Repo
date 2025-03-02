import java.util.*;
public class DecodeStringWithRepetation {
    //input: jon2kd3op3  output:jonjonkdkdkdopopop(jon repets 2 times kd repets 3 times op repets 3 times)
    public static String findlast(StringBuilder str){
        int n=str.length()-1;
        while(n>=0&&Character.isLetter(str.charAt(n))){
            n--;
        }
        return str.substring(n+1);
    }
    public static void main(String[] args) {
        String str="jontu2k2";
        StringBuilder ans=new StringBuilder();
        int n=str.length();
        int i=0;
        while(i<n){
            char ch=str.charAt(i);
            if(Character.isLetter(ch)){
                ans.append(ch);
            }
            else{
                int count=ch-'0';
                String lastsegment=findlast(ans);
                for(int j=1;j<count;j++){
                    ans.append(lastsegment);
                }
            }
            i++;
        }
        System.out.println(ans.toString());
    }
}
