public class Main {
    public static void main(String[] args) {
    
        System.out.println("===== Testing Doubly Linked List =====");

DoublyLinkedList list = new DoublyLinkedList();

Node n1 = new Node(1, 10);
Node n2 = new Node(2, 20);
Node n3 = new Node(3, 30);


list.insertatFront(n1);
list.insertatFront(n2);
list.insertatFront(n3);

list.display();

list.movetoFront(n1);
list.display(); 

list.removeNode(n3);
list.display();

list.removeTail();
list.display();
 

System.out.println("\n===== Testing Hash Table =====");

HashTable table = new HashTable(10);

Node h1 = new Node(10, 100);
Node h2 = new Node(20, 200);

table.insert(10, h1);
table.insert(20, h2);

System.out.println(table.search(10).value); 
System.out.println(table.search(20).value); 

table.remove(10);

System.out.println(table.search(10));
System.out.println("Count = " + table.getCount());
    

   System.out.println("====Testing LRU=====");
        
        LRUCache cache = new LRUCache(4);

        System.out.println("=== Test 1: Insert until full capacity ===");
        cache.put(1, 10);
        cache.put(2, 20);
        cache.put(3, 30);
        cache.put(8, 80);
        cache.display();
    

        System.out.println("\n=== Test 2: Access elements repeatedly ===");
        System.out.println("get(1) = " + cache.get(1));
        cache.display();
        
        System.out.println("get(3) = " + cache.get(3));
        cache.display();

        System.out.println("\n=== Test 3: Eviction correctness ===");
        cache.put(4, 40);
        cache.display();

       System.out.println("get(2) = " + cache.get(2));

        System.out.println("\n=== Test 4: Updating existing keys ===");
        cache.put(3, 300); 
        cache.display();
        
        System.out.println("get(3) = " + cache.get(3));
        

        System.out.println("\n=== Test 5: Removing elements ===");
        cache.remove(4);
        cache.display();

        System.out.println("\n=== Test 6: Remove head ===");
        cache.remove(3);
        cache.display();

        System.out.println("\n=== Test 7: Remove tail / last element ===");
        cache.remove(1);
        cache.display();

        System.out.println("\n=== Test 8: Empty cache operations ===");
        System.out.println("get(1) = " + cache.get(1));

        cache.remove(100); 
        cache.display();

        System.out.println("\n=== Test 9: Repeated access ===");
        cache.put(5, 50);
        cache.put(6, 60);
        cache.put(7, 70);
        cache.display();

        cache.get(5);
        cache.get(5);
        cache.get(5);
        cache.display();

        System.out.println("\n=== Test 10: Eviction after repeated access ===");
        cache.put(8, 80); 
        cache.display();

        System.out.println("get(6) = " + cache.get(6));

        System.out.println("\n=== Final Cache State ===");
        cache.display();
    }

    
    }