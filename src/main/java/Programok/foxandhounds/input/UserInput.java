package Programok.foxandhounds.input;

import java.util.Scanner;

public class UserInput {
    Scanner sc = new Scanner(System.in);

    public String getInput() {
        return input;
    }

    public UserInput(){
        jatekosNev = null;
        input = null;
    }

    private String jatekosNev, input;


    public void begin(){
        System.out.print("Add meg a neved! Név: ");
        jatekosNev = sc.nextLine();
        System.out.println("Szia "+jatekosNev+", írj Igen-t a játék elindításához!");
        input = sc.nextLine();
    }
}
