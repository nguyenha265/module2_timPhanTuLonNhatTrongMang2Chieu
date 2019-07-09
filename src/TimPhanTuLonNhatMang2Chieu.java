import java.util.Scanner;

public class TimPhanTuLonNhatMang2Chieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so cot cho mang");
        int x = scanner.nextInt();
        System.out.println("nhap so dong cho mang");
        int y = scanner.nextInt();
        int twoDimensionalArray[][] = new int[x][y];
        for (int a = 0; a< twoDimensionalArray.length;a++){
            System.out.print("nhap phan tu cho dong " + (a+1));
            for (int b = 0; b< twoDimensionalArray[a].length;b++){
                int element = scanner.nextInt();
                twoDimensionalArray[a][b] = element;
            }
        }
        int max = twoDimensionalArray[0][0];
        for (int i = 0; i < twoDimensionalArray.length; i++) {
            for (int j = 0; j < twoDimensionalArray[i].length; j++) {
                if (max < twoDimensionalArray[i][j]) {
                    max = twoDimensionalArray[i][j];
                }
            }3
        }
        System.out.println("phần tủ lớn nhất là : " + max);
    }
}
