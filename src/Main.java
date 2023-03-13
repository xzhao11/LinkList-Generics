class Main {
    public static void main(String[] args) {
        MyIntLinkedList list = new MyIntLinkedList();
        list.printList();
        list.add(1);
        list.printList();
        list.add(2);
        list.printList();
        list.add(3);
        list.printList();

        list.remove();
        list.printList();
        list.remove();
        list.printList();

        MyLinkedList<Integer> myIntList = new MyLinkedList<>();
        myIntList.printList();
        myIntList.add(1);
        myIntList.printList();
        myIntList.add(2);
        myIntList.printList();
        myIntList.add(3);
        myIntList.printList();

        myIntList.remove();
        myIntList.printList();
        myIntList.remove();
        myIntList.printList();

        MyLinkedList<String> myStringList = new MyLinkedList<>();
        myStringList.printList();
        myStringList.add("1");
        myStringList.printList();
        myStringList.add("2");
        myStringList.printList();
        myStringList.add("3");
        myStringList.printList();

        myStringList.remove();
        myStringList.printList();
        myStringList.remove();
        myStringList.printList();

    }
}

