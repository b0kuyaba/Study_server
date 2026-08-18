package chapter2;

public class OperationAssignment6 {
    public static void main(String[] args) {

        int kor = 85;
        int eng = 90;
        int math = 78;

        int total = kor + eng + math;
        double avg = (double) total / 3;
        String result = (avg >= 80 ? "통과" : "미통과");

        System.out.println("합계: " + total);
        System.out.printf("평균: %.1f\n", avg);
        System.out.println("결과: " + result);
    }
}
