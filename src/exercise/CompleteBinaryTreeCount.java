package exercise;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/**
 * @author lmy
 * @ClassName CompleteBinaryTreeCount
 * @date 2019/8/19
 **/
public class CompleteBinaryTreeCount {

      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }


    public int countNodes(TreeNode root) {
        return count(root,getTreeDeepth(root));
    }

    public int count(TreeNode root,int level){
          if(root==null){
              return 0;
          }

          int rightLevel=getTreeDeepth(root.right);
          if(rightLevel==level-1){
              return (int)Math.pow(2,level-1)+count(root.right,level-1);
          }else{
              return (int)Math.pow(2,level-2)+count(root.left,level-1);
          }

    }
    int getTreeDeepth(TreeNode node){
          int sum=0;
          while (node!=null){
              node=node.left;
              sum++;
          }
          return sum;
    }
}
