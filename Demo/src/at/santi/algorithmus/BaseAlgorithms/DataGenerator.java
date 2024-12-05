package at.santi.algorithmus.BaseAlgorithms;

import java.util.Random;

public class DataGenerator {

    // Generiert ein Array mit zufälligen Werten
    public static int[] generateDataArray(int size) {
        Random random = new Random();
        int[] dataArray = new int[size];
        for (int i = 0; i < size; i++) {
            dataArray[i] = random.nextInt();
        }
        return dataArray;
    }

    // Generiert ein Array mit zufälligen Werten innerhalb eines Bereich
    public static int[] generateDataArray(int size, int min, int max) {
        Random random = new Random();
        int[] dataArray = new int[size];
        for (int i = 0; i < size; i++) {
            dataArray[i] = random.nextInt((max - min) + 1) + min;
        }
        return dataArray;
    }

    // Gibt die Werte des Arrays in einer Zeile auf der Konsole aus
    public static void printArray(int[] data) {
        for (int value : data) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
