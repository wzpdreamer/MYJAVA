package Shape_text2;
public class Rect implements Shape{
    private String text;
    public Rect(String text){
        this.text = text;
    }
    public void draw(){
        System.out.println("Rect:"+text);
    }
}
