/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
import java.util.*;
class Solution {
    public TreeNode invertTree(TreeNode root) 
    {
        Queue<TreeNode> q = new LinkedList<>();     //queue to store noes levelwise
        
        
        q.add(root);
        while(q.isEmpty()==false)
        {
            int cnt=q.size();
            
            while(cnt>0)
            {
                cnt--;
                TreeNode temp=q.remove();
                
                if(temp!=null)
                {
                    if(temp.right!=null)
                    {
                        
                        q.add(temp.right);
                    }

                    if(temp.left!=null)
                    {

                        q.add(temp.left);
                    }

                        

                    TreeNode temp1 = temp.left;     //swap the left-child and right-child of node
                    temp.left=temp.right;
                    temp.right=temp1;
                }
                
                  
            }
            
        }
        return root;
    }
}
