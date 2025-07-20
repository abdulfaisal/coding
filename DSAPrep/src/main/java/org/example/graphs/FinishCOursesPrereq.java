package org.example.graphs;

import org.example.binarysearch.SearchInSortedArray;

import java.util.HashSet;
import java.util.Set;

public class FinishCOursesPrereq {
        int[][] graph;
        Set<Integer> visited = new HashSet<>();
        Set<Integer> path = new HashSet<>();

        public boolean canFinish(int numCourses, int[][] prerequisites) {
            graph = new int[numCourses][numCourses];

            // Build adjacency matrix
            for (int[] pre : prerequisites) {
                int from = pre[0];
                int  to = pre[1];
                graph[from][to] = 1;
            }

            // DFS for each unvisited node
            for (int i = 0; i < numCourses; i++) {
                if (!visited.contains(i)) {
                    if (dfs(i)) return false; // Cycle detected
                }
            }

            return true; // No cycle found
        }

        private boolean dfs(int node) {
            visited.add(node);
            path.add(node); // Add to current DFS path

            for (int neighbor = 0; neighbor < graph.length; neighbor++) {
                if (graph[node][neighbor] == 1) {
                    if (!visited.contains(neighbor)) {
                        if (dfs(neighbor)) return true;
                    } else if (path.contains(neighbor)) {
                        return true; // Back edge → cycle
                    }
                }
            }

            path.remove(node); // Backtrack
            return false;
        }
}
