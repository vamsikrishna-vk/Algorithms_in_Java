import java.util.*;
public class SinglyLinkedList{
public static void main(String args[]){
   LinkedList a= new LinkedList();
   a.InsertFront(5);
   a.InsertFront(7);
   a.InsertFront(9);
   a.InsertFront(15);
   a.InsertEnd(10);
   a.InsertEnd(7);
   a.DeleteEnd();
   a.DeleteFront();
   a.Search(244);
   a.DeleteKey(10);
   a.Display();


}

}

class LinkedList {
    node head;

    class node {
        int data;
        node next;
        node(int ele) {
            data = ele;
        }
    }
    void InsertFront(int ele){
        node s= new node(ele);
        if(head==null){
            head=s;
            head.data=ele;
            head.next=null;
        }
        else{
            s.next=head;
            head=s;
        }
    }
    void InsertEnd(int ele){
        node n=new node(ele);
        node p=head;
        if(head==null){
            head=n;
        }
        else{
            while(p.next!=null){
                p=p.next;
            }
            p.next=n;
        }
    }
    void DeleteEnd(){
        node temp=head;
        node p=temp;
        if(head==null){
            System.out.print("Linked List is Empty to delete");
        }
        else{
            while(temp.next!=null){
                p=temp;
                temp=temp.next;
            }
           p.next=null;
        }
    }
    void DeleteFront(){
        node t;
        if(head==null){
            System.out.println("Linked List is empty to delete");
        }
        else{

           head=head.next;

        }

    }
    void Search(int ele) {
        node t = head;
        if (head != null) {
            while (t.next != null) {
                if (t.data == ele) {
                    System.out.print("found");
                    return;
                }
                t = t.next;

            }
            System.out.print("Not found");
        }
    }
    void DeleteKey(int ele){
        node t = head;
        node temp=t;
        if (head != null) {
            while (t.next != null) {
                if (t.data == ele) {
                    System.out.print("found");
                    temp.next=t.next;
                    return;
                }
                temp=t;
                t = t.next;

            }
            System.out.print("Not found");
        }
    }
    void InsertAfterKey(int ele){

    }
    void InsertAtPos(int ele,int pos){

    }
    void ReverseList(){
        if(head==null || head.next==null){
            System.out.print("Reversed");
        }
        else{
            node t,p,q;
            t=head;
            p=head;
            q=null;
            while(t!=null){
                t=t.next;
                p.next=q;

            }
        }
    }
    void Display(){
        if(head==null){
            System.out.println("List is Empty");
        }
        else {
            node n= head;
            while (n != null) {
                System.out.println(n.data);
                n=n.next;
            }
        }
    }
}
