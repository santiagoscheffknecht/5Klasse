package at.santi.algorithmus.BaseAlgorithms;

import java.util.Random;

public class DataGenerator {

    // Methode: Generiert ein Array mit size zufälligen Werten aus dem
    // Integer-Bereich
    public static int[] generateDataArray(int size) {
        Random random = new Random();
        int[] dataArray = new int[size];
        for (int i = 0; i < size; i++) {
            dataArray[i] = random.nextInt(); // Ganzzahliger Bereich von Integer
        }
        return dataArray;
    }
}