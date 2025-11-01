import java.util.*;

public class GreedyKnapsack {
    static class Item {
        int index;
        double weight;
        double cost;
        double ratio;

        Item(int index, double weight, double cost) {
            this.index = index;
            this.weight = weight;
            this.cost = cost;
            this.ratio = cost / weight;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: knapsack capacity
        System.out.print("Enter Knapsack capacity: ");
        double capacity = sc.nextDouble();

        // Input: number of items
        System.out.print("Enter number of items: ");
        int n = sc.nextInt();

        double[] weight = new double[n];
        double[] cost = new double[n];

        // Input: individual weights
        System.out.println("Enter the weights of items:");
        for (int i = 0; i < n; i++) {
            weight[i] = sc.nextDouble();
        }

        // Input: individual costs
        System.out.println("Enter the costs of items:");
        for (int i = 0; i < n; i++) {
            cost[i] = sc.nextDouble();
        }

        // Create item list
        List<Item> items = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            items.add(new Item(i + 1, weight[i], cost[i]));
        }

        // Sort by value/weight ratio (descending order)
        items.sort((a, b) -> Double.compare(b.ratio, a.ratio));

        double totalCost = 0;
        double totalWeight = 0;
        List<String> selected = new ArrayList<>();

        for (Item item : items) {
            if (capacity == 0) break;

            if (item.weight <= capacity) {
                // Take the full item
                totalCost += item.cost;
                totalWeight += item.weight;
                capacity -= item.weight;
                selected.add("Item " + item.index + " (Full)");
            } else {
                // Take fractional part
                double fraction = capacity / item.weight;
                totalCost += item.cost * fraction;
                totalWeight += item.weight * fraction;
                selected.add("Item " + item.index + " (" + String.format("%.2f", fraction * 100) + "% taken)");
                capacity = 0;
            }
        }

        System.out.println("\nItems selected in Knapsack:");
        for (String s : selected) System.out.println(s);

        System.out.println("\nTotal Weight in Knapsack: " + totalWeight);
        System.out.println("Total Cost of Knapsack: " + totalCost);
    }
}

