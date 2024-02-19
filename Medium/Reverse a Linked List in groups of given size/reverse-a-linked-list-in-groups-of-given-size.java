//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

class ReverseInSize
{
    static Node head;
    
    public static void main (String[] args)throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        
        int t = Integer.parseInt(in.readLine().trim());
        
        while(t-- > 0)
        {
            int n = Integer.parseInt(in.readLine().trim());
            String s[]=in.readLine().trim().split(" ");
            int a1 = Integer.parseInt(s[0]);
            Node head = new Node(a1);
            Node tail = head;
            for(int i = 1; i < n; i++)
            {
                int a = Integer.parseInt(s[i]);
                // addToTheLast(new Node(a));
                tail.next = new Node(a);
                tail =tail.next;
            }
            
            int k = Integer.parseInt(in.readLine().trim());
            Solution ob = new Solution();
            Node res = ob.reverse(head, k);
            printList(res,out);
            out.println();
        }
        out.close();
    }
    
    public static void printList(Node node,PrintWriter out)
    {
        while(node != null)
        {
            out.print(node.data + " ");
            node = node.next;
        }
    }
    
}


// } Driver Code Ends


/*node class of the linked list

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

*/

// class Solution
// {
//     static Node th = null;
//     static Node tt = null;
//     public static Node reverse(Node head, int k)
//     {
//         //Your code here
//         if(head == null || head.next == null) return head;
//         Node curr = head;
        
//         int n = findLen(head);
//         int times = n/k;
//         int lastRev = 0;
//         if(n % k != 0){
//              lastRev = n - (times * k);
//         }
        
//         Node oh = null;
//         Node ot = null;
        
//         while(n >= k){
//             int tempK = k;
//             while(tempK-- > 0){
//              Node forward = curr.next;
//             curr.next = null;
//             addFirst(curr);
//             curr = forward;
           
//         }
//         if(oh == null){
//             oh = th;
//             ot = tt;
//         }
//         else{
//             ot.next = th;
//             ot = tt;
//         }
//         th = null;
//         tt = null;
//         n -= k;
//         }
//         ot.next = curr;
//         if(n % k != 0)
//         {while(lastRev-- > 0){
//         th = null;
//         tt = null;
//             Node forward = curr.next;
//             curr.next = null;
//             addFirst(curr);
//             curr = forward;
//         }
//         ot.next = th;
//         ot = tt;
//         }
//         ot.next = curr;
//         return oh;
        
//     }
//     static void addFirst(Node node){
//         if(th == null){
//             th = node;
//             tt = node;
//         }else{
//             node.next = th;
//             th = node;
//         }
//     }
//     static int findLen(Node node){
//         int n = 0;
//         while(node != null){
//             node = node.next;
//             n++;
//         }
//         return n;
//     }
// }

