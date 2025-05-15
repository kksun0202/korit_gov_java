package loop;

import java.util.List;

class Student {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}

public class Main2 {
    public static void main(String[] args) {
        // 학생 리스트에서 점수가 85점 이상인 학생들의 이름을 모두 출력하시오.
        List<Student> students = List.of(
                new Student("김선영", 80),
                new Student("김선일", 94),
                new Student("김선이", 75),
                new Student("김선삼", 99),
                new Student("김선사", 85)
        );

        for (Student stu : students) {
            if (stu.getScore() > 84) {
                System.out.println(stu.getName());
            }
        }
    }
}
