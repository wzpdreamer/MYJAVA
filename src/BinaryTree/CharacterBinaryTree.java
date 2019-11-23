package BinaryTree;

public class CharacterBinaryTree extends BinaryTree<Character> {

    public CharacterBinaryTree(Node<Character> root) {
        super(root);
    }

    @Override
    public void visit(Node<Character> node) {
        System.out.print(node.data);
    }

    public static void main(String[] args) {
        Node<Character> nodeA = new Node<Character>('A');
        Node<Character> nodeB = new Node<Character>('B');
        Node<Character> nodeC = new Node<Character>('C');
        Node<Character> nodeD = new Node<Character>('D');
        Node<Character> nodeE = new Node<Character>('E');
        Node<Character> nodeF = new Node<Character>('F');
        Node<Character> nodeG = new Node<Character>('G');
        Node<Character> nodeH = new Node<Character>('H');
        Node<Character> nodeI = new Node<Character>('I');
        nodeA.setLeft(nodeB);
        nodeA.setRight(nodeG);
        nodeB.setLeft(nodeC);
        nodeB.setRight(nodeD);
        nodeD.setLeft(nodeE);
        nodeD.setRight(nodeF);
        nodeG.setLeft(nodeH);
        nodeH.setRight(nodeI);

        CharacterBinaryTree test = new CharacterBinaryTree(nodeA);
        test.preOrderTraverse();

        System.out.println("================");

        test.inOrderTraverse();

        System.out.println("================");

        test.postOrderTraverse();

        System.out.println("================");

        test.levelTraverse();

        System.out.println("================");

        test.getSize();
        test.getHeight();

        System.out.println("================");

        test.visit(test.getParent(nodeE));//得到E的父结点
        System.out.println();
        test.visit(test.getParent(nodeI));//得到I的父结点
        System.out.println();
        System.out.println("================");

        test.delete(nodeD);//删除D结点
        test.inOrderTraverse();
        test.getSize();
        test.getHeight();
        System.out.println("================");


        test.delete(nodeI);//删除I结点
        test.inOrderTraverse();
        test.getSize();
        test.getHeight();
        System.out.println("================");
    }

}
