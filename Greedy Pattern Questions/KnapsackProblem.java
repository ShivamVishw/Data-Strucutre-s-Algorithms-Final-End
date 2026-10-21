// GFG Problem Link: https://www.geeksforgeeks.org/problems/fractional-knapsack-1587115620/1

import java.util.Arrays;

class Item {
    int value;
    int weight;

    Item(int value, int weight){
        this.value = value;
        this.weight = weight;
    }
}

public class KnapsackProblem {
    public double fractionalKnapsack(int[] value, int[] weight, int capacity) {
        // code here
        
        
        // get the length 
        int n = value.length;
        
        
        // create the item object which will store coordinates of value and their corresponding weights
        Item items [] = new Item[n];
        
        
        // Assign value and weights 
        for(int i =0; i<n; i++){
            items[i] = new Item(value[i], weight[i]);
        }
        
        // sort this items array 
        Arrays.sort(items, (a, b) ->
            Double.compare(
                (double) b.value/b.weight, (double) a.value/a.weight)
        );
        
        
        // get the max value from this 
        double totalvalue = 0.0;
        
        for(Item item : items){
            // if capacity is 0  break 
            if(capacity ==0){
                break;
            }
            
            if(item.weight <= capacity){
                totalvalue += item.value;
                capacity -= item.weight;
            }
            else{
                totalvalue += (double) item.value*capacity / item.weight;
                capacity =0;
            }
        }
        
        
        return totalvalue;
        
        
        
    }
}
