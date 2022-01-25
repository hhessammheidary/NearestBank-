public class TrieNodeN
{
    TrieNodeN[] children = new TrieNodeN[26];
    boolean isEnd;
    Neighbourhood neighbourhood;
    TrieNodeN(Neighbourhood neighbourhood){
        this.neighbourhood = neighbourhood;
        for (int i = 0; i < 26; i++) {
            children[i] = null;
        }
        isEnd = false;
    }
}