import java.util.*;

public class DoublyLinked{
    public static void main(String args[]){
        DoublyLinkedList a= new DoublyLinkedList();
        a.InsertFront(126);
        a.InsertFront(125);
        a.InsertFront(121);
        a.InsertFront(20);
        a.InsertEnd(120);
        a.InsertEnd(1252);
        a.InsertEnd(1245);
        a.Search(120);
        a.DeleteKey(1245);
//        a.DeleteEnd();
        a.Display();


    }
}
class DoublyLinkedList {
    node head;

    class node {
        int data;
        node left;
        node right;
        node(int ele) {
            data = ele;
        }
    }
    void InsertFront(int ele){
        node e=new node(ele);
        if(head==null){
            head=e;

        }
        else{

            e.right=head;
            head.left=e;
            head=e;
        }
    }
    void InsertEnd(int ele){
        node e=new node(ele);
        if(head==null){
            head=e;
        }
        else{
            node t= head;
            while(t.right!=null){
                t=t.right;
            }
             //X--Y--null
            t.right=e;
            e.left=t;


        }

    }
    void DeleteEnd(){
        if(head==null){
            System.out.print("no element to delete");
        }
        else{
            node temp=head;
            node p=temp;
            while(temp.right!=null){
                p=temp;
                temp=temp.right;
            }
            p.right=null;
            temp.left=null;
        }
    }
    void DeleteFront(){
        // null--A--B  A--B--C  B--C--null
        // A--B B--C C--null
        if(head==null){
            System.out.print("empty list");
        }
        else{
            node temp;
            temp = head;
            temp.right.left=null;
            temp.right=head;

        }
    }
    void Search(int ele) {
        if(head==null){
            System.out.print("No Element to Search");
        }
        else{
            node t =head;
            while(t.right!=null){
                if(t.data == ele){
                    System.out.println("Found");
                    return;

                }
                t=t.right;
            }
            System.out.println("Not Found");
        }

    }
    void DeleteKey(int ele){
        if(head==null){
            System.out.print("No Element to Delete");
        }
        else{
            node t =head;
            while(t.right!=null){
                if(t.data == ele){
                    //X--Y--Z Y--Z--k Z-k-ab
                        t.left.right=t.right;
                        t.right.left=t.left;

                }
                t=t.right;
            }
            System.out.println("Not Found to delete");
        }
    }
    void InsertAfterKey(int ele){

    }
    void InsertAtPos(int ele,int pos){

    }
    void ReverseList(){

    }
    void Display(){
        node t=head;
        if(head==null){
            System.out.print("empty");

        }
        else{
            while(t!=null){
                System.out.println(t.data);
                t=t.right;
            }

        }
    }
}
