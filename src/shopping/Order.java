package shopping;

public class Order {
    Long orderID;
    String customerID;
    String orderDate;
    String customerName;
    String address;

    public void Order() {
        System.out.println("주문번호: " + orderID);
        System.out.println("주문자 아이디: " + customerID);
        System.out.println("주문 날짜: " + orderDate);
        System.out.println("주문자 이름: " + customerName);
        System.out.println("배송 주소:  " + address);
    }
}
