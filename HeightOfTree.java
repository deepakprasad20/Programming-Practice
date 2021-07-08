class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
public class HeightOfTree {
    public static void main(String[] args){
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(12);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(8);
        root.right.left = new TreeNode(11);
        root.right.right = new TreeNode(15);
        root.left.left.left = new TreeNode(1);

        System.out.println("Height of given tree is : " + findHeight(root));
    }

    private static int findHeight(TreeNode root) {
        if(root == null){
            return 0;
        }
        int leftHeight = findHeight(root.left);
        int rightHeight = findHeight(root.right);
        return 1 + Math.max(leftHeight,rightHeight);
    }
}
