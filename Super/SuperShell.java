package Super;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalTime;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class SuperShell {
    static String cmd;
    static final Runtime run = Runtime.getRuntime();
    static Process proc;
    static int exit = 1;
    static final Scanner sc = new Scanner(System.in);

    private static void help() {
        System.out.println(
                "Welcome to SuperShell! This is a brief tutorial about the commands in this \"shell\". First command is - print, it is quite straightforward to use, just type any string after it and it will print it in the console");
    }

    private static void print() {
        String processed = cmd.replace("print", "");
        System.out.println(processed.trim() + "\n");
    }

    private static void time() {
        LocalTime time = LocalTime.now();
        System.out.println("The current time is: " + time + "\n");
    }

    private static void addition() {
        System.out.print("Type the first addend: ");
        double addend1 = sc.nextDouble();
        System.out.print("Type the second addend: ");
        double addend2 = sc.nextDouble();
        double sum = addend1 + addend2;
        System.out.println("The sum of " + addend1 + " and " + addend2 + " is " + sum + ".\n");
    }

    private static void subtraction() {
        System.out.print("Type the mineund: ");
        double mineund = sc.nextDouble();
        System.out.print("Type the subtrahend: ");
        double subtrahend = sc.nextDouble();
        double difference = mineund - subtrahend;
        System.out.println("The difference of " + mineund + " and " + subtrahend + " is " + difference + ".\n");
    }

    private static void multiplication() {
        System.out.print("Type the multiplier: ");
        double multiplier = sc.nextDouble();
        System.out.print("Type the multiplicand: ");
        double multiplicand = sc.nextDouble();
        double product = multiplier * multiplicand;
        System.out.println("The product of " + multiplier + " and " + multiplicand + " is " + product + ".\n");
    }

    private static void division() {
        System.out.print("Type the dividend: ");
        double dividend = sc.nextDouble();
        System.out.print("Type the divisor: ");
        double divisor = sc.nextDouble();
        if (divisor != 0) {
            double quotient = dividend / divisor;
            double remainder = dividend % divisor;
            System.out.println("The quotient of " + dividend + " and " + divisor + " is " + quotient
                    + " and the remainder is " + remainder + ".\n");
        } else {
            System.out.println("Can't divide by zero.\n");
        }
    }

    private static void run() throws IOException {
        if (cmd.endsWith("edge")) {
            proc = run.exec(new String[] { "C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe" });
        } else if (cmd.endsWith("cmd")) {
            proc = run.exec(new String[] { "cmd", "/C", "start" });
        } else if (cmd.endsWith("code")) {
            proc = run.exec(new String[] { "cmd", "/C", "code" });
        } else if (cmd.endsWith("arc")) {
            proc = run.exec(new String[] { "cmd", "/C", "arc" });
        } else if (cmd.endsWith("cursor")) {
            proc = run.exec(new String[] { "cmd", "/C", "cursor" });
        } else if (cmd.endsWith("vi")) {
            proc = run.exec(new String[] { "cmd", "/C", "start", "vi" });
        } else if (cmd.endsWith("vim")) {
            proc = run.exec(new String[] { "cmd", "/C", "start", "vim" });
        } else if (cmd.endsWith("emacs")) {
            proc = run.exec(new String[] { "cmd", "/C", "start", "emacs" });
        } else if (cmd.endsWith("nano")) {
            proc = run.exec(new String[] { "cmde", "/C", "start", "nano" });
        } else if (cmd.endsWith("powershell")) {
            proc = run.exec(new String[] { "cmd", "/C", "start", "powershell" });
        } else if (cmd.endsWith("powershell ise")) {
            proc = run.exec(new String[] { "cmd", "/C", "powershell ise" });
        } else {
            System.out.println( "ERROR! Program not recognized, use [edge, cmd, code, arc, cursor, vi, vim, emacs, nano, powershell, powershell ise]");
        }
    }

    private static void shutdown() throws IOException {
        if (cmd.endsWith("i")) {
            proc = run.exec(new String[] { "cmd", "/C", "Start", "shutdown", "/i" });
        } else if (cmd.endsWith("l")) {
            proc = run.exec(new String[] { "cmd", "/C", "Start", "shutdown", "/l" });
        } else if (cmd.endsWith("s")) {
            proc = run.exec(new String[] { "cmd", "/C", "Start", "shutdown", "/s" });
        } else if (cmd.endsWith("r")) {
            proc = run.exec(new String[] { "cmd", "/C", "Start", "shutdown", "/r" });
        } else if (cmd.endsWith("g")) {
            proc = run.exec(new String[] { "cmd", "/C", "Start", "shutdown", "/g" });
        } else if (cmd.endsWith("a")) {
            proc = run.exec(new String[] { "cmd", "/C", "Start", "shutdown", "/a" });
        } else if (cmd.endsWith("p")) {
            proc = run.exec(new String[] { "cmd", "/C", "Start", "shutdown", "/p" });
        } else if (cmd.endsWith("h")) {
            proc = run.exec(new String[] { "cmd", "/C", "Start", "shutdown", "/h" });
        } else {
            System.out.println("ERROR! Shutdown type not recognized, use [/i, /l, /s, /r, /g, /a, /p, /h]");
        }
    }

    private static void clr() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    private static Set<String> listFiles(String dir) throws IOException {
        try (Stream<Path> stream = Files.list(Paths.get(dir))) {
            return stream
                    .filter(file -> !Files.isDirectory(file))
                    .map(Path::getFileName)
                    .map(Path::toString)
                    .collect(Collectors.toSet());
        }
    }

    private static void dirfiles() throws IOException {
        System.out.println(listFiles("C:\\"));
    }

    public void executeStartShell() throws IOException {
        do {
            System.out.print("[super]$ ");
            cmd = sc.nextLine();
            executeCmd(cmd);
        } while (exit != 0);
    }

    private static void colour() {
        if (cmd.endsWith("reset")) {
            System.out.println("\033[0m");
        } else if (cmd.endsWith("black")) {
            System.out.println("\033[0;30m");
        } else if (cmd.endsWith("red")) {
            System.out.println("\033[0;31m");
        } else if (cmd.endsWith("orange")) {
            System.out.println("\033[0;33m");
        } else if (cmd.endsWith("blue")) {
            System.out.println("\033[0;34m");
        } else if (cmd.endsWith("green")) {
            System.out.println("\033[0;92m");
        } else {
            System.out.println("ERROR, Colour not recognized, use [reset, black, red, orange, blue, green]");
        }
    }

    private static void ascii() throws IOException {
        char valueinput = cmd.charAt(6); 
        int asciivalue = valueinput;
        System.out.println(asciivalue);
    }

    private static void executeCmd(String cmd) throws IOException {
        if (cmd.startsWith("print")) {
            print();
        } else if (cmd.startsWith("run")) {
            run();
        } else if (cmd.startsWith("colour")) {
            colour();
        } else if (cmd.startsWith("ascii")) {
            ascii();
        } else {
            switch (cmd) {
                case "shutdown":
                    shutdown();
                case "dirfiles":
                    dirfiles();
                    ;
                    break;
                case "help":
                    help();
                    break;
                case "time":
                    time();
                    break;
                case "exit":
                    exit = 0;
                    sc.close();
                    break;
                case "add":
                    addition();
                    break;
                case "sub":
                    subtraction();
                    break;
                case "mul":
                    multiplication();
                    break;
                case "div":
                    division();
                    break;
                case "clear":
                    clr();
                    break;
                default:
                    if (!cmd.isEmpty()) {
                        System.out.println("Unknown command");
                    }
                    break;
            }
        }
    }
}