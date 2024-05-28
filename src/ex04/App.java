package ex04;

import ex04.teacher.HtmlTeacher;
import ex04.teacher.JavaTeacher;
import ex04.teacher.PythonTeacher;
import ex04.teacher.Teacher;

public class App {

    public static void main(String[] args) {
        // 자바 선생님
        Teacher javaTeacher = new JavaTeacher();
        javaTeacher.수업하기();

        // 파이썬 선생님
        Teacher pythonTeacher = new PythonTeacher();
        pythonTeacher.수업하기();

        // HTML 선생님
        Teacher htmlTeacher = new HtmlTeacher();
        htmlTeacher.수업하기();
    }
}
