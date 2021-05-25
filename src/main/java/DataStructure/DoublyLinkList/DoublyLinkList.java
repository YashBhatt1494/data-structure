package DataStructure.DoublyLinkList;

public class DoublyLinkList<E> {

    private int size = 0;
    private Node<E> head = null;
    private Node<E> tail = null;

    public boolean isEmpty(){
        return size == 0;
    }

    public int size(){
        return size;
    }

    public void add(E element){
        if(isEmpty()){
            head = tail = new Node<E>(element, null, null);
        } else {
            tail.setNext(new Node<>(element,tail,null));
            tail = tail.getNext();
        }
        size++;
        //1->2->3->4->5->null
    }

    public void addLast(E element){
        this.add(element);
    }

    public void addFirst(E element){
        Node<E> newNode = new Node<E>(element,null, head );
        head = newNode;
    }

    public void addAt(E element){

    }

    public int indexOf(E element){
        int index = 0;
        Node<E> trav = head;
        if(element == null){
            while(trav != null ){
                if(trav.getData() == null){
                    return index;
                }
                trav = trav.getNext();
                index++;
            }
        } else {
            while( trav != null){
                if( element.equals(trav.getData())){
                    return index;
                }
                trav = trav.getNext();
                index++;
            }
        }
        return -1;
    }

    public void print(){
        Node<E> travel = head;
        for(; travel != null; travel=travel.getNext()){
            System.out.println(" ---> " + travel + " <--- ");
        }
    }


}
