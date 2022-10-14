package Programok.foxandhounds.map;

public class Map {
    public static void main(String[] args) {

        int[][] tomb = new int[8][8];

        //Feltoltes
        for (int i = 0; i < tomb.length; i++) {
            for (int j = 0; j < tomb.length; j++) {
                tomb[i][j] = 0;
            }
        }

        tomb[0][1] = 2;
        tomb[0][3] = 2;
        tomb[0][5] = 2;
        tomb[0][7] = 2;
        tomb[7][0] = 1;

        //Kiiratas
        for (int i = 0; i < tomb.length; i++) {
            System.out.println();
            for (int j = 0; j < tomb.length; j++) {
                System.out.print(tomb[i][j] + " ");
            }
        }
    }
}