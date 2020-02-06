package shoppingcart;

import java.util.*;

public class ShoppingCart {
    private ArrayList<String> shoppingList = new ArrayList<String>();

    public void addItem(String item){
        shoppingList.add(item);
    }

    public ArrayList<String> getShoppingList() {
        return shoppingList;
    }

    public void printItem(){
        System.out.println("You have " + shoppingList.size() + " item(s) in your Shopping cart.");
        for (int i = 0; i < shoppingList.size(); i++){
            System.out.println("Item " + (i + 1) + " is " + shoppingList.get(i));
        }
    }

    public void modifyItem(String currentItem, String newItem){
        int position = findItem(currentItem);
        if (position >= 0) {
            modifyItem(position, newItem);
            System.out.println("\nItem " + currentItem + " has been modified to " + newItem + ".\n");
        }
        else {
            System.out.println("\nWarning " + currentItem + " is not in this shopping cart!!!\n");
        }
    }

    private void modifyItem(int position, String newItem){
        shoppingList.set(position, newItem);
    }


    public void removeItem(String item){
        int position = findItem(item);
        if (position >= 0){
            removeItem(position);
            System.out.println(item + " has been removed.\n");
        }
        else{
            System.out.println("\nWarning " + item + " is not in this shopping cart!!!\n");
        }
    }

    private void removeItem(int position){
        shoppingList.remove(position);
    }

    private int findItem(String searchItem){
        return shoppingList.indexOf(searchItem);
    }

    public boolean onFind(String searchItem){
        int position = findItem(searchItem);
        return position >= 0;
    }

}
