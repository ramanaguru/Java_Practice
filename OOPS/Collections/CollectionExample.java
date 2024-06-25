package Collections;

import java.util.Collection;

public class CollectionExample {
    public static void main(String[] args) {
        Collection<String> customCollection = new CustomCollection<>();
        
        // Adding elements
        customCollection.add("Apple");
        customCollection.add("Banana");
        customCollection.add("Cherry");
        
        // Removing an element
        customCollection.remove("Banana");
        
        // Checking size and if the collection is empty
        System.out.println("Size: " + customCollection.size()); // Output: 2
        System.out.println("Is empty: " + customCollection.isEmpty()); // Output: false
        
        // Checking if an element is in the collection
        System.out.println("Contains 'Cherry': " + customCollection.contains("Cherry")); // Output: true
        
        // Iterating over the collection
        System.out.println("Elements in the collection:");
        for (String fruit : customCollection) {
            System.out.println(fruit);
        }
        
        // Displaying the collection
        System.out.println("Custom Collection: " + customCollection);
    }
}
