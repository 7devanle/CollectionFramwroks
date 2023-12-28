import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        List<String> groceryList = new ArrayList<>();

        groceryList.add("cabbage");
        groceryList.add("carrot");
        groceryList.add("vegetable");

        System.out.println("Grocery app\n" +
                "Enter 1 to add\n" +
                "Enter 2 to remove\n" +
                "Enter 3 to update\n" +
                "enter 4 to get an item\n");

        int value = scanner.nextInt();
        System.out.println("wait");

        crudList(groceryList, value);
        System.out.println(groceryList);
    }

    public static void crudList(List<String> groceryList, int value){
        String input;
        int index;
        switch (value){
            case 1:
                System.out.println("Enter item");
                input = scanner.next();
                groceryList.add(input);
                System.out.println("Item added");
                break;
            case 2:
                System.out.println("Enter number of item to remove");
                index = scanner.nextInt();
                groceryList.remove(index);
                System.out.println("item removed");
                break;
            case 3:
                System.out.println("Enter old item");
                index = scanner.nextInt();
                System.out.println("Enter new item");
                String newItem = scanner.next();
                groceryList.set(index, newItem);
                System.out.println("Item updated");
                break;
            case 4:
                System.out.println("Enter index of element to get");
                index = scanner.nextInt();
                System.out.println("item " + groceryList.get(index) + " retrieved");
            default:
                System.out.println("only enter 1 to 4");

        }
    }
}