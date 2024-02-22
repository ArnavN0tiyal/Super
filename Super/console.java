package Super;

import java.io.IOException;
import java.util.Scanner;

public class console {
    Runtime run = Runtime.getRuntime();
    Process proc;
    public void $TXT_COLOR(String colour) {
        final String RESET = "\033[0m";  
        final String BLACK = "\033[0;30m"; 
        final String RED = "\033[0;31m";  
        final String GREEN = "\033[0;34m"; 
        final String BLUE = "\033[0;33m";
        switch(colour) {
            case "$RESET":
            System.out.println(RESET);
            case "$BLACK":
            System.out.println(BLACK);
            case "$RED":
            System.out.println(RED);
            break;
            case "$GREEN":
            System.out.println(GREEN);
            case "$BLUE":
            System.out.println(BLUE);
            default:
            System.out.println("ERROR! Colour not recognized, use [$RESET, $BLACK, $RED, $GREEN, $BLUE]");
        }
     }

     public void $clear() {
        System.out.print("\033[H\033[2J"); 
        System.out.flush();
     }

    public void $ascii(char ASCII_VALUE) throws IOException {
    Scanner sc = new Scanner(System.in);
    int ascii_value = System.in.read();
    sc.nextLine();
    System.out.println(ascii_value);
    sc.close();
 }
}

