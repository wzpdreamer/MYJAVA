package Shape_text2;
import java.util.ArrayList;
import java.util.List;
public class Broad {
    public List<Shape> shapes;
    public Broad(){
        shapes = new ArrayList<Shape>();
    }
    public void addShape(Shape shape){
        shapes.add(shape);
    }
    public void Refresh() {
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
