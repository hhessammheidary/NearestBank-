public class TrieTreeN {
    static TrieNodeN root;

    public void insert(String key , Neighbourhood neighbourhood)
    {
        int depth;
        int length = key.length();
        int index;

        TrieNodeN currentNode = root;

        for (depth = 0; depth < length; depth++){
            index = key.charAt(depth) - 97;
            if (currentNode.children[index] == null)
                currentNode.children[index] = new TrieNodeN(neighbourhood);

            currentNode = currentNode.children[index];
        }

        currentNode.isEnd = true;
    }

    public boolean search(String key)
    {
        int depth;
        int length = key.length();
        int index;
        TrieNodeN currentNode = root;

        for (depth = 0; depth < length; depth++){
            index = key.charAt(depth) - 97;

            if (currentNode.children[index] == null){
                return false;
            }

            currentNode = currentNode.children[index];
        }

        return (currentNode.isEnd);
    }

}
