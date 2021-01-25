package application;

import model.entities.UserLog;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.*;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Using TreeSet - needs to implement Comparable<T>
        Set<UserLog> set = new HashSet<>();

        System.out.print("Enter file full path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String test = br.readLine();

            while (test != null) {
                String[] s = test.split(" ");
                set.add(new UserLog(s[0], Date.from(Instant.parse(s[1]))));
                test = br.readLine();
            }

            System.out.println("Total users: " + set.size());

        } catch (IOException e) {
            e.printStackTrace();
        }

        sc.close();
    }
}
