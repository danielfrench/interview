/*
11110
11010   1 island in this example
11000
00000

11110
11010   2 islands in this example
11000
00001

*/
class NumberOfIslands {
  
private int rows;
private int cols;

public int numIslands(char[][] grid) {
    rows = grid.length;
    if (rows==0) return 0;
    cols = grid[0].length;

    int count = 0;
    for (int i =0; i < rows;i++){
        for (int j=0; j<cols; j++ ){   
            if (grid[i][j]=='1'){       
                DFSMarking(grid,i,j);
                count++;
            }       
        }
    }
    return count;  
}
    
public void DFSMarking(char[][]grid, int i, int j){

    if (i<0||j<0||i>=rows||j>=cols||grid[i][j]=='0') return;
 
        grid[i][j]='0'; 
        DFSMarking(grid,i+1,j);  //move up
        DFSMarking(grid,i-1,j);  //move down
        DFSMarking(grid,i,j+1);  //move rigt
        DFSMarking(grid,i,j-1); // move left
    }       
}
