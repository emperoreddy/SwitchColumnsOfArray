import java.util.Scanner;

class Main {

    public static void readMatrix(int[][] array, int n, int m) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < n && scan.hasNextInt(); i++)
            for (int j = 0; j < m && scan.hasNextInt(); j++)
                array[i][j] = scan.nextInt();

    }

    public static void showMatrix(int[][] array, int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                System.out.print(array[i][j] + " ");
            System.out.println();
        }
    }

    public static void switchColumn(int[][] array, int n, int m, int moveFrom, int moveTo) {
        for (int k = 0; k < n; k++) {
            int temp = array[k][moveFrom];
            array[k][moveFrom] = array[k][moveTo];
            array[k][moveTo] = temp;
        }
        showMatrix(array, n, m);
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[][] array = new int[n][m];
        int moveFrom, moveTo;


        readMatrix(array, n, m);
        moveFrom = scan.nextInt(); // 2
        moveTo = scan.nextInt(); // 1


        if (moveFrom == moveTo)
            showMatrix(array, n, m);
        else
            switchColumn(array, n, m, moveFrom, moveTo);

            scan.close();
        }
    }

