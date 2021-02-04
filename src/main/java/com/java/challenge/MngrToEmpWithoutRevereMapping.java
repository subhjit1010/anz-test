package com.java.challenge;

import java.util.HashMap;
import java.util.Map;

public class MngrToEmpWithoutRevereMapping {
    public static void main(String[] args) {
        HashMap<String,String> employee2manager = new HashMap<>();
        employee2manager.put("A","C");
        employee2manager.put("B","C");
        employee2manager.put("C","F");
        employee2manager.put("D","E");
        employee2manager.put("E","F");
        employee2manager.put("F","F");
        HashMap<String,Integer> result = new HashMap<>();
        for(Map.Entry<String,String> entry : employee2manager.entrySet())
        {
            String emp = entry.getKey();
            String mngr = entry.getValue();
            //Firstly, storing frequency Manager
            result.put(mngr,result.getOrDefault(mngr,0)+1);
            //Next incrementing frequency if Emp is also a manager
            if(employee2manager.containsValue(emp) && !mngr.equals(emp))
                result.put(mngr,result.getOrDefault(mngr,0)+1);
        }
        for(Map.Entry<String,String> entry : employee2manager.entrySet())
        {
            String emp = entry.getKey();
            if(result.containsKey(emp))
                System.out.println(emp+"->"+result.get(emp));
            else
                System.out.println(emp+"->"+0);
        }
    }
}
