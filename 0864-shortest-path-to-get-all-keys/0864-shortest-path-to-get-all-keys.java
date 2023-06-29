class Solution {
    public int shortestPathAllKeys(String[] grid) {
        int n = grid.length;
        int m = grid[0].length();
        
        int keysLimit = 1 << 6;
        
        Node[][][] nodes = new Node[n][m][keysLimit];
        int startX = 0;;
        int startY = 0;
        
        int keyNum = 0;
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                char c = grid[i].charAt(j);
                for(int k = 0; k < keysLimit; k++)
                {
                    Node node = new Node();
                    node.keys = k;
                    node.item = c;
                    nodes[i][j][k] = node;
                }
                
                if(c == '@')
                {
                    startY = i;
                    startX = j;
                }
                if(isKey(c))
                {
                    keyNum++;
                }
            }
        }
        
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                for(int k = 0; k < keysLimit; k++)
                {
                    if(i > 0)
                    {
                        build(nodes[i - 1][j], nodes[i][j][k]);
                    }
                    if(j > 0)
                    {
                        build(nodes[i][j - 1], nodes[i][j][k]);
                    }
                    if(i + 1< n)
                    {
                        build(nodes[i + 1][j], nodes[i][j][k]);
                    }
                    if(j + 1 < m)
                    {
                        build(nodes[i][j + 1], nodes[i][j][k]);
                    }
                }
            }
        }
        
        Node start = nodes[startY][startX][0];
        start.dp = 1;
        Deque<Node> queue = new ArrayDeque(n * m * keysLimit);
        queue.addLast(start);
        while(!queue.isEmpty())
        {
            Node head = queue.removeFirst();
            for(Node nearby : head.nearby)
            {
                if(nearby.dp != 0)
                {
                    continue;
                }
                nearby.dp = head.dp + 1;
                queue.addLast(nearby);
            }
        }
        
        int min = 100000000;
        int index = (1 << keyNum) - 1;
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                if(nodes[i][j][index].dp == 0)
                {
                    continue;
                }
                min = Math.min(min, nodes[i][j][index].dp);
            }
        }
        
        return min == 100000000 ? -1 : (min - 1);
    }
    
    public static void build(Node[] nodes, Node node)
    {
        char c = nodes[0].item;
        if(isKey(c))
        {
            int newKey = node.keys | keyMask(c);
            node.nearby.add(nodes[newKey]);
        }
        else if(isLock(c))
        {
            if(hasKey(node.keys, c))
            {
                node.nearby.add(nodes[node.keys]);
            }
        }
        else if(c != '#')
        {
            node.nearby.add(nodes[node.keys]);
        }
    }
    
    public static class Node{
        int keys;
        char item;
        List<Node> nearby = new ArrayList<Node>(4);
        int dp;
    }
    
    public static boolean isKey(char c)
    {
        return c >= 'a' && c <= 'z';
    }
    
    public static boolean isLock(char c)
    {
        return c >= 'A' && c <= 'Z';
    }
    
    public static int keyMask(char key)
    {
        return 1 << (key - 'a');
    }
    
    public static int lockMask(char lock)
    {
        return 1 << (lock - 'A');
    }
    
    public static boolean hasKey(int keys, char c)
    {
        return (keys & lockMask(c)) != 0;
    }
}