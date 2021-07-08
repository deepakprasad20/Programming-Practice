import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QueueImplementation {

    public static void main(String[] args){
        TreeNode1 root = new TreeNode1(3);
        root.left = new TreeNode1(9);
        root.right = new TreeNode1(20);
        root.right.left = new TreeNode1(15);
        root.right.right = new TreeNode1(7);
        root.right.right.left = new TreeNode1(4);

        List<List<Integer>> levelOrderTraversalList = levelOrder(root);
        System.out.println(levelOrderTraversalList.toString());
    }

    public static List<List<Integer>> levelOrder(TreeNode1 root) {
        List<List<Integer>> levelOrderTraversalList = new ArrayList<>();
        if(root == null){
            return levelOrderTraversalList;
        }
        int h = height(root);
        System.out.println("Height = " + h);
        int i;
        for (i=1; i<=h; i++) {
            List<Integer> levelOrderList = new ArrayList<>();
            levelOrderTraversalList.add(printCurrentLevel(root, i,levelOrderList));
        }
        return levelOrderTraversalList;
    }

    private static List<Integer> printCurrentLevel(TreeNode1 root, int level, List<Integer> levelOrderTraversalList) {
        if (root == null) {
            return levelOrderTraversalList;
        }
        if (level == 1){
            levelOrderTraversalList.add(root.val);
        }
        else if (level > 1)
        {
             printCurrentLevel(root.left, level-1 , levelOrderTraversalList);
             printCurrentLevel(root.right, level-1,levelOrderTraversalList);
        }
        return levelOrderTraversalList;
    }

    public static int height(TreeNode1 root) {
        if (root == null)
            return 0;
        else {
            int lheight = height(root.left);
            int rheight = height(root.right);
            return lheight > rheight ? lheight + 1 : rheight + 1;
        }
    }
}

class TreeNode1 {
    int val;
    TreeNode1 left;
    TreeNode1 right;

    TreeNode1() {
    }

    TreeNode1(int val) {
        this.val = val;
    }
}
