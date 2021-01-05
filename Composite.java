
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import Shapes.BaseShape;
import Shapes.House;
import Shapes.Tree;
import Shapes.WaterSource;

public class Composite{
    private static Scanner scanner = new Scanner(System.in);
    private static List<String> structures = new ArrayList<String>() {
        private static final long serialVersionUID = 1L;

        {
            add("Exit");
            add("House");
            add("Tree");
            add("Water Source");
            add("View Village");
        }
    };
    private static BaseShape village = new BaseShape("Village", "Multiple", "Multiple", new ArrayList<>());
    public static void main(String args[]) {
        System.out.println("Welcome to Age of Villagers!!! Here you can create your own house, grow a tree and create your water source to start your journey in the game!!!\n");

        while (true) {
            showStructureMenu(structures);

            try {
                int option = scanner.nextInt();

                if (option == 0){
                    System.out.println("Exiting the game....");
                    break;
                }

                performOption(option);
            } catch (InputMismatchException e) {
                System.out.println("Invalid choice! Please re-enter!\n");
            }
        }

    }
    private static void performOption(int option) {
        switch (option) {
            case 1:
                System.out.println("\nBuilding a house to provide your population to rest!!!.\n");
                village.addShape(new House());
                break;
            case 2:
                System.out.println("\nTrees provide fruits and nourishment as well as shade for your villagers. Congratulations on building a tree!!!\n");
                village.addShape(new Tree());
                break;
            case 3:
                System.out.println("\nCongratulations!!!. Now villagers have access to Water source\n");
                village.addShape(new WaterSource());
                break;
            case 4:
                System.out.println("\nVillage Structure View\n");
                village.printDetails(0);
                break;
            default:
                System.out.println("Invalid option entered! Please try again!\n");
        }
    }
    private static void showStructureMenu(List<String> structures) {
        System.out.println("What would you like to add to your village?\n");

        for (int i = 0; i < structures.size(); i++) {
            System.out.printf("%d) %s\n", i, structures.get(i));
        }

        System.out.printf("\nEnter choice: ");
    }



}