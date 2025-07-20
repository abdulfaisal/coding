package org.example.graphs;

import java.util.*;

public class NumberOfIslandsDFS {

    char[][] grid;
    boolean[][] visited;
    int rows;
    int cols;

    public int numIslands(char[][] grid_income)
    {
        grid = grid_income;
        rows = grid.length;
        cols = grid[0].length;

        visited = new boolean[rows][cols];

        int count = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(!visited[i][j] && grid[i][j] == '1') {
                    dfs(i,j);
                    count ++ ;
                }

            }
        }

        return count;
    }

    /*

    (i,j)
l -- i,j-1
r -- i,j+1
t -- i-1,j
b -- i+1,j
     */

     void dfs(int i, int j ) {
        if(i<0 || i>= rows || j < 0 || j>= cols) return;

        if(!visited[i][j] && grid[i][j] == '1') {
            visited[i][j] = true;
            dfs(i,j-1);
            dfs(i,j+1);
            dfs(i-1,j);
            dfs(i+1,j);
        }
     }
}
