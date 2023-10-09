package lambdaExpression;

import java.util.function.Function;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.classicWay();
        main.innerClass();
        main.usingLambda();
        Function<Integer, Double> fun = inr->inr*85.0;
        double a = fun.apply(10);
        System.out.println(a);

    }
    public void classicWay(){
        Car benz = new Benz();
        benz.start();
    }
    public void innerClass(){
        Car benz = new Car() {
            @Override
            public void start() {
                System.out.println("using inner class");
            }
        };
        benz.start();
    }
    public void usingLambda(){
       Car benz =  ()-> System.out.println("using lambda expression");
       benz.start();
       Calculate cal = (num1, num2) -> {return num1+num2;};
        Calculate cal1 = (num1, num2) -> num1+num2;
        System.out.println(cal.add(1,3));
    }

}