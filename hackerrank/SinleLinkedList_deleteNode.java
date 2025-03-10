SinleLinkedList_deleteNode static SinglyLinkedListNode deleteNode(SinglyLinkedListNode llist, int position) {
    // Write your code here
        
        SinglyLinkedListNode newList = llist;
                
        for(int i=0; i< position-1; i++){
            if(newList == null || newList.next == null){
                throw new IllegalArgumentException("wrong position input");
                }
            newList = newList.next;
        }
        
        SinglyLinkedListNode DeleteNode = newList.next;
        newList.next = DeleteNode.next;
                
        return llist;
        
    }