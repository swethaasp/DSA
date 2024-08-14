
// Hashtable class Parameters

// K: It is the type of keys maintained by this map.
// V: It is the type of mapped values.


import java.util.*;  
class Hashtable1{  
 public static void main(String args[]){  
  Hashtable<Integer,String> hm=new Hashtable<Integer,String>();  
  
  hm.put(100,"Amit");  
  hm.put(102,"Ravi");  
  hm.put(101,"Vijay");  
  hm.put(103,"Rahul");  
  
  for(Map.Entry m:hm.entrySet()){  
   System.out.println(m.getKey()+" "+m.getValue());  
  }

   /*03 Rahul
102 Ravi
101 Vijay
100 Amit*/


   //remove element
    map.remove(102);  
   System.out.println("After remove: "+ map);  


     //Here, we specify the if and else statement as arguments of the method  
     System.out.println(map.getOrDefault(101, "Not Found"));  //vijay
     System.out.println(map.getOrDefault(105, "Not Found"));  //not found


   //Inserts, as the specified pair is unique  
     map.putIfAbsent(104,"Gaurav");  
     System.out.println("Updated Map: "+map);  
     //Returns the current value, as the specified pair already exist  
     map.putIfAbsent(101,"Vijay");  
     System.out.println("Updated Map: "+map);  

   /*Initial Map: {103=Rahul, 102=Ravi, 101=Vijay, 100=Amit}
Updated Map: {104=Gaurav, 103=Rahul, 102=Ravi, 101=Vijay, 100=Amit}
Updated Map: {104=Gaurav, 103=Rahul, 102=Ravi, 101=Vijay, 100=Amit}*/

   
 }  
}  



