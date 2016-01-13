package isSameTree;
public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        boolean result=false;
        if((p==null)&&(q==null))
        result=true;
        else if (((p==null)&&(q!=null))||((p!=null)&&(q==null)))
        result=false;
        else if(p.val!=q.val)
        result=false;
        else if(p.val==q.val)
        result=((isSameTree(p.left,q.left))&&(isSameTree(p.right,q.right)));
        return result;
    }
}
