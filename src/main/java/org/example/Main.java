package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ToyRobotSimulator toyRobotSimulator = new ToyRobotSimulator();

//        while(true){
//            System.out.println("Please Enter command: ");
//            String command = sc.nextLine().trim().toUpperCase();
//            toyRobotSimulator.runCommand(command);
//        }

        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String command = line.trim().toUpperCase();
                toyRobotSimulator.runCommand(command);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}