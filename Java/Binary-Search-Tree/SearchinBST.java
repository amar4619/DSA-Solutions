
//Leetcode problem : https://leetcode.com/problems/search-in-a-binary-search-tree/description/

import javax.swing.tree.TreeNode;

class SearchinBST {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null)return null;
        while(root != null){
            if(root.val == val ){
                return root;
            }
            root = (root.val > val) ? root.left : root.right ;
        }
        return null;
    }
}

// Notes

//Use ternary operator ex : Object obj = condition : exp1 : exp2