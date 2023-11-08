/**
 * Project Name : JavaProgramming and Application HW08.3
 * Program's purpose and basic function :
 * - class Vertex
 * Program First Author : JH KIM
 * Date of First Write : 2023.11.06
 * =======================================================================================================
 * Source Code Modification History
 * =======================================================================================================
 * Author				Date				Ver				Modification details
 * JH KIM				2023.11.06			v1.00			First Write
 */
class Vertex {
    String vname; //vertex name
    int vid;
    boolean visited; // used in Graph search
    Vertex prev; // used in Graph search
    int accDist; // accumulated distance from source, used in Graph search
    int level; // used in BFS
    // constructor of the class Vertex /Node
    Vertex(String name) // constructor
    {
        this.vname = name;
        this.visited = false;
        this.prev = null;
        this.accDist = 0;
    }

    // mutator
    public void setVID(int vid)
    {
        this.vid = vid;
    }

    // accessor
    public String getName() {
        return this.vname;
    }
    public int getVID()
    {
        return this.vid;
    }
    public String toString()
    {
        return this.vname;
    }

}