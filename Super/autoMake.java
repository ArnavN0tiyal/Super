package Super;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class autoMake {
  static int RPSCHOICE;
  static int computer_choice = (int) (1 + Math.random() * 3);
  static Scanner sc = new Scanner(System.in);

  private static void clear() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
  }

  public void $rps() {
    sc = new Scanner(System.in);
    do {
      System.out.print("0) Exit\n1) 1v1\n2) Computer\nType your choice: ");
      RPSCHOICE = sc.nextInt();
      switch (RPSCHOICE) {
        case 0:
          break;
        case 1:
          sc.nextLine();
          System.out.print("Type the username of player 1: ");
          String pl1username = sc.nextLine();
          System.out.print("Type the username of player 2: ");
          String pl2username = sc.nextLine();
          System.out.print(pl1username + ": Rock paper scissors - Choose one: ");
          String pl1choice = sc.nextLine();
          if (pl1choice.equalsIgnoreCase("Rock") || pl1choice.equalsIgnoreCase("Paper")
              || pl1choice.equalsIgnoreCase("Scissors")) {
            clear();
            System.out.print(pl2username + ": Rock paper scissors - Choose one: ");
            String pl2choice = sc.nextLine();
            if (pl2choice.equalsIgnoreCase("Rock") || pl2choice.equalsIgnoreCase("Paper")
                || pl2choice.equalsIgnoreCase("Scissors")) {
              clear();
              if (pl1choice.equalsIgnoreCase("Paper") && pl2choice.equalsIgnoreCase("Rock")
                  || pl1choice.equalsIgnoreCase("Scissors") && pl2choice.equalsIgnoreCase("Paper")
                  || pl1choice.equalsIgnoreCase("Rock") && pl2choice.equalsIgnoreCase("Scissors")) {
                System.out.println(pl1username + " has won!\n");
              } else if (pl2choice.equalsIgnoreCase("Paper") && pl1choice.equalsIgnoreCase("Rock")
                  || pl2choice.equalsIgnoreCase("Scissors") && pl1choice.equalsIgnoreCase("Paper")
                  || pl2choice.equalsIgnoreCase("Rock") && pl1choice.equalsIgnoreCase("Scissors")) {
                System.out.println(pl2username + " has won!\n");
              } else if (pl1choice.equalsIgnoreCase(pl2choice)) {
                System.out.println("It's a tie!\n");
              }
            } else {
              System.out.println("Invalid Input");
            }
          } else {
            System.out.println("Invalid Input");
          }
          break;
        case 2:
          sc.nextLine();
          System.out.print("Rock paper scissors - Choose one: ");
          pl1choice = sc.nextLine();
          if (pl1choice.equalsIgnoreCase("Rock") || pl1choice.equalsIgnoreCase("Paper")
              || pl1choice.equalsIgnoreCase("Scissors")) {
            if (pl1choice.equalsIgnoreCase("Rock") && computer_choice == 1) {
              System.out.println("The computer won since it chose paper!\n");
            } else if (pl1choice.equalsIgnoreCase("Rock") && computer_choice == 2) {
              System.out.println("You have won since the computer chose scissors!\n");
            } else if (pl1choice.equalsIgnoreCase("Rock") && computer_choice == 3) {
              System.out.println("Its a tie since the computer and you both chose rock!\n");
            } else if (pl1choice.equalsIgnoreCase("Paper") && computer_choice == 1) {
              System.out.println("The computer won since it chose scissors!\n");
            } else if (pl1choice.equalsIgnoreCase("Paper") && computer_choice == 2) {
              System.out.println("You won since the computer chose rock!\n");
            } else if (pl1choice.equalsIgnoreCase("Paper") && computer_choice == 3) {
              System.out.println("Its a tie since the computer and you both chose paper!\n");
            } else if (pl1choice.equalsIgnoreCase("Scissors") && computer_choice == 1) {
              System.out.println("The computer won since it chose rock!\n");
            } else if (pl1choice.equalsIgnoreCase("Scissors") && computer_choice == 2) {
              System.out.println("You won since the computer chose paper!\n");
            } else if (pl1choice.equalsIgnoreCase("Scissors") && computer_choice == 3) {
              System.out.println("Its a tie since the computer and you both chose scissors!\n");
            } else {
              System.out.println("Invalid Input");
            }
          }
          break;
        default:
          System.out.println("Invaild choice");
          break;
      }
    } while (RPSCHOICE != 0);
    sc.close();
  }

  public void $numberGuess() {
    int range = 10;
    int chances = (int) (1 + Math.random() * 1000);
    int num;
    int guess;
    System.out.print("Type the range from you want to guess the number: ");
    range = sc.nextInt();
    System.out.print("Type the number of chances allowed: ");
    chances = sc.nextInt();
    num = (int) (1 + Math.random() * range);
    do {
      System.out.println("Chances - " + chances);
      System.out.print("Type your number guess 1 - " + range + ": ");
      guess = sc.nextInt();
      if (chances != 0) {
        chances--;
      } else
        ;
      System.out.println(chances);
      if (guess > num) {
        System.out.println("Lower!");
      } else if (guess < num) {
        System.out.println("Higher!");
      } else if (chances == 0) {
        System.out.println("You used all the chances!\n");
      } else {
        System.out.println("You won!\n");
        sc.nextLine();
      }
    } while (guess != num || chances == 0);
  }

  public void $todoManager() {
    ArrayList<String> Tasks = new ArrayList<String>();
    Iterator<String> it = Tasks.iterator();
    int choice;
    Tasks.add("Tasks:");
    System.out.println("Welcome to your todo manager");
    do {
      System.out.print(
          "0) Exit\n1) View tasks\n2) Add task\n3) Remove task\nType the index number of the function you want to use: ");
      choice = sc.nextInt();
      switch (choice) {
        case 0:
          choice = 0;
          break;
        case 1:
          if (Tasks.size() == 1) {
            System.out.println("No tasks");
          } else {
            for (String i : Tasks) {
              System.out.println(i);
            }
          }
          break;
        case 2:
          String line = sc.nextLine();
          System.out.print("Type your task: ");
          line = sc.nextLine();
          Tasks.add(Tasks.size() + ". " + line);
          System.out.println("Succesfully added the task: " + line);
          break;
        case 3:
          if (Tasks.size() == 1) {
            System.out.println("No task to remove");
          } else {
            it.hasNext();
            System.out.print("Type the index number of the task you want to remove: ");
            int remove = sc.nextInt();
            System.out.println("Successfully removed the task: " + Tasks.get(remove));
            Tasks.remove(remove);
          }
          break;
        default:
          System.out.println("Type a vaild choice number");
      }
    } while (choice != 0);
  }
}