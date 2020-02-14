/*
Author: Raul Martos
Date: 07/02/2020
 */
package pkraulmartos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class M3UF2P17 {

    static Scanner keyboard = new Scanner(System.in);
    private static final String ANSI_PURPLE = "\u001B[35m";
    private static final String ANSI_CYAN = "\u001B[36m";
    private static final String ANSI_YELLOW = "\u001B[33m";

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Author: Raul Martos");
        System.out.println();

        int euro;
        String euro1;
        float euro2;
        String name;
        String results;
        DecimalFormat df = new DecimalFormat("0.00");
        int option = -1;
        keyboard.useDelimiter("\n");
        do {
            userMenu();
            option = keyboard.nextInt();
            switch (option) {//init of switch //estructura if-esle
                case 1:
                    System.out.print("How many euro? ");
                    euro = keyboard.nextInt();
                    float result = Function1(euro);
                    System.out.print(euro + "€ " + " = " + df.format(result) + "$");
                    System.out.println();
                    break;

                case 2:
                    System.out.print("How many euro? ");
                    euro = keyboard.nextInt();
                    double result2 = Function2(euro);
                    System.out.println(euro + "€ " + " = " + df.format(result2) + "$");
                    System.out.println();
                    break;

                case 3:
                    System.out.print("How many euro? ");
                    euro = keyboard.nextInt();
                    Function3(euro);
                    System.out.println();
                    break;

                case 4:
                    System.out.print("How many euro? ");
                    euro1 = keyboard.next();
                    int result4 = Function4(euro1);
                    System.out.println(euro1 + "€ " + " = " + result4 + "$");
                    System.out.println();
                    break;

                case 5:
                    System.out.print("How many euro? ");
                    euro2 = keyboard.nextInt();
                    int result5 = Function5(euro2);
                    System.out.println(df.format(euro2) + "€ " + " = " + result5 + "$");
                    System.out.println();
                    break;

                case 6:
                    System.out.println("How many euro? ");
                    euro2 = keyboard.nextFloat();
                    Function6(euro2);
                    System.out.println();
                    break;

                case 7:
                    System.out.print("Letter: ");
                    char letter = (keyboard.next()).charAt(0);
                    Function7(letter);
                    break;

                case 8:
                    System.out.println("Enter one word: ");
                    name = keyboard.next();
                    results = Function8(name);
                    System.out.println(results);
                    System.out.println();
                    break;

                case 9:
                    int numChar;
                    do {
                        System.out.print("Give a number between 0 and 255: ");
                        numChar = keyboard.nextInt();
                    } while (numChar > 255 || 0 > numChar);
                    String numconv = Function9(numChar);
                    System.out.println(numconv);
                    System.out.println();
                    break;

                case 10:
                    Function10();
                    break;

                case 0:
                    break;
                default:
                    System.out.print("Option not avaible: ");
            }//end of switch
            //System.out.print("press any kay to continue: ");
            //key = keyboard.next();
        } while (option != 0);

        double preu = 100, tax = 21, result;

        /*result = functionRaul(preu, tax); //LLAMAR a function
        methodAitor(preu, tax, result); //LLAMAR al procedimiento*/
    }

    private static void userMenu() {
        System.out.println("Option1: ");
        System.out.println("Option2: ");
        System.out.println("Option3: ");
        System.out.println("Option4: ");
        System.out.println("Option5: ");
        System.out.println("Option6: ");
        System.out.println("Option7: ");
        System.out.println("Option8: ");
        System.out.println("Option9: ");
        System.out.println("Option0: Exit:  ");

        System.out.println("\n\nChoose an option");
    }

    //Function CalculoPVP
    /*private static double functionRaul(double price, double iva) {
        double pvp = 0;
        pvp = price + price * (iva / 100);

        return pvp;
    }

    public static void methodAitor(double price, double iva, double result) {
        System.out.println(ANSI_PURPLE + "Precio: " + price + ANSI_CYAN + "\tIVA: " + iva + ANSI_YELLOW + "\tResult: " + result);
    }*/
    private static float Function1(int euro) {
        float result = 0;
        result = euro / 0.91f; //cast          
        return result;
    }

    private static double Function2(int euro) {
        double result2 = 0;
        result2 = euro / (double) 0.91;

        return result2;
    }

    private static String Function3(int euro) {
        String result3 = Integer.toString(euro);
        System.out.println(euro + " € " + " = " + result3 + " $");

        return result3;
    }

    private static int Function4(String euro1) {
        int result4;
        result4 = Integer.parseInt(euro1);

        return result4;
    }

    private static int Function5(float euro2) {
        int result5 = 0;
        result5 = (int) (euro2 / 0.91); //cast       
        return result5;
    }

    private static String Function6(float euro2) {
        String result6 = Float.toString(euro2);
        System.out.println(euro2 + " € " + " = " + result6 + " $");

        return result6;
    }

    private static void Function7(char letter) {
        String letterB = Integer.toBinaryString(letter);
        System.out.println(letter + " = " + letterB);
    }

    private static String Function8(String name) {
        String result = "";
        char ch = ' ';

        for (int i = 0; i < name.length(); i++) {
            ch = name.charAt(0);
            result = Integer.toBinaryString(ch) + " ";
        }

        return result;
    }

    /*private static String Function8_1(String name) {
        String result = "";
        char ch = ' ';
        
        for (int i = 0; i < name.length(); i++)result = Integer.toBinaryString(ch)+" ";
        return result;
    }*/
    private static String Function9(int numberintchar) {
        String aChar = new Character((char) numberintchar).toString();
        return aChar;
    }

    private static void Function10() {
        int Ncol = 3;
        int iCol=256/Ncol;
        for (int i = 0; i < 255; i++) {
            System.out.println(i + "\t" + Integer.toString(i, 16)
                    + " =" + (char) i);
            System.out.print((i + iCol * 1) + " - " + (char) (i + iCol * 1)+"\t");
            System.out.print("\t" + (i + iCol * 2) + " - " + (char) (i + iCol * 2)+"\t");
        }
        System.out.println();
    }
}
