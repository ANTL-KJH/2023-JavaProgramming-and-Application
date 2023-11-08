/**
 * Project Name : JavaProgramming and Application HW08.2
 * Program's purpose and basic function :
 * - class Trie
 * Program First Author : JH KIM
 * Date of First Write : 2023.11.06
 * =======================================================================================================
 * Source Code Modification History
 * =======================================================================================================
 * Author				Date				Ver				Modification details
 * JH KIM				2023.11.06			v1.00			First Write
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
public class Trie {
    // data member
    private TrieNode _root;
    private String _name;

    // constructor
    public Trie(String nm) {
        this._root = new TrieNode('/');
        this._name = nm;
    }
    public String getName() {
        return this._name;
    }
    public void insert(String word) {
        TrieNode curTN = this._root;
        TreeMap<Character, TrieNode> children = curTN.getChildren();
        for(int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
//TrieNode node;
            if(children.containsKey(c)) {
                curTN = children.get(c);
            } else {
                curTN = new TrieNode(c);
                children.put(c, curTN);
            }
            children = curTN.getChildren();
            if(i == word.length() - 1) {
                curTN.setLeaf(true);
                curTN.setKeyWord(word);
            }
        }
    }
    public boolean search(String word)  // search
    {
        TrieNode curTN = _searchKeyword(word);
        if(curTN != null && curTN.isLeaf()) // leaf node check
        {
            return true;
        } else {
            return false;
        }
    }
    public TrieNode _searchKeyword(String word) // search inner func
    {
        TrieNode curTN = this._root;
        TreeMap<Character, TrieNode> children
                = curTN.getChildren();
        for(int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if(children.containsKey(c)) {
                curTN = children.get(c);
                children = curTN.getChildren(); // move to child node
            } else {
                curTN = null;
                break;
            }
        }
        return curTN;
    }
    public void _getKeywords(TrieNode curTN, ArrayList<String> keywords)    // get keyword inner function
    {
        TrieNode tn;
        if (curTN.isLeaf()) {
            keywords.add(curTN.getKeyWord());
        }
        TreeMap<Character, TrieNode> children = curTN.getChildren();    // move to child
        Set<Entry<Character, TrieNode>> trieNodes = children.entrySet();
        for (Entry<Character, TrieNode> entry : trieNodes) {
            tn = entry.getValue();
            if (tn.getChildren() != null) { _getKeywords(tn, keywords);
            }
        }
    }

    public ArrayList<String> getKeywords()  // get keyword
    {
        TrieNode curTN = this._root;
        ArrayList<String> keywords = new ArrayList<>(); _getKeywords(curTN, keywords);
        return keywords;
    }
    public ArrayList<String> getPredictiveWords(String keyword) {
        TrieNode curTN = _searchKeyword(keyword);   // search
        ArrayList<String> keywords = new ArrayList<>(); _getKeywords(curTN, keywords);  // get keyword
        return keywords;
    }
}
