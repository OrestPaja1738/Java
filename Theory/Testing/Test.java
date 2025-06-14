package Theory.Testing;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {

        HashMap<String, Integer>data = new HashMap<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\orest\\Documents\\Java Dev\\Theory\\Testing\\FemaleNames.txt"));
            
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");
                String name = parts[0];
                int occurrence = Integer.parseInt(parts[1]);

                data.put(name, occurrence);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        Scanner scanner = new Scanner(System.in);
        System.err.println("Enter name you want to search");
        String nameSearch = scanner.next();

            List<Map.Entry<String, Integer>> sortedEntries = data.entrySet()
            .stream()
            .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
            .collect(Collectors.toList());

            int position = 0;
            boolean found = false;
            for (Map.Entry<String, Integer> entry : sortedEntries) {
                position++;
                if (entry.getKey().equals(nameSearch)) {
                    System.out.println("Person: " + nameSearch + " is found at position " + position + " with occurrence: " + entry.getValue());
                    found = true;
                    break;
                }
            }
    
            if (!found) {
                System.out.println("Person not found.");
            }
    }
}   
