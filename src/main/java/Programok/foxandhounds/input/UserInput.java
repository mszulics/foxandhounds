package Programok.foxandhounds.input;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        String jatekosNev;
        String input;

        Scanner sc = new Scanner(System.in);

        System.out.print("Add meg a neved! Név: ");
        jatekosNev = sc.nextLine();
        System.out.println("Szia "+jatekosNev+", Szeretnéd elindítani a játékot? [I/N]");
        input = sc.nextLine();


    }
}
