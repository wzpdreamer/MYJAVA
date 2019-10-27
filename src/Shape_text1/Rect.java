package Shape_text1;
public class Rect extends Shape {
    private String text;
    public Rect(String text){
        super(text);
        this.text = text;
    }
    @Override
    public void draw(){
        System.out.println("Rect:"+text);
    }
}
