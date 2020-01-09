class TrieNode{
    public boolean isWord;
    TrieNode[] children = new TrieNode[26];
}

public class Trie {
    TrieNode root = new TrieNode();
    /** Initialize your data structure here. */
    public Trie() {
        
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode ws = root;
        for (Character c: word.toCharArray()){
            if (ws.children[c-'a']==null){
                ws.children[c-'a']= new TrieNode();
            }
            ws = ws.children[c-'a'];
        }
        ws.isWord = true;
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode ws = root;
        for (Character c: word.toCharArray()){
            if (ws.children[c-'a']==null){
                return false;
            }
            ws = ws.children[c-'a'];
        }
        return ws.isWord;        
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        TrieNode ps = root;
        for (Character c: prefix.toCharArray()){
            if (ps.children[c-'a']==null){
                return false;
            }
            ps = ps.children[c-'a'];
        }
        return true;
    }
}


