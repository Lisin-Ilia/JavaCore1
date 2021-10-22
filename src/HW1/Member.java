package HW1;
/*В этом классе создается конструктор участника
 и метод вывода на печать данных участника */
public class Member {
    String name;
    int runLength;
    int jumpLength;
    int swimLength;

    public Member(String name, int runLength, int jumpLength,int swimLength){  /* Конструктор */
        this.name = name;
        this.runLength = runLength;
        this. jumpLength = jumpLength;
        this.swimLength = swimLength;
    }

    public void info(){

        System.out.println(name + " " + runLength + " " + jumpLength + " " + swimLength);
    }

}
