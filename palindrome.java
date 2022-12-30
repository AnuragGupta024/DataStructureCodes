public class palindrome{
    public static boolean palindromefun(String str){

        for (int i = 0; i <str.length()/2; i++) {
           if(str.charAt(i)!=str.charAt(str.length()-1-i)){  //if(str.charAt(i)==str.charAt(str.length()-1-i)) palendrome
            //not palendrome
            return false;
           } 
        }
        return true;
    }
    public static void main(String[] args) {
        String str="noon";
        System.out.println(palindromefun(str)) ;
    }
}