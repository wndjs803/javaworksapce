package chapter_05;

public class _01_Array {
    public static void main(String[] args) {
        // 배열 선언 방법
        String[] s = new String[4];
        String s1[] = new String[4];
        String s2[] = new String[] {"a", "b", "c", "d"};
        String s3[] ={"a", "b", "c", "d"};

        // enhanced for (for-each) 반복문
        for (String a : s3){
            System.out.println(a);
        }
    }
}
