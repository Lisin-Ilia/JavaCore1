package HW1;

public class Main {

    public static void main(String[] args) {

        Member member1 = new Member("Oleg",10,10,2);
        Member member2 = new Member("Roman",12,11,3);
        Member member3 = new Member("Igor",12,12,4);
        Member member4 = new Member("Den",13,13,5);
        Team team = new Team("Team",member1, member2, member3, member4);
        Course course = new Course(10,11,4);

        System.out.println("Team " + team.name);
        team.printInfoAboutMembers();
        course.finishCourse(team);


    }

}
