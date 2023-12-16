public class Main {

    public static void main(String[] args) {

        // Heap myHeap = new Heap();
        // myHeap.insert(99);
        // myHeap.insert(72);
        // myHeap.insert(61);
        // myHeap.insert(58);

        // System.out.println(myHeap.getHeap());


        // myHeap.insert(100);

        // System.out.println(myHeap.getHeap());


        // myHeap.insert(75);

        // System.out.println(myHeap.getHeap());

        // /*
        //     EXPECTED OUTPUT:
        //     ----------------
        //     [99, 72, 61, 58]
        //     [100, 99, 61, 58, 72]
        //     [100, 99, 75, 58, 72, 61]

        // */


        Heap myHeap = new Heap();
        myHeap.insert(95);
        myHeap.insert(75);
        myHeap.insert(80);
        myHeap.insert(55);
        myHeap.insert(60);
        myHeap.insert(50);
        myHeap.insert(65);

        System.out.println(myHeap.getHeap());


        myHeap.remove();

        System.out.println(myHeap.getHeap());


        myHeap.remove();

        System.out.println(myHeap.getHeap());

        /*
            EXPECTED OUTPUT:
            ----------------
            [95, 75, 80, 55, 60, 50, 65]
            [80, 75, 65, 55, 60, 50]
            [75, 60, 65, 55, 50]

        */

    }

}