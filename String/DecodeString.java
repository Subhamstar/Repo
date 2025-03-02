import java.util.*;
// package String;
//input ==a2b3c4 output =aabbcccc   :=02-03-25
public class DecodeString {
    public static void main(String[] args) {
        String str="a2b3c4";
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
                for(int j=1;j<count;j++){
                    ans.append(ans.charAt(ans.length()-1));
                }
            }
            i++;
        }
        System.out.println(ans.toString());
    }
}
