public class ReverseLinkedList {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        // Создаем связанный список: 1 -> 2 -> 3 -> 4
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);

        head.next = second;
        second.next = third;
        third.next = fourth;

        // Выводим список в перевернутом виде
        reverseAndPrintList(head);
    }

    public static void reverseAndPrintList(Node node) {
        Node prev = null;
        Node current = node;

        while (current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        // prev указывает на новую голову списка
        // Выводим элементы списка в перевернутом порядке
        while (prev != null) {
            System.out.print(prev.data);

            if (prev.next != null) {
                System.out.print(" -> ");
            }

            prev = prev.next;
        }
    }
}
