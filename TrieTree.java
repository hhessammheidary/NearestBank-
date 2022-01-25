/*public class TrieTree<T> {
    static TrieNode root;

    static void insert(String key)
    {
        int depth;
        int length = key.length();
        int index;

        TrieNode currentNode = root;

        for (depth = 0; depth < length; depth++){
            index = key.charAt(depth) - 97;
            if (currentNode.children[index] == null)
                currentNode.children[index] = new TrieNode();

            currentNode = currentNode.children[index];
        }

        currentNode.isEnd = true;
    }

    static boolean search(String key)
    {
        int depth;
        int length = key.length();
        int index;
        TrieNode currentNode = root;

        for (depth = 0; depth < length; depth++){
            index = key.charAt(depth) - 97;

            if (currentNode.children[index] == null)
                return false;

            currentNode = currentNode.children[index];
        }

        return (currentNode.isEnd);
    }

    public static void main(String args[])
    {
        // Input keys (use only 'a' through 'z' and lower case)
        String keys[] = {"the", "a", "there", "answer", "any",
                "by", "bye", "their"};

        String output[] = {"Not present in trie", "Present in trie"};


        root = new TrieNode();

        // Construct trie
        int i;
        for (i = 0; i < keys.length ; i++)
            insert(keys[i]);

        // Search for different keys
        if(search("the") == true)
            System.out.println("the --- " + output[1]);
        else System.out.println("the --- " + output[0]);

        if(search("these") == true)
            System.out.println("these --- " + output[1]);
        else System.out.println("these --- " + output[0]);

        if(search("their") == true)
            System.out.println("their --- " + output[1]);
        else System.out.println("their --- " + output[0]);

        if(search("thaw") == true)
            System.out.println("thaw --- " + output[1]);
        else System.out.println("thaw --- " + output[0]);

    }
}
*/