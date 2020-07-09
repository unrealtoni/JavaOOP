package IncreaseSalary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        List<Person> people = new ArrayList<>();
        Team team = new Team("CSKA");
        for (int i = 0; i < n; i++) {
            String[] input = reader.readLine().split("\\s+");
            Person person = null;
            try {
                person = new Person(input[0],input[1], (int) Double.parseDouble(input[2]),Double.parseDouble(input[3]));
            }catch (IllegalArgumentException ex){
                System.out.println(ex.getMessage());
            }
            if (person!=null) {
                people.add(person);
                team.addPlayer(person);
            }
        }


        //double bonus = Double.parseDouble(reader.readLine());
        /*for (Person person : people) {
            //int age = person.getAge();
            //person.increasSalary(bonus);
            System.out.println(person);
        }*/
        System.out.println(team);
    }
}
