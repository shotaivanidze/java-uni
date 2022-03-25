
import java.util.Scanner;


public class Class1 {

    public int x, y;

    public void method1(){
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter number for x");

        int number1 = scanner1.nextInt();
        this.x = number1;

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter number for y");

        int number2 = scanner2.nextInt();
        this.y = number2;
    }

    public int method2(){
        return Math.abs(this.x) % 10;
    }

    public int method3(){
        int digits = (int)(Math.log10(this.y));
        return (int)(this.y / (int)(Math.pow(10, digits)));
    }
}
