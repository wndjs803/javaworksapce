package chapter_06;

public class _02_Parameter {
    // 전달값 Parameter
    public static int power(int num){
        int result = num * num;
        System.out.println(result);
        return result; // 반환값
    }
    public static void powerByExp(int num, int exp){
        int result = 1;
        for(int i=0; i<exp; i++){
            result *= num;
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        // Argument, 인수
        power(2);
        System.out.println(power(2));
        powerByExp(2, 3);
    }
}
