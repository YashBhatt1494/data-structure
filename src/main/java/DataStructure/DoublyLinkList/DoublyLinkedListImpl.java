package DataStructure.DoublyLinkList;

public class DoublyLinkedListImpl {
    public static void main(String[] args) {

        DoublyLinkList<String> linkList = new DoublyLinkList<>();
        for (int i = 1; i < 11; i++){
            linkList.add( i + " Yash");
        }

        linkList.addFirst("0 I am first");
        linkList.indexOf("8 Yash");

        System.out.println(linkList.indexOf("8 Yash"));
        linkList.print();
        System.out.println("bhatt");

    }
}
