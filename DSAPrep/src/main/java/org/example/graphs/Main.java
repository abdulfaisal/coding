package org.example.graphs;

public class Main {

    public static void main(String[] args) {
//        numberOfislands;

        FinishCOursesPrereq finishCOursesPrereq = new FinishCOursesPrereq();
//
        int prereqArr[][] = {{0,1},{1,0}};
        System.out.println(finishCOursesPrereq.canFinish(2,prereqArr));

        int prereqArr2[][] = {{0, 1}};
        System.out.println(finishCOursesPrereq.canFinish(2,prereqArr2));

        int prerequisites[][] ={{1,4},{2,4},{3,1},{3,2}};
        System.out.println(finishCOursesPrereq.canFinish(5,prerequisites));

//

        int prerequisites2[][] ={{0,1},{0,2},{1,2}};
        System.out.println(finishCOursesPrereq.canFinish(5,prerequisites2));

    }

    static void numberOfislands() {
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
