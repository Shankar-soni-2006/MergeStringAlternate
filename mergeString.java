import java.util.*;
class mergeString {
    public static String mergeAlternately(String str1, String str2) {
        StringBuilder sb = new StringBuilder();
        int i = 0, j = 0;
        while(i < str1.length() && j < str2.length()){
            sb.append(str1.charAt(i++));
            sb.append(str2.charAt(j++));
        }
        if(i < str1.length()) sb.append(str1.substring(i));  
        if(j < str2.length()) sb.append(str2.substring(j));

        return sb.toString();

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        String ans = mergeAlternately(str1,str2);
        System.out.println(ans);
        sc.close();
    }
}