package ex09.student;

public class MathStudent implements Student {
    @Override
    public void getHomework() {
        System.out.println("수학 숙제를 합니다");
    }

    @Override
    public boolean isSameHomework(HomeworkType homeworkType) {
        return HomeworkType.MATH.equals(homeworkType);
    }
}
