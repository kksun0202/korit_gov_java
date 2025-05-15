package loop;

import java.util.ArrayList;
import java.util.List;

public class Main4 {
    public static void main(String[] args) {
        // 학생들 중 가장 점수가 높은 학생의 이름을 출력하시오.
        List<Student> students = List.of(
                new Student("김선영", 80),
                new Student("김선일", 94),
                new Student("김선이", 75),
                new Student("김선삼", 99),
                new Student("김선사", 85)
        );
//        Student topStudent = students.get(0);
//
//        for (int i = 0; i < students.size(); i++) {
//            if (students.get(i).getScore() > topStudent.getScore()) {
//                topStudent = students.get(i);
//            }
//        }
//        System.out.println(topStudent.getName());

        Student topStudent = null;
        for (Student s : students) {
            if(topStudent == null) {
                topStudent = s;
            } else if (topStudent.getScore() < s.getScore()) {
                topStudent = s;
            }
        }
        if (topStudent != null) {
            System.out.println(topStudent.getName());
        }

    }
}
