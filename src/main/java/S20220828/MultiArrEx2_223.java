package S20220828;

import java.util.Scanner;

public class MultiArrEx2_223 {

    public static void main(String[] args) {

        final int SIZE = 5;
        int x = 0, y = 0, num = 0;

        int[][] bingo = new int[SIZE][SIZE];
        Scanner scanner = new Scanner(System.in);

        // 배열의 모든 요소를 1부터 SIZE*SIZE까지의 숫자로 초기화

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                bingo[i][j] = i * SIZE + j + 1;
            }
        }

        // shuffle
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                x = (int) (Math.random() * SIZE);
                y = (int) (Math.random() * SIZE);

                // bingo[i][j] 와 임의로 선택된 값 x,y변경
                int tmp = bingo[i][j];
                bingo[x][y] = bingo[x][y];
                bingo[x][y] = tmp;
            }
        }

        do {
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++)
                    System.out.printf("%2d ", bingo[i][j]);

                System.out.println();
            }
            System.out.println();

            System.out.printf("1~$d의 숫자를 입력하세요. (쫑료:0>", SIZE * SIZE);

            String tmp = scanner.nextLine();
            num = Integer.parseInt(tmp);

            // 입력받은 숫자와 같은 숫자가 저장된 요소를 찾아서 0을저장
            outer:
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    if (bingo[i][j] == num) {
                        bingo[i][j] = 0;
                        break outer;
                    }
                }
            }
        } while (num != 0);
    }
}



