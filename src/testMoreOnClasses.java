/**
 * Created by Sebastian on 29.04.2017.
 */
public class testMoreOnClasses {
    public static void main(String[] argc){
        Rectangle tmp1 = new Rectangle(2, 3, 4, 5);
        System.out.println(tmp1.getValueX() + " " + tmp1.getValueY() + " " + tmp1.getValueWidth() + " " + tmp1.getValueHeight());

    }
}

class Rectangle{
    private int x, y;
    private int width, height;

    public Rectangle(int x, int y, int width, int height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    /* The same like:
        Public Rectangle(int a, int b, int c, int d){
            x = a;
            y = b;
            width = c;
            height = d;
        }
     */

    int getValueX(){
        return x;
    }
    int getValueY(){
        return y;
    }
    int getValueWidth(){
        return width;
    }
    int getValueHeight(){
        return height;
    }
}
