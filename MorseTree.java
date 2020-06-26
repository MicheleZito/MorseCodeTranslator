
package morsetranslator;


public class MorseTree
{
    private MorseTreeNode root;
    
    public MorseTree()
    {
        this.root = new MorseTreeNode();
        this.root.setInfo("Root");
        
        this.buildMorseTree();
    }
    
    
    // For the morse code, I used the '.' as left and '-' as right
    // Basic Morse alphabet with only letters and numbers represented.
    private void buildMorseTree()
    {
        this.root.setLeftChild(new MorseTreeNode(this.root,"E"));
        this.root.setRightChild(new MorseTreeNode(this.root,"T"));
        
        MorseTreeNode l,r;
        MorseTreeNode l1,r1;
        MorseTreeNode l2,r2;
        
        l = root.getLeftChild();
        r = root.getRightChild();
        l1 = l;
        r1 = r;
        l.setLeftChild(new MorseTreeNode(l1,"I"));
        l.setRightChild(new MorseTreeNode(l1,"A"));
        r.setLeftChild(new MorseTreeNode(r1,"N"));
        r.setRightChild(new MorseTreeNode(r1,"M"));
        
        l = l1.getLeftChild();
        r = l1.getRightChild();
        l2 = l;
        r2 = r;
        l.setLeftChild(new MorseTreeNode(l2,"S"));
        l.setRightChild(new MorseTreeNode(l2,"U"));
        r.setLeftChild(new MorseTreeNode(r2,"R"));
        r.setRightChild(new MorseTreeNode(r2,"W"));
        
        l = r1.getLeftChild();
        r = r1.getRightChild();
        l.setLeftChild(new MorseTreeNode(l,"D"));
        l.setRightChild(new MorseTreeNode(l,"K"));
        r.setLeftChild(new MorseTreeNode(r,"G"));
        r.setRightChild(new MorseTreeNode(r,"O"));
        
        MorseTreeNode l3, r3, l4, r4;
        
        r1 = r2;
        l1 = l2;
        l2 = l1.getLeftChild();
        r2 = l1.getRightChild();
        l2.setLeftChild(new MorseTreeNode(l2,"H"));
        l2.setRightChild(new MorseTreeNode(l2,"V"));
        r2.setLeftChild(new MorseTreeNode(r2,"F"));
        r2.setRightChild(new MorseTreeNode(r2,"void"));
        
        l3 = l2.getLeftChild();
        r3 = l2.getRightChild();
        //l4 = r2.getLeftChild(); no childs
        r4 = r2.getRightChild();
        
        l2 = r1.getLeftChild();
        r2 = r1.getRightChild();
        l2.setLeftChild(new MorseTreeNode(l2,"L"));
        //no right child
        r2.setLeftChild(new MorseTreeNode(r2,"P"));
        r2.setRightChild(new MorseTreeNode(r2,"J"));
        
        //l1 = r2.getLeftChild(); no childs
        r1 = r2.getRightChild();
        
        l2 = l.getLeftChild();
        r2 = l.getRightChild();
        l2.setLeftChild(new MorseTreeNode(l2,"B"));
        l2.setRightChild(new MorseTreeNode(l2,"X")); // no more childs
        r2.setLeftChild(new MorseTreeNode(r2,"C")); //no more childs
        r2.setRightChild(new MorseTreeNode(r2,"Y")); // no more childs
        
        l4 = l2.getLeftChild();
        
        l2 = r.getLeftChild();
        r2 = r.getRightChild();
        l2.setLeftChild(new MorseTreeNode(l2,"Z")); // only left child left
        l2.setRightChild(new MorseTreeNode(l2,"Q")); // no more childs
        r2.setLeftChild(new MorseTreeNode(r2,"void")); //only left child left
        r2.setRightChild(new MorseTreeNode(r2,"void"));  // two childs left
        
        l1 = l2.getLeftChild();
        l = r2.getLeftChild();
        r = r2.getRightChild();
        
        l3.setLeftChild(new MorseTreeNode(l3,"5"));
        l3.setRightChild(new MorseTreeNode(l3,"4"));
        
        r3.setRightChild(new MorseTreeNode(r3,"3"));
        
        r4.setRightChild(new MorseTreeNode(r4,"2"));
        
        r1.setRightChild(new MorseTreeNode(r1,"1"));
        
        l4.setLeftChild(new MorseTreeNode(l4,"6"));
        
        l1.setLeftChild(new MorseTreeNode(l1,"7"));
        
        l.setLeftChild(new MorseTreeNode(l,"8"));
        
        r.setLeftChild(new MorseTreeNode(r,"9"));
        r.setRightChild(new MorseTreeNode(r,"0")); 
    }
    
    public String search(String character)
    {
        MorseCharacterParser parse = new MorseCharacterParser(character);
        
        MorseTreeNode temp = this.root;
        while(!parse.isEnd() && !temp.isLeaf())
        {
            char chr = parse.getCurrentMorseElement();
            if( chr == '.')
            {
                temp = temp.getLeftChild();
                if(temp == null)
                    return "void";
            }
            else if(chr == '-')
            {
                temp = temp.getRightChild();
                if(temp == null)
                    return "void";
            }
        }
        
        return temp.getInfo();
    }
}
