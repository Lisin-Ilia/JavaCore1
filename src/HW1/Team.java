package HW1;

public class Team {/* Класс команды */
    String name;
    Member[]members; /*Массив участников*/

    public Team(String name, Member member1, Member member2, Member member3, Member member4){ /* Конструктор массива*/
        members = new Member[]{member1, member2, member3, member4};
        this.name = name;
    }
    public void printInfoAboutMembers(){        /* Метод вывода на экран всех участников */
        for(Member member:members){ /* цикл вывода массива foreach для печати всех участников */
            member.info();
        }
    }
}
