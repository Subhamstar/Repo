package TwoPointer;
public class LongestSubstringwithAtmostKdistinctCharacter{
    public static int longestSubstring(String str,int k){
        if(str == null || str.length() == 0 || k <= 0) return 0;
        int n = str.length();
        
        return 0;
    }
    public static void main(String[] args) {
        String s = "abcba";
        int k = 2;
        System.out.println(longestSubstring(s, k)); // Output: 3
    }
}