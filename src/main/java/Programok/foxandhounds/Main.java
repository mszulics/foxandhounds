package Programok.foxandhounds;

import Programok.foxandhounds.input.UserInput;
import Programok.foxandhounds.map.Map;
import Programok.foxandhounds.movecheck.MoveCheck;
import Programok.foxandhounds.printmap.PrintMap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        UserInput bemenet = new UserInput();
        Map map = new Map();
        PrintMap printMap = new PrintMap();
        MoveCheck moveCheck = new MoveCheck();
        bemenet.begin();
        map.create();

        Scanner sc = new Scanner(System.in);
        String input;
        String balFel = "bal fel";
        String jobbFel = "jobb fel";
        String balLe = "bal le";
        String jobbLe = "jobb le";
        String kilepes = "exit";
        String jatekIndito = "igen";

        boolean voltLepes;

        int foxRow = map.getFoxPlace()[0];
        int foxCol = map.getFoxPlace()[1];
        if (jatekIndito.equals(bemenet.getInput().toLowerCase())){
            do {
                printMap.printMap(map.getBoard());
                System.out.print("Add meg merre szeretnél lépni [jobb/bal le/fel] => ");
                input = sc.nextLine();



                if(balFel.equals(input.toLowerCase()) && (foxRow!=0 && foxCol!=0) && moveCheck.moveCheck(map.getBoard(), foxRow-1, foxCol-1)){
                    map.setFoxPlace(foxRow-1,foxCol-1);
                    map.setBoard(foxRow-1,foxCol-1, 1);
                    map.setBoard(foxRow,foxCol, 0);
                    foxRow--;
                    foxCol--;
                    voltLepes = true;
                } else if (jobbFel.equals(input.toLowerCase()) && (foxRow!=0 && foxCol!=7) && moveCheck.moveCheck(map.getBoard(), foxRow-1, foxCol+1)) {
                    map.setFoxPlace(foxRow-1,foxCol+1);
                    map.setBoard(foxRow-1,foxCol+1, 1);
                    map.setBoard(foxRow,foxCol, 0);
                    foxRow--;
                    foxCol++;
                    voltLepes = true;
                } else if (balLe.equals(input.toLowerCase()) && (foxRow!=7 && foxCol!=0) && moveCheck.moveCheck(map.getBoard(), foxRow+1, foxCol-1)) {
                    map.setFoxPlace(foxRow+1,foxCol-1);
                    map.setBoard(foxRow+1,foxCol-1, 1);
                    map.setBoard(foxRow,foxCol, 0);
                    foxRow++;
                    foxCol--;
                    voltLepes = true;
                } else if (jobbLe.equals(input.toLowerCase()) && (foxRow!=7 && foxCol!=7) && moveCheck.moveCheck(map.getBoard(), foxRow+1, foxCol+1)) {
                    map.setFoxPlace(foxRow + 1, foxCol + 1);
                    map.setBoard(foxRow+1,foxCol+1, 1);
                    map.setBoard(foxRow,foxCol, 0);
                    foxRow++;
                    foxCol++;
                    voltLepes = true;
                } else if(kilepes.equals(input.toLowerCase())){
                    break;
                } else {
                    System.out.println("Hibás lépés! Adj meg egy szabályos lépést!");
                    voltLepes = false;
                }

                if(voltLepes){
                    boolean houndLepes;
                    int movingHoundCol;
                    int movingHoundRow;
                    do {
                        houndLepes = true;
                        int houndNumber = (int)(Math.random() * 4) + 1;
                        int whereToMove = (int)(Math.random() * 2) + 1;
                        if(houndNumber==1){
                            movingHoundRow = map.getHound1Place()[0];
                            movingHoundCol = map.getHound1Place()[1];
                            if(whereToMove%2==0 && moveCheck.botMoveCheck(map.getBoard(), movingHoundRow-1, movingHoundCol-1)){
                                map.setBoard(movingHoundRow,movingHoundCol,0);
                                map.setBoard(movingHoundRow-1, movingHoundCol-1, 2);
                                map.setHound1Place(movingHoundRow-1,movingHoundCol-1);
                            }else if (whereToMove%2==1 && moveCheck.botMoveCheck(map.getBoard(), movingHoundRow-1, movingHoundCol+1)){
                                map.setBoard(movingHoundRow,movingHoundCol,0);
                                map.setBoard(movingHoundRow-1, movingHoundCol+1, 2);
                                map.setHound1Place(movingHoundRow-1,movingHoundCol+1);
                            }else{
                                houndLepes = false;
                            }
                        }else if (houndNumber==2){
                            movingHoundRow = map.getHound2Place()[0];
                            movingHoundCol = map.getHound2Place()[1];
                            if(whereToMove%2==0 && moveCheck.botMoveCheck(map.getBoard(), movingHoundRow-1, movingHoundCol-1)){
                                map.setBoard(movingHoundRow,movingHoundCol,0);
                                map.setBoard(movingHoundRow-1, movingHoundCol-1, 2);
                                map.setHound2Place(movingHoundRow-1,movingHoundCol-1);
                            }else if (whereToMove%2==1 && moveCheck.botMoveCheck(map.getBoard(), movingHoundRow-1, movingHoundCol+1)){
                                map.setBoard(movingHoundRow,movingHoundCol,0);
                                map.setBoard(movingHoundRow-1, movingHoundCol+1, 2);
                                map.setHound2Place(movingHoundRow-1,movingHoundCol+1);
                            }else{
                                houndLepes = false;
                            }
                        }else if(houndNumber==3){
                            movingHoundRow = map.getHound3Place()[0];
                            movingHoundCol = map.getHound3Place()[1];
                            if(whereToMove%2==0 && moveCheck.botMoveCheck(map.getBoard(), movingHoundRow-1, movingHoundCol-1)){
                                map.setBoard(movingHoundRow,movingHoundCol,0);
                                map.setBoard(movingHoundRow-1, movingHoundCol-1, 2);
                                map.setHound3Place(movingHoundRow-1,movingHoundCol-1);
                            }else if (whereToMove%2==1 && moveCheck.botMoveCheck(map.getBoard(), movingHoundRow-1, movingHoundCol+1)){
                                map.setBoard(movingHoundRow,movingHoundCol,0);
                                map.setBoard(movingHoundRow-1, movingHoundCol+1, 2);
                                map.setHound3Place(movingHoundRow-1,movingHoundCol+1);
                            }else{
                                houndLepes = false;
                            }
                        }else if(houndNumber==4){
                            movingHoundRow = map.getHound4Place()[0];
                            movingHoundCol = map.getHound4Place()[1];
                            if(whereToMove%2==0 && moveCheck.botMoveCheck(map.getBoard(), movingHoundRow-1, movingHoundCol-1)){
                                map.setBoard(movingHoundRow,movingHoundCol,0);
                                map.setBoard(movingHoundRow-1, movingHoundCol-1, 2);
                                map.setHound4Place(movingHoundRow-1,movingHoundCol-1);
                            }else if (whereToMove%2==1 && moveCheck.botMoveCheck(map.getBoard(), movingHoundRow-1, movingHoundCol+1)){
                                map.setBoard(movingHoundRow,movingHoundCol,0);
                                map.setBoard(movingHoundRow-1, movingHoundCol+1, 2);
                                map.setHound4Place(movingHoundRow-1,movingHoundCol+1);
                            }else{
                                houndLepes = false;
                            }
                        }

                    }while(!houndLepes);

                }
                if(map.getFoxPlace()[0]==7){
                    System.out.println("Gratulálok nyertél!");
                    break;
                }

            } while(!kilepes.equals(input.toLowerCase()));

            System.out.println("Köszi a játékot!");
        } else {
            System.out.println("Majd legközelebb!");
        }


    }


}