package chapter_02;

public class _01_Operator {
    public static void main(String[] args) {
        // 산술 연산자

        //일반 연산
        System.out.println(4+2); //6

        // 우선 순위 연산
        // 변수 이용한 연산
        int a=10;
        int b=2;
        int c= a+b;
        System.out.println(c);
        // 증감 연산
        int val;
        val = 1;
        System.out.println(++val);
        System.out.println(val);
        System.out.println(val++);
        System.out.println(val);
    }
}
