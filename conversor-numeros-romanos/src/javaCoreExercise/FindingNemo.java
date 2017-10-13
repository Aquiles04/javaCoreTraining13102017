package javaCoreExercise;

import java.util.Scanner;

public class FindingNemo {

    public static void main(String[] args) {

        char[][] sea = inputMatrix();
        printMatrix(sea);

        if (isNemoInThere(sea)) {
            System.out.println("Nemo found!!!");
        } else {
            System.out.println("Nemo Not Found! :/");
        }
    }

    public static boolean isNemoInThere(char[][] sea) {
        // TODO: Your code goes here

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                char findNemo = sea[i][j];

                if (findNemo == 'N')
                {

//                    if (j <= 1 && i <= 1) {
//                        int axisX = j;
//                        int axisY = i;
//                        String nemoFound = new StringBuilder().append(sea[axisY][axisX]).append(sea[axisY + 1][axisX + 1]).append(sea[axisY + 2][axisX + 2]).append(sea[axisY + 3][axisX + 3]).toString();
//                        if (nemoFound.equals("NEMO")) {
//                            return true;
//                        }
//
//
//                    }
//
//                    if (j >= 3 && i <= 1) {
//                        int axisX = j;
//                        int axisY = i;
//                        String nemoFound = new StringBuilder().append(sea[axisY][axisX]).append(sea[axisY - 1][axisX - 1]).append(sea[axisY - 2][axisX - 2]).append(sea[axisY - 3][axisX - 3]).toString();
//                        if (nemoFound.equals("NEMO")) {
//                            return true;
//                        }
//
//
//                    }


                    if (j <= 1) {
                        int axisX = j;
                        String nemoFound = new StringBuilder().append(sea[i][axisX]).append(sea[i][axisX + 1]).append(sea[i][axisX + 2]).append(sea[i][axisX + 3]).toString();
                        if (nemoFound.equals("NEMO")) {

                            return true;
                        }

                    } else if (i <= 1) {
                        int axisY = i;
                        String nemoFound = new StringBuilder().append(sea[axisY][j]).append(sea[axisY + 1][j]).append(sea[axisY + 2][j]).append(sea[axisY + 3][j]).toString();
                        if (nemoFound.equals("NEMO")) {
                            return true;
                        }
                    }

                }

                if (findNemo == 'O') {

//                    if (j <= 1 && i <= 1) {
//                        int axisX = j;
//                        int axisY = i;
//                        String nemoFound = new StringBuilder().append(sea[axisY][axisX]).append(sea[axisY + 1][axisX + 1]).append(sea[axisY + 2][axisX + 2]).append(sea[axisY + 3][axisX + 3]).toString();
//                        if (nemoFound.equals("OMEN")) {
//                            return true;
//                        }
//
//
//                    }
//
//                    if (j >= 3 &&  i <= 1) {
//                        int axisX = j;
//                        int axisY = i;
//                        String nemoFound = new StringBuilder().append(sea[axisY][axisX]).append(sea[axisY - 1][axisX - 1]).append(sea[axisY - 2][axisX - 2]).append(sea[axisY - 3][axisX - 3]).toString();
//                        if (nemoFound.equals("OMEN")) {
//                            return true;
//                        }
//
//
//                    }
                    if (j <= 1) {
                        int axisX = j;
                        String nemoFound = new StringBuilder().append(sea[i][axisX]).append(sea[i][axisX + 1]).append(sea[i][axisX + 2]).append(sea[i][axisX + 3]).toString();
                        if (nemoFound.equals("OMEN")) {

                            return true;
                        }

                    }
                    if (i <= 1) {
                        int axisY = i;
                        String nemoFound = new StringBuilder().append(sea[axisY][j]).append(sea[axisY + 1][j]).append(sea[axisY + 2][j]).append(sea[axisY + 3][j]).toString();
                        if (nemoFound.equals("OMEN")) {
                            return true;
                        }
                    }

                }


            }
        }


        return false;
    }

    private static void printMatrix(char[][] matrix) {
        System.out.println();
        for (int m = 0; m < matrix.length; m++) {
            char[] row = matrix[m];
            for (int n = 0; n < row.length; n++) {
                char col = row[n];
                System.out.print(col + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static char[][] inputMatrix() {
        Scanner scanner = new Scanner(System.in);
        char[][] matrix = new char[5][];
        for (int i = 0; i < 5; i++) {
            do {
                System.out.print("Line #" + (i + 1) + ": ");
                matrix[i] = scanner.nextLine().toUpperCase().trim().toCharArray();
            } while (matrix[i].length != 5); // Ha! Told you do-whiles are useful! :P
        }
        return matrix;
    }

}
