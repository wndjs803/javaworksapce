package chapter_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        //  TypeCasting

        // int to flaot, double
        int score = 90;
        System.out.println(score); // 90
        System.out.println((float) score); // 90.0
        System.out.println((double) score); // 90.0

        // float to int
        float score_f = 93.2F;
        double score_d = 98.8;
        System.out.println((int)score_f); // 93
        System.out.println((int)score_d); // 98

        // float + int
        score = 93 + (int)93.4;
        System.out.println(score);

        // 변수에 형변환된 데이터 집어넣기
        double convert = score;
        // int -> long -> float -> double (자동 형변환)

        int convert_s = (int) score_d; // 소수점 버려짐

        // 숫자 -> 문자열
        String s1 = String.valueOf(99);
        s1 = Integer.toString(99);
        System.out.println(s1);

        String s2 = String.valueOf(99.9);
        s2 = Double.toString(99.9);
        System.out.println(s2);

        // String to number
        int i = Integer.parseInt("99");
        System.out.println(i);
        double d = Double.parseDouble("99.9");
        System.out.println(d);


    }
}
