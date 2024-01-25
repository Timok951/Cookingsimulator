//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.io.*;
import java.util.Scanner;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        PrintWriter printWriter = new PrintWriter("recipie.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input weight for bread");
        String bread = br.readLine();
        System.out.println("Input weight for meat");
        String meat = br.readLine();
        System.out.println("Input weight for lettuce");
        String lettuce = br.readLine();
        System.out.println("Input weight for cheese");
        String cheese = br.readLine();
        System.out.println("Input your recipie");
        String str = br.readLine();
        String recepie ="Weights" + "\nBread " + bread + "\nMeat " + meat + "\nLettuce " + lettuce + "\nCheese "+ cheese + "\n" +"Recepie " + "\n" + str;
        printWriter.println(recepie);
        printWriter.close();
        System.out.println("your recepie");
        System.out.println(recepie);

    }
}