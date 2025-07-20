package org.example.graphs;

public class Main {

    public static void main(String[] args) {
        char[][] grid = {
                {'1', '1', '1', '1', '0'},
                {'0', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };


        char[][] grid2 = {
                {'1','1','0','0','1'},
                {'1','1','0','0','1'},
                {'0','0','1','0','0'},
                {'0','0','0','1','1'}
        };

        NumberOfIslandsDFS numberOfIslands = new NumberOfIslandsDFS();
        System.out.println(numberOfIslands.numIslands(grid));

        System.out.println(numberOfIslands.numIslands(grid2));
    }
}
