/**
 * Created by Sebastian on 29.04.2017.
 */
public class testMoreOnClasses {
    public static void main(String[] argc){
        Rectangle tmp1 = new Rectangle(2, 3, 4, 5);
        System.out.println(tmp1.getValueX() + " " + tmp1.getValueY() + " " + tmp1.getValueWidth() + " " + tmp1.getValueHeight());


        a tmp2 = new a();
        b tmp3 = new b();


        /*
        modifier    class   package subclass    wordl
        public      Y       Y       Y           Y
        protected   Y       Y       Y           N
        no modifier Y       Y       N           N
        private     Y       N       N           N
         */

        Klasa temp1 = new Klasa();
        Klasa temp2 = new Klasa();
        Klasa temp3 = new Klasa();
        Klasa temp4 = new Klasa();

        System.out.println("licznik po wywolaniach " + temp3.getLicznik());
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

class a{
    protected int val;
    protected String a;
    public static int val22;

}

class b extends a{
    int val2;
    String b;
}

class Klasa{
    public static int licznik = 0;              // wszystkie utworzone obiekty pracują na jednej zmiennej

    Klasa(){
        ++licznik;
    }
    public int getLicznik(){
        return licznik;
    }
}
// check it:
// https://www.youtube.com/watch?v=j_7oRiVPKik