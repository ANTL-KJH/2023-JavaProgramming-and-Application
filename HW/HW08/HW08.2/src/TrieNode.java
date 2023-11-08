/**
 * Project Name : JavaProgramming and Application HW08.2
 * Program's purpose and basic function :
 * - class TrieNode
 * Program First Author : JH KIM
 * Date of First Write : 2023.11.06
 * =======================================================================================================
 * Source Code Modification History
 * =======================================================================================================
 * Author				Date				Ver				Modification details
 * JH KIM				2023.11.06			v1.00			First Write
 */
import java.util.TreeMap;
public class TrieNode {
    // data member
    private char ch;
    private String keyword;
    private TreeMap<Character, TrieNode>children = new TreeMap<>();
    private boolean isLeaf;
    public TrieNode() {}
    public TrieNode(char ch) { this.ch = ch; }

    public boolean isLeaf() { return isLeaf; }
    // mutator
    public void setChildren(TreeMap<Character,
            TrieNode> children) { this.children = children; }
    public void setLeaf(boolean isLeaf)
    { this.isLeaf = isLeaf; }
    public void setKeyWord(String keyword)
    { this.keyword = keyword; }

    // accessor
    public char getCh() { return this.ch; }
    public String getKeyWord() { return this.keyword; }
    public TreeMap<Character, TrieNode>getChildren() { return children; }
}