package Shape_text1;
public class Triangle extends Shape{
    private String text;
    public Triangle(String text){
        super(text);
        this.text = text;
    }
    public void draw(){
        System.out.println("Triangle:"+text);
    }
}
