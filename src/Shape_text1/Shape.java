package Shape_text1;
public class Shape {
    private String _text;
    public Shape(String text){
        this._text=text;
    }
    public void draw(){
        System.out.println("Shape:"+_text);
    }
}
