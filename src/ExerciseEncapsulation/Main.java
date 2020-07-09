package ExerciseEncapsulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double length = Double.parseDouble(reader.readLine());
        double width = Double.parseDouble(reader.readLine());
        double height = Double.parseDouble(reader.readLine());
        Box box;
        try {
            box = new Box(length, width, height);
        }catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage());
            return;
        }
        System.out.println(box);
    }
}