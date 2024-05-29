package ex09.student;

public interface Student {
    // 숙제 가져오는 메서드
    void getHomework();

    // 학생에게 맞는 숙제 인지 확인하는 메서드
    boolean isSameHomework(HomeworkType homeworkType);
}
