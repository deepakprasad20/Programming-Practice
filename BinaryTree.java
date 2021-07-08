// Java program for recursive level order traversal in spiral form

/* A binary tree node has data, pointer to left child
and a pointer to right child */
class Node5 {
    int data;
    Node5 left, right;

    public Node5(int d)
    {
        data = d;
        left = right = null;
    }
}

class BinaryTree {
    Node5 root;

    // Function to print the spiral traversal of tree
    void printSpiral(Node5 node)
    {
        int h = height(node);
        int i;

		/* ltr -> left to right. If this variable is set then the
		given label is traversed from left to right */
        boolean ltr = true;
        for (i = 1; i <= h; i++) {
            printGivenLevel(node, i, ltr);

            /*Revert ltr to traverse next level in opposite order*/
            ltr = !ltr;
        }
    }

    /* Compute the "height" of a tree -- the number of
    nodes along the longest path from the root node
    down to the farthest leaf node.*/
    int height(Node5 node)
    {
        if (node == null)
            return 0;
        else {

            /* compute the height of each subtree */
            int lheight = height(node.left);
            int rheight = height(node.right);

            /* use the larger one */
            if (lheight > rheight)
                return (lheight + 1);
            else
                return (rheight + 1);
        }
    }

    /* Print nodes at a given level */
    void printGivenLevel(Node5 node, int level, boolean ltr)
    {
        if (node == null)
            return;
        if (level == 1)
            System.out.print(node.data + " ");
        else if (level > 1) {
            if (ltr != false) {
                printGivenLevel(node.left, level - 1, ltr);
                printGivenLevel(node.right, level - 1, ltr);
            }
            else {
                printGivenLevel(node.right, level - 1, ltr);
                printGivenLevel(node.left, level - 1, ltr);
            }
        }
    }
    /* Driver program to test the above functions */
    public static void main(String[] args)
    {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node5(1);
        tree.root.left = new Node5(2);
        tree.root.right = new Node5(3);
        tree.root.left.left = new Node5(7);
        tree.root.left.right = new Node5(6);
        tree.root.right.left = new Node5(5);
        tree.root.right.right = new Node5(4);
        System.out.println("Spiral order traversal of Binary Tree is ");
        tree.printSpiral(tree.root);
    }
}

// This code has been contributed by Mayank Jaiswal(mayank_24)
