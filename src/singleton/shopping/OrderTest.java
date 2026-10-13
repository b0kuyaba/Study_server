package singleton.shopping;

public class OrderTest {
    public static void main(String[] args) {
        Order order1 = new Order(202609013, "dgsw", "2026년 9월 1일", "홍길동", "PD0345-12", "대구광역시 달성군 구지만 창리로 93");
        order1.ShowInfo();
    }
}
