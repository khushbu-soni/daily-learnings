package linkedList.easy;

public class TraverseALinkedList {

    public static void main(String[] args) {


    }

    public int length(ListNode node){
        int length=0;

        ListNode currentNode=node;
        while (currentNode!=null){

            length++;
            currentNode=currentNode.next;
        }
        return length;
    }
}
