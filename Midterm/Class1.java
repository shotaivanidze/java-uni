import java.util.Random;
import java.util.Scanner;


interface Methods {
    void input();
    void arrInput();
}

public class Class1 implements Methods{
    public int a,b;
    public int c[] = new int[12];

    public void input() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter number for a");
        int num1 = scanner1.nextInt();
        this.a = num1;

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter number for b");
        int num2 = scanner2.nextInt();
        this.b = num2;
    }

    public void arrInput() {
        Random rand = new Random();
        for(int i=0;i<12;i++){
            this.c[i] = rand.nextInt(this.a, this.b);
        }
    }

    public int smallest(){
        int small = this.c[0];
        for (int num : this.c){
            if(num > 0 & num < small){
                small = num;
            }
        }
        return small;
    }

    public void printArr(){
        for(int i=0;i<this.c.length;i++){
            System.out.println("[" + (i+1) + "] "+c[i]);
        }
    }

    public void threeMultiples(){
        for (int num : this.c){
            if(num % 3 == 0){
                System.out.println("3-is jeradia " + num);
            }
        }
    }
}
