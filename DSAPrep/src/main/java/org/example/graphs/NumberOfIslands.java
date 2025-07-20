package org.example.graphs;

import java.util.*;

public class NumberOfIslands {

    class Position {
        int i;
        int j;
        Position(int m, int n) {
            i =m;
            j = n;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Position)) return false;
            Position pos = (Position) o;
            return i == pos.i && j == pos.j;
        }

        @Override
        public int hashCode() {
            return Objects.hash(i, j);
        }

        @Override
        public String toString() {
            return "(" + i + "," + j + ")";
        }
    }

    public int numIslands(char[][] grid_og)
    {
        int rows = grid_og.length;
        int cols = grid_og[0].length;
        //rows==cols

        char[][] grid = new char[100][100];


        // Copy content
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                grid[i][j] = grid_og[i][j];
            }
        }

        grid[99][99] =0;

        Map<Position, List<Position>> islandList = new HashMap<>();

        boolean[][] visited = new boolean[100][100];



        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(!visited[i][j] && grid[i][j] == '1') {
                    visited[i][j] = true;
                    islandList.put(new Position(i,j),new ArrayList<>(Arrays.asList(new Position(i,j))));
                    Position left = getPos(i,j,'l', rows,cols);
                    Position right = getPos(i,j,'r', rows,cols);
                    Position top = getPos(i,j,'t', rows,cols);
                    Position bottom = getPos(i,j,'b', rows,cols);


                    if(!visited[left.i][left.j] && grid[left.i][left.j] =='1') {
                        islandList.get(new Position(i,j)).add(new Position(left.i,left.j));
                        visited[left.i][left.j] = true;
                    }

                    if(!visited[right.i][right.j] && grid[right.i][right.j] =='1') {
                        islandList.get(new Position(i,j)).add(new Position(right.i,right.j));
                        visited[right.i][right.j] = true;
                    }

                    if(!visited[top.i][top.j] && grid[top.i][top.j] =='1') {
                        islandList.get(new Position(i,j)).add(new Position(top.i,top.j));
                        visited[top.i][top.j] = true;
                    }

                    if(!visited[bottom.i][bottom.j] && grid[bottom.i][bottom.j] =='1') {
                        islandList.get(new Position(i,j)).add(new Position(bottom.i,bottom.j));
                        visited[bottom.i][bottom.j]= true;
                    }
                }

            }
        }

        int count =0 ;
        for(List<Position> positions : islandList.values()) {
            boolean allWater = true;
            for(Position position:positions) {
                int i = position.i;
                int j = position.j;
                Position left = getPos(i,j,'l', rows,cols);
                Position right = getPos(i,j,'r', rows,cols);
                Position top = getPos(i,j,'t', rows,cols);
                Position bottom = getPos(i,j,'b', rows,cols);

                if(grid[left.i][left.j] =='0' && grid[right.i][right.j] =='0' && grid[top.i][top.j] =='0' && grid[bottom.i][bottom.j] =='0') {
                    continue;
                } else {
                    allWater = false;
                }
            }
            if(allWater) count++;
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

    Position getPos(int i, int j, char pos, int row, int col) {


        if(pos == 'l') {
            if(j>0) return new Position(i, j - 1);
        }
        if(pos == 'r')  {
            if(j+1 < col)  return new Position(i,j+1);
        }
        if(pos == 't')  {
            if(i>0) return new Position(i-1,j);
        }
        if(pos == 'b') {
            if(i+1 < row)  return new Position(i+1,j);
        }
        return new Position(99,99);
    }
}
