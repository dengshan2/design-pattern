package designPattern.Composite;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by root on 10/13/15.
 */
public class TreeNode {
    private String name;
    private TreeNode parent;
    private Vector<TreeNode> children = new Vector<TreeNode>();

    public TreeNode(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TreeNode getParent() {
        return parent;
    }

    public void setParent(TreeNode parent) {
        this.parent = parent;
    }

    public void add(TreeNode t) {
        children.add(t);
    }

    public void remove(TreeNode t) {
        children.remove(t);
    }

    public Enumeration<TreeNode> getChildren() {
        return children.elements();
    }
}
