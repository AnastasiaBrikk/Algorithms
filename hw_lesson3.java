public class hw_lesson3 {
    public class LinkedList {
        Node head;
        Node tail;

        public class Node {
            int value;
            Node next;
            Node previous;
        }

        public void removeLastElements(int n) {
            while (n != 0) {
                rmLast();
                n--;
            }
        }

        public void rmLast() {
            if (head != null) {
                Node currentNode = head;
                if (currentNode.next == null) {
                    head = null;
                }
                while (currentNode.next != null) {
                    if (currentNode.next.next == null) {
                        currentNode.next = null;
                        return;
                    }
                    currentNode = currentNode.next;
                }
            }
        }

        public void reverseList() {
            if (head != null && head.next != null) {
                Node temp = head;
                reverseList(head.next, head);
                temp.next = null;

            }
        }

        private void reverseList(Node currentNode, Node previousNode) {
            if (currentNode.next == null) {
                head = currentNode;
            } else {
                reverseList(currentNode.next, currentNode);
            }
            currentNode.next = previousNode;
        }

        public void reverseDoubleList(Node head, Node tail) {
            Node currentNode = head;
            while (currentNode != null) {
                Node next = currentNode.next;
                Node previous = currentNode.previous;
                currentNode.next = previous;
                currentNode.previous = next;
                if (previous == null) {
                    tail = currentNode;
                }
                if (next == null) {
                    head = currentNode;
                }
                currentNode = next;
            }
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", next=" + next + "}";
        }

        public void printList() {
            Node currentNode = head;
            while (currentNode != null) {
                System.out.println(currentNode.value + " ");
                currentNode = currentNode.next;
            }
            System.out.println();
        }
    }

}
