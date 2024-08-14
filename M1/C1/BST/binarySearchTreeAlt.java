
//serch a node in BST
/* Input:         2
                \
                 81 
               /    \ 
             42      87 
              \       \ 
               66      90 
              / 
            45
X = 87
Output: 1
Explanation: As 87 is present in the
given nodes , so the output will be
1.  */

class BST {
    boolean search(Node root, int x) {
        // Your code here
        if(root==null){
          return false;  
        } 
        if(root.data==x) return true;
        else if(root.data<x) return search(root.right,x);
        else if(root.data>x) return search(root.left,x);
        else  return false;
    }
}

//ceil in BST
class Tree {
    
    //lesser than root
    // ceil= smallest number that is greater than or equal to x
    int findCeil(Node root, int key) {
        if (root == null) return -1;
        // Code here
        int ceil=-1;
        while(root!=null){
            if(root.data==key){
                ceil=root.data;
                return ceil;
            }
            
            else if(key>root.data){
                root=root.right;
            }
            
            else{
                ceil=root.data;
                root=root.left;
            }
            
        }
        return ceil;
    }
}

//find floor


class Tree {
 
    // ceil= largest number that is smaller than or equal to x
    int findFloor(Node root, int key) {
        if (root == null) return -1;
        // Code here
        int floor=-1;
        while(root!=null){
            if(root.data==key){
                floor=root.data;
                return floor;
            }
            
            else if(key>root.data){
               floor=root.data;
                root=root.right;
             }
            
            else{
                root=root.left;
            }
            
        }
        return floor;
    }
}


//Insert a node in BST
