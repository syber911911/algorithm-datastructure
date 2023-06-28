package Tree;

public class BinarySearchTree {
    private static class Node {
        private int key;
        private Node left;
        private Node right;

        public Node(int key) {
            this.key = key;
            this.left = null;
            this.right = null;
        }
    }
    private Node root;

    public BinarySearchTree() {
        root = null;
    }

    public void insert(int key) {
        root = insertNode(root, key);
    }

    public Node insertNode(Node node, int key) {
        if (node == null) {
            node = new Node(key);
            return node;
        }

        // 탐색에 성공한 경우 더 확인하지 않는다
        if (node.key == key) {
            return node;
        }

        // 현재 노드보다 데이터가 작을 경우 왼쪽 트리로
        if (key < node.key) {
            node.left = insertNode(node.left, key);
        }
        // 현재 노드보다 데이터가 클 경우 오른쪽 트리로
        if (key > node.key) {
            node.right = insertNode(node.right, key);
        }
        // 삽입이 일어나지 않았을 경우, 본래의 자식을 그대로 반환
        return node;
    }

    public boolean search(int key) {
        return searchNode(root, key);
    }

    private boolean searchNode(Node node, int key) {
        // 현재 노드가 null
        if (node == null) {
            return false;
        }

        // 탐색 성공
        if (key == node.key) {
             return true;
        }

        // 현재 노드보다 데이터가 더 작을 경우 --> 왼쪽 서브트리 탐색 결과 반환
        if (key < node.key) {
            return searchNode(node.left, key);
        }
        // 현재 노드보다 데이터가 더 클 경우 --> 오른쪽 서브트리 탐색 결과 반환
        else  {
            return searchNode(node.right, key);
        }
    }

    public void inOrderTraversal() {
        inOrder(root);
    }

    private void inOrder(Node node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(node.key + " ");
            inOrder(node.right);
        }
    }

    public static void main(String[] args) {
        int[] data = new int[]{50, 30, 70, 20, 40, 60, 80};
        BinarySearchTree bst = new BinarySearchTree();

        for (int datum : data) {
            bst.insert(datum);
        }

        System.out.println("중위 순회");
        bst.inOrderTraversal();
        System.out.println();

        System.out.println(bst.search(40));
        System.out.println(bst.search(55));
        System.out.println(bst.search(80));
    }
}
