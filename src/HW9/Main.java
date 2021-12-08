package HW9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {


        Course course = new Course("Course");
        Course course1 = new Course("Course1");
        Course course2 = new Course("Course2");
        Course course3 = new Course("Course3");
        Course course4 = new Course("Course4");

        List<Student>students = new ArrayList<>();

        students.add(new Student("Student1", Arrays.asList(course)));
        students.add(new Student("Student2", Arrays.asList(course2,course3)));
        students.add(new Student("Student3", Arrays.asList(course,course2,course4)));
        students.add(new Student("Student4", Arrays.asList(course,course1,course2,course3,course4)));
        students.add(new Student("Student5", Arrays.asList(course1,course2,course3,course4)));


        System.out.println("Список уникальных курсов:  " +
                students.stream()
                        .map(Student::getCourses)
                        .flatMap(List::stream)
                        .map(Course::getTitle)
                        .distinct()
                        .sorted()
                        .collect(Collectors.toList()));


        System.out.println("Список любознательных студентов:  " +
                students.stream()
                        .sorted((e1, e2) -> e2.getCourses().size() - e1.getCourses().size())
                        .limit(3)
                        .collect(Collectors.toList()));


        System.out.println("Список студентов которые посещяют курс Course :  " +
                students.stream()
                .filter(e1 -> e1.getCourses().contains(course))
                .map(Student::getName)
                .collect(Collectors.toList()));

    }

}
