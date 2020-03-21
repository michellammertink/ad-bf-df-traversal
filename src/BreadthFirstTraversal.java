import java.util.*;

public class BreadthFirstTraversal {

    public void run(){
        Map<Integer, List<Integer>> adjacencyList = new HashMap();
        init(adjacencyList);
        breadthfirst(adjacencyList);
    }

    private void init(Map<Integer, List<Integer>> adjacencyList) {
        adjacencyList.put(1, Arrays.asList(2,3));
        adjacencyList.put(2, Arrays.asList(1,3,4));
        adjacencyList.put(3, Arrays.asList(1,2,4,5));
        adjacencyList.put(4, Arrays.asList(2,3));
        adjacencyList.put(5, Arrays.asList(3));
    }

    private void breadthfirst(Map<Integer, List<Integer>> adjacencyList) {
        Set<Integer> visited = new HashSet();
        Queue<Integer> queue = new LinkedList();
        queue.add(1);
        while(!queue.isEmpty()){
            Integer next = queue.remove();
            if(!visited.contains(next)){
                process(next);
                visited.add(next);
                for(Integer neighbour : adjacencyList.get(next)){
                    if(!visited.contains(neighbour)){
                        queue.add(neighbour);
                    }
                }
            }
        }
    }

    private void process(Integer next) {
        System.out.print(" "+next);
    }

}
