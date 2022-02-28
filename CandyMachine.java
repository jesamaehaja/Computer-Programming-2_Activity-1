package HAJASCANDYMACHINE;
//import java.uti.Arrays;
import java.util.Scanner;
public class CandyMachine {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int itemsToBuy;
    int totalCost = 0;

    System.out.println("Product            Cost");
    System.out.println("[1] Ferrero Rocher   99");
    System.out.println("[2] Pop Rocks        84");
    System.out.println("[3] Frooty Choco Pop 30");
    System.out.println("[4] Milk Duds        39");
    System.out.println("[5] Junior Mints     27");
    System.out.println("[6] Milky Way        99");
    System.out.println("[7] Cotton Candy     20");
    System.out.println("[8] Gummi Bears      45");
    System.out.println("[9] Wiggles          43");
    System.out.println("[10] Happy Dreams    38");
    System.out.println();
    
    System.out.print("How many items to buy? : ");
    itemsToBuy = sc.nextInt();
    
    int[] itemsBought = new int[itemsToBuy] ;
    
    System.out.println("Enter product numbers: ");
    for(int i = 0; i <itemsToBuy; i++) 
        itemsBought[i] = sc.nextInt();  

     // Display items bought
    System.out.println();
    System.out.println("Items bought: ");
    for(int i = 0; i <itemsToBuy; i++) {
        if(itemsBought [i] == 1) {
            System.out.println("Ferrero Rocher   99");
        } else if (itemsBought[i] == 2) {
            System.out.println("Pop Rocks        84");
        } else if (itemsBought[i] == 3) {
            System.out.println("Frooty Choco Pop 30");
        } else if (itemsBought[i] == 4) {
            System.out.println("Milk Duds        39");
        } else if (itemsBought[i] == 5) {
            System.out.println("Junior Mints     27");
        } else if (itemsBought[i] == 6) {
            System.out.println("Milky Way        99");
        } else if (itemsBought[i] == 7) {
            System.out.println("Cotton Candy     20");
        } else if (itemsBought[i] == 8) {
            System.out.println("Gummi Bears      45");
        } else if (itemsBought[i] == 9) {
            System.out.println("Wiggles          43");
        } else if (itemsBought[i] == 10) {
            System.out.println("Happy Dreams     38");
        }
    }
        System.out.println();

        System.out.print("TotalCost: ");
        for(int i = 0; i < itemsToBuy; i++) {
            if (itemsBought[i] == 1) {
                totalCost += 99;
            } else if (itemsBought[i] == 2) {
                totalCost += 84;
            } else if (itemsBought[i] == 3) {
                totalCost += 30;
            } else if (itemsBought[i] == 4) {
                totalCost += 39;
            } else if (itemsBought[i] == 5) {
                totalCost += 27;
            } else if (itemsBought[i] == 6) {
                totalCost += 99;
            } else if (itemsBought[i] == 7) {
                totalCost += 20;
            } else if (itemsBought[i] == 8) {
                totalCost += 45;
            } else if (itemsBought[i] == 9) {
                totalCost += 43;
            } else if (itemsBought[i] == 10) {
                totalCost += 38;
            }
        }
        System.out.print(totalCost);
        
    }
}