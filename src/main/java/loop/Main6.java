package loop;

import java.util.ArrayList;
import java.util.List;

public class Main6 {
    public static void main(String[] args) {
        // 학생들 전체 평균 점수를 출력하시오.
        int avg = 0;
        int total = 0;
        List<Student> students = List.of(
                new Student("김선영", 80),
                new Student("김선일", 94),
                new Student("김선이", 75),
                new Student("김선삼", 99),
                new Student("김선사", 85)
        );

//        for (int i = 0; i < students.size(); i++) {
//            total += students.get(i).getScore();
//        }
//        avg = total / students.size();

        for (Student student : students) {
            total += student.getScore();
        }
        avg = total / students.size();

        System.out.println(avg);

    }
}
