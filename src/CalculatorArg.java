/*
 * Project: "Taschenrechner"
 * program requests data via arguments, analyses its components
 * and gives a calculated output at last
 * Author: Benjamin Lamprecht
 * Last Change: 28.02.2022
 */

public class CalculatorArg {

    public static void main(String[] args) {
        Resources calc = new Resources();
        for (int i = 0; i < args.length; i++) {
            calc.requestInput();
            System.out.println(args[i]);
            calc.fetchData(args[i]);
        }
        calc.doCalculate();
    }
}