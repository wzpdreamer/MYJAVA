package Shape_text1;

import Shape_text1.Broad;

public class Main {
    public static void main(String[] args){
        Broad broad = new Broad();
        Circle c1 = new Circle("c1");
        Circle c2 = new Circle("c2");
        Rect r1 = new Rect("r1");
        Rect r2 = new Rect("r2");
        Triangle t1 = new Triangle("t1");
        Triangle t2 = new Triangle("t2");
        broad.addShape(c1);
        broad.addShape(c2);
        broad.addShape(r1);
        broad.addShape(r2);
        broad.addShape(t1);
        broad.addShape(t2);
        broad.Refresh();
    }
}
