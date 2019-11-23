package BinaryTree;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public abstract class BinaryTree<T> {
    static class Node<T> {
        T data;
        Node left;
        Node right;
        int leftType;
        int rightType;
        Node pre = null; // 用于存储临时节点
        Node(){data = null;}
        Node(T data) {
            this.data = data;
        }
        public void setLeft(Node left) {
            this.left = left;
        }

        public void setRight(Node right) {
            this.right=right;
        }
    }
    private Node<T> root;
    protected int size = 0;

    public BinaryTree(Node<T> root) {
        this.root = root;
    }

    public void preOrderTraverse() {
        System.out.println("前序遍历: ");
        preOrderTraverse(this.root);
        System.out.println();
    }

    public void preOrderTraverse(Node<T> root) {
        if(root == null) {
            return;
        }
        visit(root);
        preOrderTraverse((Node<T>) root.left);
        preOrderTraverse((Node<T>) root.right);
    }

    public void inOrderTraverse() {
        System.out.println("中序遍历: ");
        inOrderTraverse(this.root);
        System.out.println();
    }

    public void inOrderTraverse(Node<T> root) {
        if(root == null) {
            return;
        }
        inOrderTraverse((Node<T>) root.left);
        visit(root);
        inOrderTraverse((Node<T>) root.right);
    }

    public void postOrderTraverse() {
        System.out.println("后序遍历: ");
        postOrderTraverse(this.root);
        System.out.println();
    }

    public void postOrderTraverse(Node<T> root) {
        if(root == null) {
            return;
        }
        postOrderTraverse((Node<T>) root.left);
        postOrderTraverse((Node<T>) root.right);
        visit(root);
    }

    public void levelTraverse() {
        System.out.println("层次遍历: ");
        Queue<Node<T>> q = new LinkedBlockingQueue<Node<T>>();
        q.add(root);
        Node<T> node = new Node<T>();
        while(q.isEmpty() != true) {
            node = q.poll();
            visit(node);
            if(node.left != null) {
                q.add((Node<T>) node.left);
            }
            if(node.right != null) {
                q.add((Node<T>) node.right);
            }
        }
        System.out.println();
    }

    public Node<T> getParent(Node<T> node){
        return (node == null || node == this.root) ?
                null : getParent(this.root, node);
    }

    public Node<T> getParent(Node<T> root, Node<T> node){
        if(root == null || node == null || root == node || node == this.root) {
            return null;
        }
        if(root.left == node || root.right == node) {
            return root;
        }
        if(getParent((Node<T>) root.left, node) != null) {
            return getParent((Node<T>) root.left, node);
        }
        return getParent((Node<T>) root.right, node);
    }

    public void delete(Node<T> node) {
        Node<T> parent = getParent(node);
        if(parent.left == node) {
            parent.left = null;
        }
        if(parent.right == node) {
            parent.right = null;
        }
    }

    public void getHeight() {
        System.out.print("树的高度: ");
        System.out.println(getHeight(this.root));
    }

    public int getHeight(Node<T> root) {
        if(root == null) {
            return 0;
        }
        int l = getHeight((Node<T>) root.left);
        int r = getHeight((Node<T>) root.right);
        return l > r ? l + 1 : r + 1;
    }

    public void getSize() {
        this.size = 0;
        System.out.print("树的结点个数: ");
        getSize(this.root);
        System.out.println(this.size);
    }

    public void getSize(Node<T> root) {
        if(root == null) {
            return;
        }
        size++;
        getSize((Node<T>) root.left);
        getSize((Node<T>) root.right);
    }

    public void deleteBinaryTree() {
        this.root = null;
    }

    public boolean isEmpty() {
        return this.root == null;
    }

    public abstract void visit(Node<T> node);

}

