import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

class TreeNode{
    int data;
    List<TreeNode> children = new ArrayList<>();
    TreeNode right;
    TreeNode(int data){
        this.data = data;
    }
}

public class ValidBST {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of tree nodes of BST.");
        int n = sc.nextInt();

        TreeNode root = takeinputlevelwise();
        printTreeLevelWise(root);
        sc.close();
    }

    public static void printTreeLevelWise(TreeNode root){
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode temp = q.poll();
            for(int i=0;i<temp.children.size();i++){
                q.offer(temp.children.get(i));
            }
            System.out.print(temp.data+" ");
        }
    }

    public static TreeNode takeinputlevelwise(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the root node data :");
        int rootData = in.nextInt();
        TreeNode root = new TreeNode(rootData);
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){
            TreeNode temp = q.poll();
            System.out.println("Number of childern of "+temp.data);
            int num = in.nextInt();
            for(int i=1;i<=num;i++){
                int childData = in.nextInt();
                TreeNode node = new TreeNode(childData);
                temp.children.add(node);
                q.offer(node);
            }
        }
        return root;
    }
}
