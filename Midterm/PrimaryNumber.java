import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class PrimaryNumber {
    private int number;

    public void setNumber(){
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter number");
        int num1 = scanner1.nextInt();
        this.number = num1;

        write(this.number);
    }

    public int getNumber(){
        return this.number;
    }

    public void randomNum(){
        Random rand = new Random();
        this.number = rand.nextInt(100,200);
        write(this.number);
    }

    private void write(int num){
        try {
            FileWriter myWriter = new FileWriter("number.txt");

            myWriter.write(num + "\n");

            myWriter.close();
            System.out.println("Successfully wrote "+ this.number + " to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
