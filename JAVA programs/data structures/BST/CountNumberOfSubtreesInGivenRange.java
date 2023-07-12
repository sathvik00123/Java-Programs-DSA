import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
class CountNumberOfSubtreesInGivenRange {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of nodes : ");
        int numOfNodes = sc.nextInt();
        int newData = sc.nextInt();
        TreeNode root = new TreeNode(newData);

        for(int i=1;i<numOfNodes;i++){       ///   10 2 5 18 1 20 13
            newData = sc.nextInt();
            constructBST(root,newData);
        }
        // printBST(root);
        // printLevelWise(root);
        System.out.println("Enter the range : ");
        int startRange = sc.nextInt();
        int endRange = sc.nextInt();
        int countTreesLeft = countSubtreesInRange(root.left,startRange,endRange);
        count = 0;
        int countTreesRight = countSubtreesInRange(root.right,startRange,endRange);
        System.out.print("Number of subtrees in the given range : "+(countTreesLeft + countTreesRight));
        sc.close();
    }
    static int count = 0;
    public static int countSubtreesInRange(TreeNode root,int start,int end){
        if(root == null) return count;
        countSubtreesInRange(root.left, start, end);
        countSubtreesInRange(root.right, start, end);
        if(root.data > start && root.data < end){
            count++;
        }
        return count;
    }

    public static void printLevelWise(TreeNode root){
        if(root == null){
            return;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        
        while(!q.isEmpty()){
            TreeNode temp = q.poll();
            if(temp.left != null){
                q.offer(temp.left);
            }
            if(temp.right != null){
                q.offer(temp.right);
            }
            System.out.print(temp.data + " ");
        }
    }
    
    public static TreeNode constructBST(TreeNode root,int val){
        if(root == null){
            TreeNode node = new TreeNode(val);
            return node;
        }
        if(root.data > val){
            root.left = constructBST(root.left,val);
        }else{
            root.right = constructBST(root.right,val);
        }
        return root;
    }

    public static void printBST(TreeNode root){
        if(root == null) return;
        printBST(root.left);
        System.out.print(root.data + " ");
        printBST(root.right);
    }
}
