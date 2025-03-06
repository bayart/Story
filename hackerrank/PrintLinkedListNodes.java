static void printLinkedList(SinglyLinkedListNode head) {
    while(head != null){
        System.out.println(String.valueOf(head.data));
        head = head.next;
                   
    }