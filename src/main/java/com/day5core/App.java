package com.day5core;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {
    private static final Logger logger = LogManager.getLogger(App.class);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        logger.info("Welcome to Day5Core programs: Choose a program :");
        logger.info("1: Harmonic Number ");
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                logger.info("Give value to find harmonic number: ");
                int N = sc.nextInt();
                Harmonic h = new Harmonic();
                logger.info("Harmonic Number: " + h.nthHarmonic(N));
                break;
            default:
                logger.info("Bad input");

        }

        sc.close();
    }
}
