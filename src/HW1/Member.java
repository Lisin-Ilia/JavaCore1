package HW1;

public class Member {

    String name;
    int runLength;
    int jumpLength;
    int swimLength;

    public Member(String name, int runLength, int jumpLength,int swimLength){
        this.name = name;
        this.runLength = runLength;
        this. jumpLength = jumpLength;
        this.swimLength = swimLength;
    }

    public void info(){
        System.out.println(name + " " + runLength + " " + jumpLength + " " + swimLength);
    }

}
