public class Main {

    public static void main(String[] args) {

        /* The traversal implementations internally use a List in
         * order to be able to be able to predict the outcome of the algorithm.
         * Normally it is more appropriate to use a Set instead of a
         * List to store the neighbours of a node.
         */

        BreadthFirstTraversal bft = new BreadthFirstTraversal();
        DepthFirstTraversal dft = new DepthFirstTraversal();

        System.out.println("Breadth First Traversal:");
        bft.run();
        System.out.println(System.lineSeparator() + "Depth First Traversal:");
        dft.run();
    }
}
