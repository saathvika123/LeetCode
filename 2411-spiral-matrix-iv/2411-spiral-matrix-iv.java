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
class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        if(head==null) return new int[][]{};
        int a[][]=new int[m][n];
        for(int i[]:a)
        {
            Arrays.fill(i,-1);
        }
        int rowBegin=0,rowEnd=m-1,colBegin=0,colEnd=n-1;
        while(head!=null)
        {
        for(int i=colBegin;i<=colEnd&&head!=null;i++)
        {
            a[rowBegin][i]=head.val;
            head=head.next;
        }
        rowBegin++;
        for(int i=rowBegin;i<=rowEnd&&head!=null;i++)
            {
                a[i][colEnd]=head.val;
                head=head.next;
            }
            colEnd--;

            if(rowBegin<=rowEnd)
            {
            for(int i=colEnd;i>=colBegin&&head!=null;i--)
            {
                a[rowEnd][i]=head.val;
                head=head.next;
            }
            rowEnd--;
            }
            if(colBegin<=colEnd){
            for(int i=rowEnd;i>=rowBegin&&head!=null;i--)
            {
                a[i][colBegin]=head.val;
                head=head.next;
            }
            colBegin++;
            }
        }
        return a;
    }
}