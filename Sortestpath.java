import javax.lang.model.util.ElementScanner14;

public class Sortestpath{
    public static float Getsortestpath(String path){
        int x=0,y=0;
        for (int i = 0; i < path.length(); i++) {
            char dir=path.charAt(i);
            if (dir=='S') {
                y--;
            } else if (dir=='W') {
                x--;
            }
            else if (dir=='N') {
               y++; 
            }
            else{
                x++;
            }
        }
        int X2=x*x;
        int Y2=y*y;
        return (float)Math.sqrt(X2+Y2);

    }
    public static void main(String[] args) {
        String path ="WNEENESE
        ";
        System.out.println(Getsortestpath(path));
    }
}