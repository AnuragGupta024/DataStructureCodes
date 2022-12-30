public class ReverseString{
    public static void Reverse(String str){
        String newstr="";
    for (int i = str.lngth(); i >0; i--) {
        char ch=str.charAt(i);
        newstr=ch+newstr;
    }
    System.out.print(newstr);
    }
    public static void main(String[] args) {
        String str="Anurag";
        Reverse(str);
    }
}