package com.leetcode.solution;

/**
 * Created by Lv Jiale on 2/5/2023.
 */
public class P64_MinimumPathSum {

    /*
    * 经典dp题
    * time: O(m*n)
    * space: O(1)
    * 注意状态转移方程的几种情况
    * */
    class Solution {
        public int minPathSum(int[][] grid) {
            int m = grid.length, n = grid[0].length;
            for(int i = 0; i < m; i++){
                for(int j = 0; j < n; j++){
                    if(i == 0 && j == 0) continue;
                    else if(i == 0) grid[i][j] = grid[i][j-1] + grid[i][j];
                    else if(j == 0) grid[i][j] = grid[i-1][j] + grid[i][j];
                    else grid[i][j] = Math.min(grid[i-1][j], grid[i][j-1]) + grid[i][j];
                }
            }
            return grid[m-1][n-1];
        }
    }
}
