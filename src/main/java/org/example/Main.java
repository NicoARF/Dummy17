package org.example;
import java.util.logging.Logger;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {
        logger.info("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            logger.info("i = " + i);
        }
    }
}