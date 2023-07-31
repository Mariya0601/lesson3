package ru.geekbrains.lesson3;

public class Program {

    public static void main(String[] args) {

        class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }


//    разворота односвязного списка
        class LinkedList {
            Node head;

            void reverse() {
                Node prev = null;
                Node current = head;
                Node next = null;

                while (current != null) {
                    next = current.next;
                    current.next = prev;
                    prev = current;
                    current = next;
                }
                head = prev;

            }

//        разворота двухсвязного связного списка

            class Node {
                int data;
                Node prev;
                Node next;

                Node(int data) {
                    this.data = data;
                    this.prev = null;
                    this.next = null;
                }
            }

            class DoublyLinkedList {
                Node head;

                void reverse() {
                    Node temp = null;
                    Node current = head;

                    while (current != null) {
                        temp = current.prev;
                        current.prev = current.next;
                        current.next = temp;
                        current = current.prev;
                    }

                    if (temp != null) {
                        head = temp.prev;
                    }
                }
            }
        }
    }
}







