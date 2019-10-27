package Shape_text2;
public class Circle implements Shape {
    private String text;
    public Circle(String text){
        this.text = text;
    }
    public void draw(){
        System.out.println("Circle:"+text);
    }
}
