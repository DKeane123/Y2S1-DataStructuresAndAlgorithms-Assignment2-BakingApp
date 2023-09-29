package utils;

public class Utils {
    public static boolean containsChar(String str){
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i) != 32){
                System.out.println(str.charAt(i));
                return true;
            }
        }
        System.out.println("false");
        return false;
    }
}
