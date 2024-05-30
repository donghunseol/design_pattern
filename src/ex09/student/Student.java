package ex09.student;

public interface Student {
    // 숙제를 수행하는 메서드
    void doHomework();

    // 학생에게 맞는 숙제 인지 확인하는 메서드
    boolean isSameHomework(HomeworkType homeworkType);
}
