package recursion.back_tracking;



public class BackTracking {
    public static void main (String []args) {
        backTracking("ABC","");
    }
    public static void backTracking(String str, String permuString) {
        if(str.length()==0) {
            System.out.println(permuString);
            return;
        }

        for(int i=0 ;i<str.length(); i++) {
            char currCharacter = str.charAt(i);
            String newStr = str.substring(0, i)+str.substring(i+1);
            backTracking(newStr,permuString+currCharacter);
        }
    }
}