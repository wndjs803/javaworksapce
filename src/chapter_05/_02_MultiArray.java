package chapter_05;

public class _02_MultiArray {
    public static void main(String[] args) {
        // 다차원 배열(2차원)
        String[][] seats = new String[][] {
                {"a1", "a2", "a3"},
                {"b1", "b2", "b3"}
        };

        System.out.println(seats[0][1]);

        for (int i=0; i<2; i++){
            for (int j=0; j<3; j++){
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }
        String[][] seats2 = {
                {"a1", "a2", "a3"},
                {"b1", "b2", "b3", "b4"},
                {"c1", "c2", "c3", "c4", "c5"}
        };

        for (int i=0; i<seats2.length; i++){
            for (int j=0; j<seats2[i].length; j++){
                System.out.print(seats2[i][j] + " ");
            }
            System.out.println();
        }
//        System.out.println(seats2[0][4]); // error

        // 세로 10, 가로 15
        String [][] seat3 = new String[10][15];
        String[] eng = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        for(int i=0; i<seat3.length; i++){
            for(int j=0; j<seat3[i].length; j++){
                seat3[i][j] = eng[i] + (j+1);
            }
        }

        for(int i=0; i<seat3.length; i++){
            for(int j=0; j<seat3[i].length; j++){
                System.out.print(seat3[i][j] + " ");
            }
            System.out.println();
        }

    }
}
