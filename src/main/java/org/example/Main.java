/*
 * i obtendra los valores numericos del 1 hasta val y los imprimira con el logger info.
 */

package org.example;
import java.util.logging.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());
    private static final int val = 5;
    public static void main(String[] args) {

        for (int i = 1; i <= val; i++) {
            logger.info("i = " + i);
        }
        logger.info("Finish");
    }
}