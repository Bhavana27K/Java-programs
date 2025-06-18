class tree {
    int value;
    tree left;
    tree right;

    public tree(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

class Binarytree {
    tree root;
    public void inorder(tree node){
        if (node == null) {
            return;
        }
        inorder(node.left);
        System.out.print(node.value + " ");
        inorder(node.right);
    }

    public void preorder(tree node) {
        if (node == null) {
            return;
        }
        System.out.print(node.value + " ");
        preorder(node.left);
        preorder(node.right);
    }

    public void postorder(tree node) {
        if (node == null) {
            return;
        }
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.value + " ");
    }

    public static void main(String[] args) {
        tree root = new tree(1);
        root.left = new tree(2);
        root.right = new tree(3);
        root.left.left = new tree(4);
        root.left.right = new tree(5);

        Binarytree bt = new Binarytree();

        System.out.println("Inorder traversal:");
        bt.inorder(root);
        System.out.println("\nPreorder traversal:");
        bt.preorder(root);
        System.out.println("\nPostorder traversal:");
        bt.postorder(root);
    }
}