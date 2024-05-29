package ex09.student;

import java.util.ArrayList;
import java.util.List;

public class HomeworkDelegator {
    private final List<Student> students = new ArrayList<>();

    // 작업을 위임하기 위해 미리 정의된 학생 객체들을 리스트에 추가
    public HomeworkDelegator() {
        students.add(new MathStudent());
        students.add(new ScienceStudent());
    }

    public void delegateHomework(HomeworkType type) {
        // 1. for 문 사용
        for (Student student : students) {
            if (student.isSameHomework(type)) {
                student.getHomework();
            }
        }

        // 2. for-each 문 사용
        students.forEach(student -> {
            if (student.isSameHomework(type)) {
                student.getHomework();
            }
        });

        // 3. stream 사용 (filter는 조건에 만족하는 것만 추려내기 위해서)
        students.stream()
                .filter(student -> student.isSameHomework(type))
                .forEach(student -> student.getHomework());
    }
}
