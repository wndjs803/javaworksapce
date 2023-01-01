package chapter_06;

public class _03_Overloading {
    public static int getPower(int num){
        int result = num * num;
        return result;
    }

    public static int getPower(String strNumber){
        int number = Integer.parseInt(strNumber);
        int result = number * number;
        return result;
    }
    public static int getPowerByExp(int num, int exp){
        int result =1;
        for (int i=0; i<exp; i++){
            result *= num;
        }
        return result;
    }
    public static void main(String[] args) {
        // 메소드 오버로딩
        // 메소드 이름이 똑같지만 전달값의 자료형을 다르거나 개수가 다르면 중복 선언 가능
        System.out.println(getPower(3));
        System.out.println(getPower("3"));
    }
}
