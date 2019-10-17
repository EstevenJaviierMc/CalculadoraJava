
package modelo;

public class Calculadora {
    private double num1;
    private double num2;
    private String op;

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
    
    public static double Suma(double n1, double n2) {
        double suma = n1 + n2;
        return suma;
    }
    
    public static double Resta(double n1, double n2) {
        double resta = n1 - n2;
        return resta;
    }
    
    public static double Multi(double n1, double n2) {
        double multi = n1 * n2;
        return multi;
    }
    
    public static double Div(double n1, double n2) {
        double div = n1 / n2;
        return div;
    }

    public String getOp() {
        return op;
    }

    public void setOp(String op) {
        this.op = op;
    }
    
}
