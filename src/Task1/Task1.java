package Task1;

import java.util.Objects;
import java.util.Scanner;

public class Task1 {
    //Make up an algorithms
    public void FirstTask() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number > 7) {
            System.out.println("Hello");
        } else {
            System.out.println("incorrect");
        }
    }

    public void SecondTask() {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        if (Objects.equals(name, "john")) {
            System.out.println("Hello John");
        } else {
            System.out.println("There is no such name");
        }
    }

        public void thirdTask(int[] array){
            System.out.println("Elements that are multiples of 3:");

            for (int number : array) {
                if (number % 3 == 0) {
                    System.out.println(number);
                }

            }
        }
    }
