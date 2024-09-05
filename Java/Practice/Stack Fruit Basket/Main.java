import java.util.*;

public class Main {
    public static void main (String [] args) {
        
        while (true) {
                
            @SuppressWarnings("resource")
            Scanner sc = new Scanner (System.in);
            Stack<String> basket = new Stack<String>();
            
            System.out.println("");
			System.out.println("----------------------------------");
            System.out.print("How many fruits would you like to eat?: ");
            int maxFruitNum = sc.nextInt();
            
            System.out.println("----------------------------------");
			System.out.println("Fruits available: Apple, Orange, Mango, Guava");
            System.out.println("Choose a fruit to catch: A - Apple | O - Orange | M - Mango | G - Guava ");
            
            for (int fruitNum = 1; fruitNum <= maxFruitNum; fruitNum++) {
                System.out.print("Fruit " + fruitNum + " of " + maxFruitNum + ": ");
                String ans = sc.next();
                
                switch (ans) {
                    case "A":
                    case "a":
                        basket.push("Apple");
                    break;
                    
                    case "O":
                    case "o":
                        basket.push("Orange");
                    break;
                    
                    case "M":
                    case "m":
                        basket.push("Mango");
                    break;
                    
                    case "G":
                    case "g":
                        basket.push("Guava");
                    break;
                    
                    default:
                        System.out.println("Input Error. Please try again.");
                    break;
                }
                
            }
            
            System.out.println("----------------------------------");
            System.out.println("Your basket now has: " + basket);
            System.out.print("Press E to eat a fruit: ");
            
            while (!basket.empty()) {
                char eat = sc.next().charAt(0);
                
                if(eat == 'E' || eat == 'e') {
                    basket.pop();
                }
                else {
                    System.out.println("Input Error. Please try again.");
                }
                
            if (basket.isEmpty()) {
                System.out.println("----------------------------------");
                System.out.println("No more fruits!");
                Loop();
                break;
            }
            
            System.out.println("Your basket now has: " + basket);
            System.out.print("Press E to eat a fruit: ");
            
            }
            
        }
    }
    
    public static void Loop() {
        Scanner sc1 = new Scanner (System.in);
        System.out.println("----------------------------------");
        System.out.println("Would you like to get more?");
        System.out.print("Press Y to Accept | Press N to Decline: ");
        String ex = sc1.nextLine();
        
        switch (ex)
        {
            case "Y":
            case "y":
                
            System.out.println("----------------------------------");
            System.out.println("");
			System.out.print("Getting another basket");
			System.out.print(".");
			System.out.print(".");
			System.out.println(".");
        break;
        
            case "N":
            case "n":
            
            System.out.println("----------------------------------");
            System.out.println("");
            System.out.println("Thank you for trying out my system. Take care!");
            System.exit(0);
        break;
        
            default:
            System.out.println("Input error. Please try again.");
            System.out.println("");
            Loop();
        }

        sc1.close();
    }
}