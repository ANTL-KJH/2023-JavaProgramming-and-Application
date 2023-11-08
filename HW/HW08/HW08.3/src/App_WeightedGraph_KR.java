/**
 * Project Name : JavaProgramming and Application HW08.3
 * Program's purpose and basic function :
 * - App Weighted Graph Korea
 * Program First Author : JH KIM
 * Date of First Write : 2023.11.06
 * =======================================================================================================
 * Source Code Modification History
 * =======================================================================================================
 * Author				Date				Ver				Modification details
 * JH KIM				2023.11.06			v1.00			First Write
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class App_WeightedGraph_KR {

    public static void main(String[] args) throws FileNotFoundException {
        String fname = "KR_11_cities.txt";  // file name
        Scanner fin = new Scanner(new File("KR_11_cities.txt"));    // scanner
        WeightedGraph wgraph = new WeightedGraph("WeightedGraph - KR (11 Cities)"); // gen graph instance

        while(fin.hasNext())
        {
            // read file
            String src = fin.next();
            String dest = fin.next();
            int weight = fin.nextInt();
            if (wgraph.findVertex(src) == null) {
                wgraph.addVertex(src);
            }

            Vertex vrtx_src = wgraph.findVertex(src);
            if (wgraph.findVertex(dest) == null) {
                wgraph.addVertex(dest); // add vertex
            }

            Vertex vrtx_dest = wgraph.findVertex(dest); // find vertex
            wgraph.addWeightedEdge(vrtx_src, vrtx_dest, weight); // add edge
        }

        fin.close();
        wgraph.printWeightedGraph();    // print graph
        wgraph.initDistTable();
        wgraph.printDistTable();    // print distance table

        // start and end vertex
        Vertex vStart = wgraph.findVertex("GJ");
        Vertex vEnd = wgraph.findVertex("SC");

        // DFS
        System.out.printf("DepthFirstSearch (%s -> %s) : ", vStart.getName(), vEnd.getName());
        List<Vertex> path = wgraph.DepthFirstSearch(vStart, vEnd);
        printPath(path);

        System.out.printf("DepthFirstSearch (%s -> %s) : ", vEnd.getName(), vStart.getName());
        path = wgraph.DepthFirstSearch(vEnd, vStart);
        printPath(path);

        // BFS
        System.out.printf("BreadthFirstSearch (%s -> %s) : ", vStart.getName(), vEnd.getName());
        path = wgraph.BreadthFirstSearch(vStart, vEnd);
        printPath(path);

        System.out.printf("BreadthFirstSearch (%s -> %s) : ", vEnd.getName(), vStart.getName());
        path = wgraph.BreadthFirstSearch(vEnd, vStart);
        printPath(path);

        // Dijkstra
        System.out.printf("Dijkstra ShortestPathFirst (%s -> %s) : ", vStart.getName(), vEnd.getName());
        path = wgraph.DijkstraSortestPath(vStart, vEnd);
        printPath(path);

        System.out.printf("Dijkstra ShortestPathFirst (%s -> %s) : ", vEnd.getName(), vStart.getName());
        path = wgraph.DijkstraSortestPath(vEnd, vStart);
        printPath(path);
    }

    public static void printPath(List<Vertex> path) {
        for(int i = 0; i < path.size(); ++i) {
            Vertex v = (Vertex)path.get(i);
            System.out.printf("%s", v.getName());
            if (i != path.size() - 1) {
                System.out.print("->");
            }
        }

        System.out.println();
    }
}