package com.serialization;

import java.io.*;
import java.util.Scanner;

public class HighScore {

    static int highestScore = 650;

    public static void main(String[] args) {
        // Save the highest score to a file
        saveHighScore(750);
        // Load the highest score from the file
        int currentHighScore = loadHighScore();
        System.out.println("The current highest score is: " + currentHighScore);
    }

    private static void saveHighScore(int newScore) {
        if (newScore > highestScore) {
            highestScore = newScore;
            try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("highscore.txt"))) {
                out.writeInt(highestScore);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static int loadHighScore() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("highscore.txt"))) {
            highestScore = in.readInt();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return highestScore;
    }
}
