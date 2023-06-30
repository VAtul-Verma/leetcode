class Solution {
   public int latestDayToCross(int row, int col, int[][] cells) {

	int len = row * col, day = 1;
	boolean[][] matrix = new boolean[row][col];
	int[] parent = new int[len], rank = new int[len], left = new int[len], right = new int[len];
	int[][] dirs = { { 0, 1 }, { 1, 0 }, { -1, 0 }, { 0, -1 }, { -1, -1 }, { 1, 1 }, { 1, -1 }, { -1, 1 } };

	for (int i = 0; i < row; i++) {
		for (int j = 0; j < col; j++) {
			int index = i * col + j;
			parent[index] = index;
			left[index] = j;
			right[index] = j;
		}
	}

	for (int[] cell : cells) {
		int r = cell[0] - 1, c = cell[1] - 1;
		matrix[r][c] = true;
		for (int[] dir : dirs) {
			int cr = r + dir[0], cc = c + dir[1];
			if (cr < 0 || cc < 0 || cr >= row || cc >= col || !matrix[cr][cc])
				continue;
			union(r * col + c, cr * col + cc, parent, rank, left, right);
			int par = findParent(r * col + c, parent), lside = left[par], rside = right[par];
			if (lside == 0 && rside == col - 1)
				return day - 1;
		}
		day++;
	}

	return -1;
}

public int findParent(int x, int[] parent) {

	if (parent[x] == x)
		return x;
	int par = findParent(parent[x], parent);
	parent[x] = par;
	return par;
}

public void union(int x, int y, int[] parent, int[] rank, int[] left, int[] right) {

    int parx = findParent(x, parent), pary = findParent(y, parent);
	if (parx == pary)
		return;
    
	int rankx = rank[parx], ranky = rank[pary];
	if (rankx < ranky) {
		parent[parx] = pary;
		left[pary] = Math.min(left[pary], left[parx]);
		right[pary] = Math.max(right[pary], right[parx]);
	} else if (rankx > ranky) {
		parent[pary] = parx;
		left[parx] = Math.min(left[pary], left[parx]);
		right[parx] = Math.max(right[pary], right[parx]);
	} else {
		parent[parx] = pary;
		rank[pary]++;
		left[pary] = Math.min(left[pary], left[parx]);
		right[pary] = Math.max(right[pary], right[parx]);
	}
}
}