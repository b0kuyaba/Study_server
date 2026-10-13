package singleton.shopping;

public class Order {
    long  orderID;
    String customerID;
    String orderDate;
    String customerName;
    String productID;
    String address;

    public Order(long orderID, String customerID, String orderDate, String customerName, String productID, String address) {
        this.orderID = orderID;
        this.customerID = customerID;
        this.orderDate = orderDate;
        this.customerName = customerName;
        this.productID = productID;
        this.address = address;
    }

    public void ShowInfo() {
        System.out.println("주문번호: " + orderID);
        System.out.println("주문자 아이다: " + customerID);
        System.out.println("주문 날짜: " + orderDate);
        System.out.println("주문자 이름: " + customerName);
        System.out.println("주문 상품 번호: " + productID);
        System.out.println("배송 주소: " + address);
    }
}


