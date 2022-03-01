/*
 * Project: "Taschenrechner"
 * program requests data via console, analyses its input
 * and gives a calculated output at last
 * Author: Benjamin Lamprecht
 * Last Change: 28.02.2022
 */

import java.util.Scanner;

public class CalculatorSys {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Resources calc = new Resources();
        while (true) {
            calc.requestInput();
            calc.fetchData(scanner.nextLine());
            if (calc.j == 2) {
                calc.doCalculate();
                return;
            }
        }
    }
}