package Shape_text2;
public class Triangle implements Shape{
    private String text;
    public Triangle(String text){
        this.text = text;
    }
    public void draw(){
        System.out.println("Triangle:"+text);
    }
}
