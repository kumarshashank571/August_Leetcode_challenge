class Solution {
public:
    int orangesRotting(vector<vector<int>> &grid)
{
    int n = grid.size();
    int m = grid[0].size();

    queue<pair<int, int>> que;
    int Freshoranges = 0;

    for (int i = 0; i < n; i++)
        for (int j = 0; j < m; j++)
            if (grid[i][j] == 2)
                que.push({i, j});
            else if (grid[i][j] == 1)
                Freshoranges++;

    if (Freshoranges == 0)
        return 0;

    vector<vector<int>> dirA = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

    int time = 0;
    while (que.size() != 0)
    {
        int size = que.size();
        while (size-- > 0)
        {
            pair<int, int> rvtx = que.front();
            que.pop();

            for (int d = 0; d < 4; d++)
            {
                int r = rvtx.first + dirA[d][0];
                int c = rvtx.second + dirA[d][1];

                if (r >= 0 && c >= 0 && r < n && c < m && grid[r][c] == 1)
                {
                    grid[r][c] = 2;
                    que.push({r, c});
                    Freshoranges--;
                }
            }
        }
        time++;
    }

    return Freshoranges != 0 ? -1 : time - 1;
}
};
