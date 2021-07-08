class Node {
    int data;
    Node5 right, left;
    Node(int data){
        this.data = data;
        this.left = this.right = null;
    }
}
public class Tree {
    static int maxLevel = 0;
    public static void main(String...k){
        Node5 root = new Node5(1);
        root.left = new Node5(2);
        root.right = new Node5(3);
        root.left.left = new Node5(4);
        root.left.right = new Node5(5);
        root.right.left = new Node5(6);
        root.right.right = new Node5(7);
        root.left.left.left = new Node5(9);
        root.right.right.right = new Node5(8);
        root.right.right = new Node5(5);
        root.left.left.left.left = new Node5(10);
        leftView(root,1);
        maxLevel = 0;
        rightView(root,1);
    }

    public static void leftView(Node5 root, int level){
        if(null == root){
            return;
        }

        leftView(root.left,level+1);

        if(maxLevel <= level){
            System.out.print(root.data + " ");
            maxLevel++;
        }

    }
    public static void rightView(Node5 root, int level){
        if(null == root){
            return;
        }

        if(maxLevel < level){
            System.out.print(root.data + " ");
            maxLevel = level;
        }
        rightView(root.right,level+1);
    }
}
