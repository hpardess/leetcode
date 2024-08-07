/**
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

 

Example 1:


Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.
Example 2:

Input: l1 = [0], l2 = [0]
Output: [0]
Example 3:

Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]
 

Constraints:

The number of nodes in each linked list is in the range [1, 100].
0 <= Node.val <= 9
It is guaranteed that the list represents a number that does not have leading zeros.
 */




/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Solution {
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      
      ListNode t = null;
      ListNode current = t;

      int v1 = 0;
      int v2 = 0;
      int carry = 0;
      while(l1 != null || l2 != null || carry != 0) {
          int digit1 = 0;
          int digit2 = 0;
          if(l1 != null) {
              digit1 = l1.val;
              l1 = l1.next;
          }
          if(l2 != null) {
              digit2 = l2.val;
              l2 = l2.next;
          }
          int sum = digit1+digit2+carry;
          carry = (sum)/10;

          ListNode tmp = new ListNode(sum%10);

          if(t == null) {
              t = tmp;
              current = t;
          } else {
              current.next = tmp;
          }
          current = tmp;
      }
      
      // int total = v1+v2;
      // ListNode t = new ListNode();
      // ListNode current = t;
      // while(current != null) {
      //     int digit = total/10;
      //     total = total%10;
      //     if(digit > 0) {
      //         current.val = digit;
      //         current.next = new ListNode();
      //         current = current.next;
      //     }
      // }
      
      // ListNode current = l1;
      // int v1 = 0;
      // int counter = 0;
      // while(current != null) {
      //     v1 = (v1 * 10) + current.val;
      //     current = current.next;
      // }

      // int v2 = 0;
      // current = l2;
      // while(current != null) {
      //     v2 = (v2 * 10) + current.val;
      //     current = current.next;
      // }

      // int total = v1+v2;
      // ListNode t = new ListNode();
      // current = t;
      // while(current != null) {
      //     int digit = total/10;
      //     total = total%10;
      //     if(digit > 0) {
      //         current.val = digit;
      //         current.next = new ListNode();
      //         current = current.next;
      //     }
      // }
      return t;
  }
}