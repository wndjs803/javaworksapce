package chapter_03;

public class _03_StringCompare {
    public static void main(String[] args) {
        // 문자열 비교
        String s1 = "java";
        String s2 = "python";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals("java")); // 대소문자 구별
        System.out.println(s1.equalsIgnoreCase("Java")); //대소문자 구별 없음

        s1 = "1234";
        s2 = "1234";
        // "1234"라는 값을 s1과 s2가 똑같이 참조하고 있다.
        System.out.println(s1 == s2); // == 은 똑같은 것을 참조하고 있는지 비교

        s1 = new String("1234");
        s2 = new String("1234");
        // s1, s2가 참조하고 있는 "1234"가 다름
        System.out.println(s1.equals(s2)); //true
        System.out.println(s1 == s2); // false
        // 결국 문자열의 내용이 동일한지 확인하고 싶을 때는 equals()!!

    }
}
