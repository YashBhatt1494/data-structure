package dynamicArray;



public class useDynamicArray {
    public static void main(String[] args) {
        DynamicArray<String> array = new DynamicArray<String>();
        array.add(new String("yash"));
        array.add("bhatt");
        array.add("bhatt");
        array.add("bhatt");
        array.add("bhatt");

        System.out.println(array);


    }
}
