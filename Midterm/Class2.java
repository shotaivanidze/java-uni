import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Class2 {
    public int n;

    Class2(){
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter number for n");
        int num1 = scanner1.nextInt();
        this.n = num1;
    }

    public void write(){
        try {
            FileWriter myWriter = new FileWriter("numbers.txt");
            for(int i=0; i<this.n; i++){
                Random rand = new Random();

                myWriter.write(rand.nextInt(-12,23) + "\n");
            }

            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void sum() {
        int sum = 0;
        try {
            File myObj = new File("numbers.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
                sum += Integer.parseInt(data);
            }
            myReader.close();
            System.out.println("Sum of numbers: " + sum);
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
