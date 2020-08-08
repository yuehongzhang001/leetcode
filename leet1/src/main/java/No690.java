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
public class No690 {
    class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
    public int getImportance(List<Employee> employees, int id) {
        HashMap<Integer,Employee> map = new HashMap();
        for(Employee e:employees){
            map.put(e.id, e);
        }
        Deque<Integer> deque = new LinkedList();
        deque.add(id);
        int sum=0;
        while(!deque.isEmpty()){
            int l=deque.pollFirst();
            sum+=map.get(l).importance;
            for(int i:map.get(l).subordinates){
                deque.add(i);
            }
        }
        return sum;
        
    }
    HashMap<Integer,Employee> map = new HashMap();
    public int getImportance1(List<Employee> employees, int id){
        for(Employee e:employees)
            map.put(e.id, e);
        return dfs(id);
    }
    public int dfs(int eid){
        int sum=map.get(eid).importance;
        for(int i:map.get(eid).subordinates){
            sum+=dfs(i);
        }
        return sum;
    }
}
