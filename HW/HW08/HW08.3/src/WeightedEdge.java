/**
 * Project Name : JavaProgramming and Application HW08.3
 * Program's purpose and basic function :
 * - class WeightedEdge
 * Program First Author : JH KIM
 * Date of First Write : 2023.11.06
 * =======================================================================================================
 * Source Code Modification History
 * =======================================================================================================
 * Author				Date				Ver				Modification details
 * JH KIM				2023.11.06			v1.00			First Write
 */
public class WeightedEdge {
    // data member
    Vertex src;
    Vertex dest;
    int weight;
    //creating a constructor of the class Edge
    WeightedEdge(Vertex src, Vertex dest, int weight) {
        this.src = src;
        this.dest = dest;
        this.weight = weight;
    }
    @Override
    public String toString() {
        return (this.src + "->" + this.dest);
    }

    // accessor
    int getSrcVID( ) {
        return this.src.vid;
    }
    int getDestVID() {
        return this.dest.vid;
    }
    Vertex getDest() {
        return this.dest;
    }
    int getWeight() {
        return this.weight;
    }
}