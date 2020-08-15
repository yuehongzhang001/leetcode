/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
import java.util.*;

public class S32 {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList();
        if (root == null) {
            return ans;
        }
        Deque<TreeNode> queue = new LinkedList();

        queue.add(root);

        while (!queue.isEmpty()) {
            List<Integer> line = new ArrayList();
            ans.add(line);
            int size=queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.pollFirst();
                line.add(node.val);
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
        }
        return ans;
    }
}
