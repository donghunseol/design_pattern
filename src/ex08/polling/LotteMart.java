package ex08.polling;

public class LotteMart {
    private String value = null;

    // 과일 개수
    public String getValue() {
        return value;
    }

    // 그림의 과일을 입고 받는 메서드
    public void received() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        value = "상품";
    }

}
