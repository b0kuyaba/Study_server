package car;

public class Car {
    private static int serialNum = 10001;
    int carNum;

    public Car(){
        carNum = serialNum;
        serialNum++;
    }

    public int getCarNum() {
        return carNum;
    }

//    public String getCarName() {
//        return CarName;
//    }
//
//    public int getCarNum() {
//        return CarNum;
//    }
//
//    public void setCarName(String name) {
//        CarName = name;
//    }
//
//    public static int getSerialNum() {
//        int i = 0;
//        return serialNum;
//    }
//
//    public static void setSerialNum(int serialNum) {
//        CarFactory.serialNum = serialNum;
//    }
}
