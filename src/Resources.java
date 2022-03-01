/*
 * Project: "Taschenrechner"
 * source for methods in Class CalculatorArg & CalculatorSys
 * Author: Benjamin Lamprecht
 * Last Change: 28.02.2022
 */

public class Resources {

    final static String OPERATORS = "/*-+";
    private String operator;
    private final double[] values = new double[2];
    private String[] writtenValues = new String[2];
    int i;
    int j;
    boolean success;
    double value;

    public Resources() {
        this.i = 0;
        this.j = 0;
    }

     public void fetchData(String str) {
        try {
                if (i % 2 == 0) {
                    if(checkValues(str)) {
                        values[j] = value;
                        writtenValues[j] = str;
                        j++;
                        i++;
                    }
                } else {
                    if (checkOperator(str)) {
                        operator = str;
                        i++;
                    } else {
                        System.out.println("Please enter a valid operator - allowed operators: +,-,*,/");
                    }
                }

        } catch (Exception e) {
            System.out.println("Unexpected Error");
        }
    }

    public boolean checkOperator(String str) {
        return OPERATORS.contains(str) && str.length() == 1;
    }

    public boolean checkValues(String str) { //integer refers to position in static array
        try {
            value = Double.parseDouble(str);
            return true;
        } catch (Exception e) {
            System.out.println("Please enter a non-negative valid double!");
        }
        return false;
    }

    public void doCalculate() {
        System.out.print(writtenValues[0] + operator + writtenValues[1] + " = ");
        switch (operator){
            case "*":
                System.out.println(values[0] * values[1]);
                break;
            case "/":
                System.out.println(values[0] / values[1]);
                break;
            case "+":
                System.out.println((values[0] + values[1]));
                break;
            case "-":
                System.out.println(values[0] - values[1]);
                break;
        }
    }

    public void requestInput(){
        if (i % 2 == 0) {
            System.out.printf("Value %d:", (j+1));
        } else {
            System.out.printf("Operator:");
        }

    }
}
