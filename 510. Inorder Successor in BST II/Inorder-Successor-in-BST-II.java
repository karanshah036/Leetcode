// Time Compleity O(H)
// Space Complexity O(1)
class Solution {
    public Node inorderSuccessor(Node node) {
        if(node.right!=null){
          node=node.right;
          while(node.left!=null) node=node.left;
          return node;
        }
        else{
          while(node.parent!=null && node==node.parent.right) node=node.parent;
          return node.parent;
        }
    }
}