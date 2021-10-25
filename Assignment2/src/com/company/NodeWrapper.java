package com.company;


import java.time.temporal.Temporal;

public class NodeWrapper {
    private TreeNode.Label label;
    private TreeNode node;
    private TreeNode parent;
    private String value;

    public NodeWrapper(TreeNode parent, TreeNode.Label label, String value) {
        this.parent = parent;
        this.label = label;
        this.value = value;
    }

    public TreeNode getNode() {
        return this.node;
    }

    public void setNode(TreeNode node) {
        this.node = node;
    }

    public TreeNode createNode(Token token) {
        this.node = new TreeNode(this.label, token, this.parent);
        this.parent.addChild(this.node);
        return this.node;
    }
}