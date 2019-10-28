package Student_text;

public class Undergraduate implements Student {
    private int Score;
    private String name;
    public Undergraduate(String n,int s){
        this.name=n;
        this.Score=s;
    }
    @Override
    public void JudgeScore(){
        if(this.Score>26){
            System.out.println(this.name+"同学满足毕业学分要求,准予毕业。");
        }
        else{
            System.out.println(this.name+"同学不满足毕业学分要求,不能毕业。");
        }
    }
}
