package mapslistsandBST.linkedLists;
/**
 * Given the head of a singly linked list, reverse the list, and return the reversed list.
 * Definition for singly-linked list.
 * public class listnode {
 *     int val;
 *     listnode next;
 *     listnode() {}
 *     listnode(int val) { this.val = val; }
 *     listnode(int val, listnode next) { this.val = val; this.next = next; }
 * }
 */

class listnode {
      int val;
      listnode next;
      listnode() {}
      listnode(int val) { this.val = val; }
      listnode(int val, listnode next) { this.val = val; this.next = next; }
}

public class rvrsLL {
    public listnode reverseList(listnode head) {
        listnode newHead = null ;
        while (head != null ) {
            listnode next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
        }
        return newHead;
    }
}
