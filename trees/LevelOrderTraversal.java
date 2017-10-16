import java.util.*;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;
    
    TreeNode() {
    }

    TreeNode(int data) {
        this.data = data;
    }

    TreeNode(int data, TreeNode left, TreeNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}   

public class LevelOrderTraversal{

public static void main(String [] args){

}

public ArrayList<Integer> levelorder(TreeNode root) {
    Queue <TreeNode> q = new LinkedList<TreeNode>();
    ArrayList<Integer> list = new ArrayList<Integer>();
    
    if (root==null){
       return list; 
    }
    q.add(root);
    while(!q.isEmpty()){
        root = q.remove();
        list.add(root.data);
        if (root.left!=null){
            q.add(root.left);
        }
        if (root.right!=null){
            q.add(root.right);
        }
    }
    return list;

}

}


