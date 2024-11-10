public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList(3);
        list.append(3);
        list.insert(1, 3);
        list.removeFirst();

        list.printList();
    }
}
