package HW1;

public class Course {

    int[] obstacles; /* Массив препятствий */

    public Course(int run, int jump, int swim){ /* конструктор  */

        obstacles = new int[]{run, jump,swim};
    }

    public void finishCourse(Team team){   /* Метод вывода участников кто финишировал */
        for(Member member: team.members){
            for(int obstacle:obstacles){
                if(member.runLength >= obstacle && member.jumpLength >= obstacle && member.swimLength >= obstacle){
                    System.out.println(member.name + " finished");
                }
            }
        }
    }


}
