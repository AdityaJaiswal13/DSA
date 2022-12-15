package com.company;
public class LinkedList {
        public static class Node{
            int data;
            Node next;
            public Node(int data){
                this.data=data;
                this.next=null;
            }
        }
        public static Node head;
        public static Node tail;

        public void addfirst(int data){
            Node newnode=new Node(data);
            if(head==null){
                head=tail=newnode;
                return;
            }

            newnode.next=head;
            head=newnode;

        }
        public void addlast(int data){
            Node newnode=new Node(data);
            if(head==null){
                head=tail=newnode;
                return;
            }
            tail.next=newnode;
            tail=newnode;
        }
        public void printll(){
            if(head==null){
                System.out.println("empty");
                return;
            }
            Node temp=head;
            while (temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;

            }
            System.out.println();
        }


        public static void main(String[] args) {
            LinkedList ll=new LinkedList();
            ll.addfirst(1);
            ll.printll();
        }
    }



