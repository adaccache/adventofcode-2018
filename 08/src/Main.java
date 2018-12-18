import data.FileReader;

import java.util.*;


public class Main {

    class TreeNode {
        public TreeNode[] children;
        public int[] metadata;

        public TreeNode(int numChildren, int numMetadata) {
            this.children = new TreeNode[numChildren];
            this.metadata = new int[numMetadata];
        }

    }
    public static void main(String[] args) {
        new Main().solve();
    }

    public void solve() {
        FileReader fr = new FileReader();

        List<Integer> dataSet = fr.getData();

        TreeNode root = buildNode(dataSet.iterator());
        int sum = sumMetadata(dataSet.iterator());
        System.out.println(sum);

    }


    public TreeNode buildNode(Iterator<Integer> dataSet) {
        TreeNode node = new TreeNode(dataSet.next(), dataSet.next());

        // Read/populate all child nodes
        for(int i = 0; i < node.children.length; i++){
            node.children[i] = buildNode(dataSet);
        }

        // Read/Populate metadata
        for(int j = 0 ; j < node.metadata.length; j++){
            node.metadata[j] = dataSet.next();
        }
        // return node
        return node;

    }

    public int sumMetadata(Iterator<Integer> dataSet) {
        TreeNode node = new TreeNode(dataSet.next(), dataSet.next());
        int sum = 0;
        // Read/populate all child nodes
        for(int i = 0; i < node.children.length; i++){
            sum += sumMetadata(dataSet);
        }

        // Read/Populate metadata
        for(int j = 0 ; j < node.metadata.length; j++){
            sum += dataSet.next();
        }
        // return node
        return sum;

    }

}