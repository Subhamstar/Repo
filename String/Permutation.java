import java.util.*;
public class Permutation{
    static List<String>ps;
    static void permutation(String str,String res,int id){
        if(id==str.length()){
            return;
        }
        if(res.length()==str.length())ps.add(res);
        for(int i=0;i<=res.length();i++){
            char c=str.charAt(id);

        }
    }
    public static void main(String[] args) {
        ps=new ArrayList<>();
    }
}