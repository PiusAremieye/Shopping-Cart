package shoppingcart;

import java.util.*;

public class Main {
    private static Scanner scan = new Scanner(System.in);
    private static ShoppingCart shoppingList = new ShoppingCart();

    public static void main(String[] args) {
	// write your code here
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit){
            System.out.println("Enter your choice: ");
            choice = scan.nextInt();
            scan.nextLine();

            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    print();
                    break;
                case 2:
                    enterItem();
                    break;
                case 3:
                    modify();
                    break;
                case 4:
                    remove();
                    break;
                case 5:
                    find();
                    break;
                case 6:
                    processArrayList();
                    break;
                case 7:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions(){
        System.out.println("\nPress ");
        System.out.println("\t 0 ==> To print choice options.");
        System.out.println("\t 1 ==> To print the items in the shopping cart.");
        System.out.println("\t 2 ==> To add an item in the shopping cart.");
        System.out.println("\t 3 ==> To modify an item in the shopping cart.");
        System.out.println("\t 4 ==> To remove an item in the shopping cart.");
        System.out.println("\t 5 ==> To search an item in the shopping cart.");
        System.out.println("\t 6 ==> To get all items in shopping cart.");
        System.out.println("\t 7 ==> To quit the application. \n");
    }

    public static void print(){
        System.out.println();
        shoppingList.printItem();
        System.out.println();
    }

    public static void enterItem(){
        System.out.println();
        System.out.print("Please enter the item to add: ");
        shoppingList.addItem(scan.nextLine());
        System.out.println();
    }

    public static void modify(){
        System.out.println();
        System.out.print("Please enter the item to modify: ");
        String item = scan.nextLine();
        System.out.println("\nEnter new item: ");
        String newItem = scan.nextLine();
        shoppingList.modifyItem(item, newItem);
    }

    public static void remove(){
        System.out.println();
        System.out.println("Enter item to remove: ");
        String item = scan.nextLine();
        shoppingList.removeItem(item);
        System.out.println();
    }

    public static void find(){
        System.out.println();
        System.out.println("Enter item to search for: ");
        String searchItem = scan.nextLine();
        System.out.println(shoppingList.onFind(searchItem) ? "Found " + searchItem + " in our shopping cart." : searchItem + " is not in our shopping cart.");
        System.out.println();
    }

    public static void processArrayList(){
        ArrayList<String> anotherArray = new ArrayList<String>();
        anotherArray.addAll(shoppingList.getShoppingList());

        ArrayList<String> nextArray = new ArrayList<String>(shoppingList.getShoppingList());

        String[] myArray = new String[shoppingList.getShoppingList().size()];
        myArray = shoppingList.getShoppingList().toArray(myArray);
    }
}
