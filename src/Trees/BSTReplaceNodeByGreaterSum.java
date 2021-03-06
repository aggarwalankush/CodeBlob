package Trees;

//@formatter:off
/**
 * Given a BST, replace each node with sum of all nodes greater than that.
 *
 *      10
 *     /  \
 *    7   13
 *   / \  / \
 *  3  9 11 16
 *
 */
//@formatter:on

public class BSTReplaceNodeByGreaterSum {
    public static void main(String[] args) {
        TreeNode root = TreeUtils.createBST(3, 7, 9, 10, 11, 13, 16);
        replaceBST(root);
        System.out.println(BTtoLinkedList.generateLists(root));
    }


    public static void replaceBST(TreeNode root) {
        replaceBST(root, 0);
    }

    public static int replaceBST(TreeNode node, int sum) {
        if (node == null)
            return sum;
        sum = replaceBST(node.right, sum);
        sum += node.data;
        node.data = sum;
        replaceBST(node.left, sum);
        return sum;
    }

}

