package s01_03.n1ejercicio3;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> countriesMap = new HashMap<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\augus\\Desktop\\BCN ACTIVA\\ITAcademy\\Sprint_1\\src\\main\\java\\s01_03\\n1ejercicio3\\countries.txt"));
            String line;
            while((line = reader.readLine()) != null){
                String[] parts = line.split(",");
                if (parts.length ==2) {
                    String country = parts[0].trim();
                    String capital = parts[1].trim();
                    countriesMap.put(country, capital);
                }

            }
            reader.readLine();
            System.out.println(reader.readLine());
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Please type your name: ");
        String userName = sc.nextLine();
        Random random = new Random();
        int score = 0;
        Object[] countries = countriesMap.keySet().toArray();

        // Realizar el cuestionario 10 veces
        for (int i = 0; i < 10; i++) {
            String country = (String) countries[random.nextInt(countries.length)];
            System.out.print("What is the capital of " + country + "? ");
            String userAnswer = sc.nextLine().trim();

            String correctAnswer = countriesMap.get(country);
            if (correctAnswer.equalsIgnoreCase(userAnswer)) {
                System.out.println("Correct!!!");
                score++;
            } else {
                System.out.println("Incorrect. The capital of " + country + " is " + correctAnswer + ".");
            }
        }

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\augus\\Desktop\\BCN ACTIVA\\ITAcademy\\Sprint_1\\src\\main\\java\\s01_03\\n1ejercicio3\\Score.txt"));
            writer.write(userName + ": " + score + " points.");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("You finished the quiz with a score of " + score + " points.");
        sc.close();
    }
}