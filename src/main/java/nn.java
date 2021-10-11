import java.util.*;

class Graph<T> {

    // We use Hashmap to store the edges in the graph
    private Map<T, List<T> > map = new HashMap<>();

    // This function adds a new vertex to the graph
    public void addVertex(T s)
    {
        map.put(s, new LinkedList<T>());
    }

    // This function adds the edge
    // between source to destination
    public class Component{
        private int source, destination, ID;
        boolean bidirectional = true;
    }
    private class Resistor extends Component{
        private double resistance;
    }
    private class VoltageSource extends Component{
        private double voltage;
    }
    private class VariableResistor extends Resistor{
        private int maxResistance, minResistance;
    }
    public void addComponent(T source,
                        T destination,
                        boolean bidirectional)
    {

        if (!map.containsKey(source))
            addVertex(source);

        if (!map.containsKey(destination))
            addVertex(destination);

        map.get(source).add(destination);
        if (bidirectional == true) {
            map.get(destination).add(source);
        }

    }


    // This function gives the count of vertices
    public void getVertexCount()
    {
        System.out.println("The graph has "
                + map.keySet().size()
                + " vertex");
    }

    // This function gives the count of edges
    public void getEdgesCount(boolean bidirection)
    {
        int count = 0;
        for (T v : map.keySet()) {
            count += map.get(v).size();
        }
        if (bidirection == true) {
            count = count / 2;
        }
        System.out.println("The graph has "
                + count
                + " edges.");
    }

    public void hasVertex(T s)
    {
        if (map.containsKey(s)) {
            System.out.println("The graph contains "
                    + s + " as a vertex.");
        }
        else {
            System.out.println("The graph does not contain "
                    + s + " as a vertex.");
        }
    }

    // This function gives whether an edge is present or not.
    public void hasEdge(T s, T d)
    {
        if (map.get(s).contains(d)) {
            System.out.println("The graph has an edge between "
                    + s + " and " + d + ".");
        }
        else {
            System.out.println("The graph has no edge between "
                    + s + " and " + d + ".");
        }
    }

    // Prints the adjancency list of each vertex.
    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();

        for (T v : map.keySet()) {
            builder.append(v.toString() + ": ");
            for (T w : map.get(v)) {
                builder.append(w.toString() + " ");
            }
            builder.append("\n");
        }

        return (builder.toString());
    }
}

// Driver Code
public class nn {

    public static void main(String args[])
    {

        // Object of graph is created.
        Graph<Integer> g = new Graph<Integer>();

        // edges are added.
        // Since the graph is bidirectional,
        // so boolean bidirectional is passed as true.
        int edgeCount;
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter number of components");
        edgeCount = scanner.nextInt();

        for (int i = 0; i < edgeCount; i++){
            GUI gui = new GUI(g);
            gui.setVisible(true);
            gui.setSize(300, 150);
            gui.setTitle("Component Input");
        }
        boolean enter = false;
        while (enter == false) {
            Scanner s = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Enter true to enter graph");
            enter = s.nextBoolean();

        }


        // print the graph.
        System.out.println("Graph:\n"
                + g.toString());

        // gives the no of vertices in the graph.
        g.getVertexCount();

        // gives the no of edges in the graph.
        g.getEdgesCount(true);

        // tells whether the edge is present or not.
        g.hasEdge(3, 4);

        // tells whether vertex is present or not
        g.hasVertex(5);
    }
}