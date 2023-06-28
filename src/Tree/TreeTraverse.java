package Tree;

public class TreeTraverse {
    private int nodes;
    private int[] arr;

    public void setArr(int[] arr) {
        this.arr = arr;
        this.nodes = arr.length;
    }

    // 전위 순회 V -> L -> R
    // preorder(): System.out.println(V) -> preorder(L) -> preorder(R)
    public void traversePreorder(int node) {
        if (node < this.nodes && arr[node] != 0) {
            System.out.print(arr[node] + ", "); // 방문
            this.traversePreorder(node * 2); // 왼쪽 자식(i * 2)을 루트로 다시 호출
            this.traversePreorder(node * 2 + 1); // 오른쪽 자식(i * 2 + 1);
        }
    }

    // 중위 순회 L -> V -> R
    // inorder(): inorder(L) -> System.out.println(V) -> inorder(R)
    public void traverseInorder(int node) {
        if (node < this.nodes && arr[node] != 0) {
            this.traverseInorder(node * 2); // 왼쪽 자식(i * 2)을 루트로 다시 호출
            System.out.print(arr[node] + ", "); // 방문
            this.traverseInorder(node * 2 + 1); // 오른쪽 자식(i * 2 + 1);
        }
    }

    // 후위 순회 L -> R -> V
    // postorder(): postorder(L) -> postorder(R) -> System.out.println(V)
    public void traversePostorder(int node) {
        if (node < this.nodes && arr[node] != 0) {
            this.traversePostorder(node * 2); // 왼쪽 자식(i * 2)을 루트로 다시 호출
            this.traversePostorder(node * 2 + 1); // 오른쪽 자식(i * 2 + 1);
            System.out.print(arr[node] + ", "); // 방문
        }
    }

    public static void main(String[] args) {
        TreeTraverse treeTraverse = new TreeTraverse();
        treeTraverse.setArr(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12});

        treeTraverse.traversePreorder(1); // 처음 방문점은 root node
        System.out.println();
        treeTraverse.traverseInorder(1);
        System.out.println();
        treeTraverse.traversePostorder(1);
    }
}
