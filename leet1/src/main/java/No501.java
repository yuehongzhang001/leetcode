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
import java.util.Map.Entry;
public class No501 {
    public int[] findMode(TreeNode root) {
        HashMap<Integer,Integer> map = new HashMap();
        ArrayList<Integer> list = new ArrayList();
        getNum(root, map);
        int max = 0;
        for(Integer count:map.values()){
            max = Math.max(max, count);
        }
        for(Entry<Integer,Integer> e:map.entrySet()){
            if(e.getValue()==max)
                list.add(e.getKey());
        }
        int[] res = new int[list.size()];
        for(int i=0;i<res.length;i++){
            res[i]=list.get(i);
        }
        return res;
    }
    public void getNum(TreeNode root,HashMap<Integer,Integer> map){
        if(root==null) return;
        int count = map.getOrDefault(root.val, 0);
        map.put(root.val, count+1);
        getNum(root.left,map);
        getNum(root.right,map);
    }
    
    public int[] findMode1(TreeNode root){
        
    }
    
}
