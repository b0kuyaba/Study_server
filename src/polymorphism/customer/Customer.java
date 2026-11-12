package polymorphism.customer;

public class Customer {
    protected int customerId;
    protected String customerName;
    protected String customerGrade;
    int bonusPoint;
    double bonusRatio;

    public Customer() {
        initCustomer();
    }

    public Customer(int customerId, String customerName) {
        this.customerId = customerId;
        this.customerName = customerName;
        initCustomer();
    }

    private void initCustomer() {
        customerGrade = "SILVER";
        bonusRatio = 0.01;
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

class VIPCustomer extends Customer {
    private int agentID;
    double saleRate;

    public VIPCustomer() {
        super();
        initVIPCustomer();
    }

    public VIPCustomer(int customerID, String customerName, int agentID) {
        super(customerID, customerName);
        this.agentID = agentID;
        initVIPCustomer();
    }
    private void initVIPCustomer(){
        saleRate =  0.1;
        bonusRatio = 0.05;
        customerGrade = "VIP";
    }

    public int getAgentID() {
        return agentID;
    }

    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price - (int)(price * saleRate);
    }

    public String showCustomerInfo() {
        return super.showCustomerInfo() + "\n담당 상담원 아이디는 " + agentID + "입니다.";
    }
}

class GoldCustomer {

}

class CustomerTest {
    public static void main(String[] args) {
        Customer customerLee = new Customer();
        customerLee.customerId = 10010;
        customerLee.customerName = "이순신";
        customerLee.bonusPoint = 1000;

        System.out.println(customerLee.showCustomerInfo());
        System.out.println();

        Customer customerKim = new VIPCustomer(20010,"김유신", 1001);
        customerKim.bonusPoint = 10000;

        System.out.println(customerKim.showCustomerInfo());

        System.out.println("======할인율과 포인트 계산======");

        int price = 4000;
        int leePrice = customerLee.calcPrice(price);
        int kimPrice = customerKim.calcPrice(price);

        System.out.println(customerLee.customerName + "님이 " + leePrice + "원 지불하셨습니다.");
        System.out.println(customerLee.showCustomerInfo());
        System.out.println();
        System.out.println(customerKim.customerName + "님이 " + kimPrice + "원 지불하셨습니다.");
        System.out.println(customerKim.showCustomerInfo());
    }
}
