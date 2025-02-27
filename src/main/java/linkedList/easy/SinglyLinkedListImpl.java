package linkedList.easy;

import static java.nio.file.Files.delete;

public class SinglyLinkedListImpl implements SinglyLinkedList{

    private int length;
    private ListNode head;

    @Override
    public synchronized ListNode getHeader() {
        return head;
    }

    @Override
    public synchronized void insertAtBegin(ListNode node) {
        node.next=head;
        head=node;
        length++;
    }

    @Override
    public synchronized void insertAtEnd(ListNode nodeToBeAddedAtEnd) {
        if (head == null){
            head = nodeToBeAddedAtEnd;
        }else{
            ListNode lastNode=head;
            while (lastNode.next!=null){
                lastNode=lastNode.next;
            }

            lastNode.next=nodeToBeAddedAtEnd;
        }
        length++;

    }

    @Override
    public synchronized void insert(int  data, int position) {
//        Fix the position
        ListNode newNode=new ListNode(data);
        if(position<0){
            position=0;
        }

        if(position>length){
            position=length;
        }

        if(head==null){
            head=new ListNode(data);
        }

        if(position==0){

            insertAtBegin(newNode);
        }else{
            ListNode tempNode =head;

            for (int i = 0; i <position ; i++) {
                newNode.next=tempNode;
            }


        }
        length++;
    }

    public void deleteNode(ListNode node) {

        ListNode prev=null;
        while(node!=null && node.next!=null){
//            node.data=node.next.val;
            prev=node;
            node=node.next;
        }

        prev.next=null;
//        delete(node);

    }



}
