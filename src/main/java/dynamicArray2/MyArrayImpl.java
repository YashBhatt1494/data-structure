package dynamicArray2;

public class MyArrayImpl {

    public static void main(String[] args) {

        MyArray<String> myArray = new MyArray<String>();

        for (int i = 0; i < 16; i++){
            myArray.add(i + " Yash");
        }


        myArray.set(35, "XXXXXXXXX new 35");



        myArray.printArray();
        myArray.removeAt(15);
        myArray.printArray();


        System.out.println("My name is Yash INDEX IS ==> " + myArray.indexOf("XXXXXXXXX new 35"));
        System.out.println("My name is Yash INDEX IS ==> " + myArray.indexOf("10 Yash"));

        System.out.println("My name is Yash INDEX IS ==> " + myArray.contains("XXXXXXXXX new 35"));
        System.out.println("My name is Yash contains IS ==> " + myArray.contains("10 Yash"));

        myArray.removeObj("10 Yash");
        myArray.clear();
        myArray.printArray();

    }
}
