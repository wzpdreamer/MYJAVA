package Shape_text1;

public class Circle extends Shape {
    private String text;
    public Circle(String text){
        super(text);
        this.text = text;
    }
    public void draw(){
        System.out.println("Circle"+text);
    }
}
