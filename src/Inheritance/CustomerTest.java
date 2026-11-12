package Inheritance;

class Customer {
    protected int customerID;
    protected String customerName;
    protected String customerGrade;
    int bonusPoint;
    double bonusRatio;

    public Customer () {
        customerGrade = "SILVER";
        bonusRatio = 0.01;
        System.out.println("상위 클래스 Customer() 생성자 호출");
    }

    public Customer (int customerID, String customerName) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.customerGrade = "SILVER";
        this.bonusRatio = 0.01;
        System.out.println("상위 클래스 Customer(int, String) 생성자 호출");
    }

    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price;
    }

    public String showCustomerInfo() {
        return customerName + "님의 등급은 "
                + customerGrade + "이며, 보너스 포인트는 "
                + bonusPoint + "입니다.";
    }
}

class VIPCustomer extends Customer{
    private int agentID;
    double saleRatio;

    public VIPCustomer() {
        super();
        saleRatio = 0.1;
        bonusRatio = 0.05;
        customerGrade = "VIP";
        System.out.println("하위 클래스 VIPCustomer() 생성자 호출");
    }

    public VIPCustomer(int customerID, String customerName, int agnetID) {
        super(customerID, customerName);
        saleRatio = 0.1;
        bonusRatio = 0.05;
        customerGrade = "VIP";
        this.agentID = agnetID;
        System.out.println("하위 클래스 VIPCustomer(int, String) 생성자 호출");
    }
    public int getAgentID() {
        return agentID;
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price - (int)(price * saleRatio);
    }

    public String showVIPInfo() {
        return super.showCustomerInfo() + "\n담당 사원 아이디는 " + agentID + "입니다.";
    }
}

public class CustomerTest {
    public static void main(String[] args) {
        Customer customerLee = new Customer();
        customerLee.customerID = 10010;
        customerLee.customerName = "이순신";
        customerLee.bonusPoint = 1000;
        int price = customerLee.calcPrice(40000);
        System.out.println(customerLee.showCustomerInfo());
        System.out.println(customerLee.customerName + "님이 지불해야 할 금액은 " + price + "원입니다.");

        System.out.println();
        VIPCustomer customerKim = new VIPCustomer();
        customerKim.customerID = 10020;
        customerKim.customerName = "김유신";
        customerKim.bonusPoint = 10000;
        System.out.println(customerKim.showCustomerInfo());

        System.out.println();
        VIPCustomer customerJang = new VIPCustomer(10020, "장보고", 1101);
        customerJang.bonusPoint = 20000;
//        System.out.println(customerJang.showCustomerInfo());
        price = customerKim.calcPrice(40000);
        System.out.println(customerJang.showVIPInfo());
        System.out.println(customerJang.customerName + "님이 지불해야 할 금액은 " + price + "원입니다.");
    }
}

class CustomerTest2 {
    public static void main(String[] args) {
        Customer vc = new VIPCustomer(10030, "나몰라",1102);
        vc.bonusPoint = 1000;
        System.out.println(vc.customerName + "님이 지불해야 할 금액은 " + vc.calcPrice(10000) + "원입니다.");
    }

}