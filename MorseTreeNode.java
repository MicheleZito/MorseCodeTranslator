package morsetranslator;


public class MorseTreeNode
{
    private MorseTreeNode parentNode;
    private MorseTreeNode leftChild;
    private MorseTreeNode rightChild;
    
    private String info;
    
    public MorseTreeNode()
    {
        this.setInfo("");
        this.setParentNode(null);
        this.setLeftChild(null);
        this.setRightChild(null);
    }
    
    public MorseTreeNode(MorseTreeNode parent)
    {
        this.setInfo("");
        this.setParentNode(parent);
        this.setLeftChild(null);
        this.setRightChild(null);
    }
    
    public MorseTreeNode(MorseTreeNode parent, String infoo)
    {
        this.setInfo(infoo);
        this.setParentNode(parent);
        this.setLeftChild(null);
        this.setRightChild(null);
    }
    
    public String getInfo()
    {
        return this.info;
    }
    
    public void setInfo(String inf)
    {
        this.info = inf;
    }
    
    public MorseTreeNode getLeftChild()
    {
        return this.leftChild;
    }
    
    public void setLeftChild(MorseTreeNode left)
    {
        this.leftChild = left;
    }
    
    public MorseTreeNode getRightChild()
    {
        return this.rightChild;
    }
    
    public void setRightChild(MorseTreeNode right)
    {
        this.rightChild = right;
    }
    
    public MorseTreeNode getParentNode()
    {
        return this.parentNode;
    }
    
    public void setParentNode(MorseTreeNode parent)
    {
        this.parentNode = parent;
    }
    
    public Boolean isLeaf()
    {
        if(this.getLeftChild() == null && this.getRightChild() == null)
            return true;
        else
            return false;
    }
    
}
