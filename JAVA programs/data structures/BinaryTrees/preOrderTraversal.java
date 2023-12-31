import java.util.Stack;

public class preOrderTraversal {
    public static void main(String args[]){
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);

        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.left = node6;
        node3.right = node7;

        preorderTreePrint(node1);
        System.out.println();
        preorderTreePrintIterative(node1);
    }

    static void preorderTreePrint(TreeNode root){
        if(root == null){
            return;
        }
        System.out.println(root.val);
        if(root.left != null){
            preorderTreePrint(root.left);
        }
        if(root.right != null){
            preorderTreePrint(root.right);
        }
    }

    static void preorderTreePrintIterative(TreeNode root){
        Stack<TreeNode> s = new Stack<>();
        TreeNode temp = root;
        while(!s.empty() || temp != null){
            while(temp != null){
                System.out.println(temp.val);
                if(temp.right != null){
                    s.push(temp.right);
                }
                temp = temp.left;
            }
            if(!s.empty()){
                temp = s.peek();
                s.pop();
            }
        }
    }
}

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val){
        this.val = val;
        left = null;
        right = null;
    }
}
