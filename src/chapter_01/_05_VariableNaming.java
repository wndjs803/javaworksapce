package chapter_01;

public class _05_VariableNaming {
    public static void main(String[] args) {
        // 변수 이름 짓는 법
        // 1. 저장할 값에 어울리는 이름
        // 2. 밑줄(_), 문자, 숫자 사용가능
        // 3. 밑줄 또는 문자로 시작 가능
        // 4. 한 단어 또는 2개 이상 단어의 연속
        // 5. 소문자로 시작, 각 단어의 시작 글자는 대문자( 첫 단어 제외)
        // 6. 예약어 사용 불가

        // 입국 신고서
        String nationality = "Korea";
        String firstName = "Kim";
        String lastNmae = "Juoen";
        String dateOfBirth = "";
        String residentialAdress = "";
        String purposeOfVisit = "";
        String _flight_no_2 = "";

        int accompany = 2; //동반 가족 수
        int lengthOfStay = 5;

        String item1 = "";

        // 절대 변하지 않는 상수는 대문자로
        final String CODE = "KR";
    }
}
