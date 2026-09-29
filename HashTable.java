class HashTable{

    int size ;
    int count ;

    Node table[] ;

    public HashTable(int cap){

        size = cap * 2 ;

        table = new Node[size] ;

        count = 0 ;
    }

    public int hashFunction(int key){

        return Math.abs(key) % size ;
    }

    public void insert(int key , Node n){

        int i = 0 ;

        int index = hashFunction(key) ;

        while(table[(index + i*i)%size] != null){

            if(table[(index + i*i)%size].key == key){
                break ;
            }

            i++ ;

            if(i >= size){

                System.out.println("table full") ;
                return ;
            }
        }

        if(table[(index + i*i)%size] == null){
            count++ ;
        }

        table[(index + i*i)%size] = n ;
    }

    public Node search(int key){

        int i = 0 ;

        int index = hashFunction(key) ;

        while(table[(index + i*i)%size] != null && i < size){

            if(table[(index + i*i)%size].key == key){

                return table[(index + i*i)%size] ;
            }

            i++ ;
        }

        return null ;
    }

    public void remove(int key){

        int i = 0 ;

        int index = hashFunction(key) ;

        while(table[(index + i*i)%size] != null && i < size){

            if(table[(index + i*i)%size].key == key){

                table[(index + i*i)%size] = null ;

                count-- ;

                return ;
            }

            i++ ;
        }
    }

    public int getCount(){

        return count ;
    }
}

class LRUCache{

    int capacity ;

    DoublyLinkedList list ;

    HashTable table ;

public LRUCache(int capacity){

        this.capacity = capacity ;
       this.list = new DoublyLinkedList() ;
        this.table = new HashTable(capacity) ;
    }

    public Integer get(int key){

        Node temp = table.search(key) ;

        if(temp == null){

            return null ;
        }

        list.movetoFront(temp) ;
        return temp.value ;
    }
    public void put(int key , int value){

        Node temp = table.search(key) ;

        if(temp != null){

            temp.value = value ;

            list.movetoFront(temp) ;
        }

        else{

            if(table.getCount() >= capacity){

                Node last = list.removeTail() ;

                if(last != null){

                    table.remove(last.key) ;
                }
            }

            Node newNode = new Node(key , value) ;

            table.insert(key , newNode) ;

            list.insertatFront(newNode) ;
        }
    }
    public void remove (int key){

        Node temp = table.search(key) ;

        if(temp != null){

            list.removeNode(temp) ;

            table.remove(key) ;
        }
    }
    public void display(){

        list.display() ;
    }
}
