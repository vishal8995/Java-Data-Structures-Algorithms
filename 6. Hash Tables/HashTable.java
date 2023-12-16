import java.util.ArrayList;

public class HashTable {

	// CREATE CLASS VARIABLES, NODE CLASS, AND CONSTRUCTOR HERE//
	private int size = 7;
    private Node[] dataMap;

    public HashTable() {
        dataMap = new Node[size];
    }

    class Node {
        private String key;
        private int value;
        private Node next;

        public Node(String key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    public Node[] getDataMap() {
        return dataMap;
    }

    public void printTable() {
        for(int i = 0; i < dataMap.length; i++) {
            System.out.println(i + ":");
            if(dataMap[i] != null) {
                Node temp = dataMap[i];
                while (temp != null) {
                    System.out.println("   {" + temp.key + ", " + temp.value + "}");
                    temp = temp.next;
                }
            }
        }
    }

    // HASH METHOD MUST BE PUBLIC FOR CODE IN MAIN TO WORK
	/// WRITE HASH METHOD HERE ///
    public int hash(String key) {
        int hash = 0;
        for(int i = 0; i < key.length(); i++) {
            int asciivalue = key.charAt(i);
            hash = (hash + asciivalue * 23) % size;
        }
        return hash;
    }


    // Set
    public void set (String key, int value) {
        int index = hash(key);
        Node newNode = new Node(key, value);
        if (dataMap[index] == null) {
            dataMap[index] = newNode;
        } else {
            Node temp = dataMap[index];
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // Get
    public int get(String key) {
        int index = hash(key);
        Node temp = dataMap[index];
        while (temp != null){
            if (temp.key == key) return temp.value;
            temp = temp.next;   
        }
        return 0;
    }

    // Return All Keys
    public ArrayList<String> keys(){
        ArrayList<String> keys = new ArrayList<>();
        for (int i=0; i <dataMap.length; i++){
            Node temp = dataMap[i];
            while (temp != null) {
                keys.add(temp.key);
                temp = temp.next;
            }
        }
        return keys;
    }
}