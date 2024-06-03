package ex11.shape;

import ex11.color.Color;

public abstract class Shape {
    // 컬러 연결
    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    // 그리기
    public abstract void draw();
}
