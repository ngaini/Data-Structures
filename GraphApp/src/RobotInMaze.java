

import java.util.ArrayList;
import java.util.HashSet;
//import CtCILibrary.AssortedMethods;

/**
 * Created by Nathan on 7/3/2016.
 */
public class RobotInMaze {

    /**
     * CCI method for solving the problem
     */
//    public static ArrayList<String> getPath(boolean[][] maze) {
//        if (maze == null || maze.length == 0) return null;
////        ArrayList<Point> path = new ArrayList<Point>();
//        ArrayList<String> path = new ArrayList<String>();
//
//        HashSet<Point> failedPoints = new HashSet<Point>();
//        if (getPath(maze, maze.length - 1, maze[0].length - 1, path, failedPoints)) {
//            return path;
//        }
//        return null;
//    }
//
//    public static boolean getPath(boolean[][] maze, int row, int col, ArrayList<String> path, HashSet<Point> failedPoints) {
//		/* If out of bounds or not available, return.*/
//        if (col < 0 || row < 0 || !maze[row][col]) {
//            return false;
//        }
//
//        Point p = new Point(row, col);
//
//		/* If we've already visited this cell, return. */
//        if (failedPoints.contains(p)) {
//            return false;
//        }
//
//        boolean isAtOrigin = (row == 0) && (col == 0);
//
//		/* If there's a path from the start to my current location, add my location.*/
//        if (isAtOrigin || getPath(maze, row, col - 1, path, failedPoints) || getPath(maze, row - 1, col, path, failedPoints)) {
//            path.add(p.x+","+p.y);
//            return true;
//        }
//
//        failedPoints.add(p); // Cache result
//        return false;
//    }


    /**
     * finding the path to the finish using my own method
     * @param maze
     * @return
     */
	
	class Point{
		 int x, y;
		 
		 Point(){
			 this.x = -1;
			 this.y = -1;
		 }
		 
		 Point(int x, int y){
			 this.x = x ;
			 this.y = y;
		 }
	}
    ArrayList<String> findPath(boolean[][] maze)
    {
        ArrayList<String> path = new ArrayList<String>();
        HashSet<Point> visited = new HashSet<>();
        if(findPath(0,0,visited,path, maze))
            return path;

        return null;

    }

    boolean findPath(int row, int col, HashSet<Point> visited, ArrayList<String> path, boolean[][] maze)
    {
        Point p = new Point(row, col);
        visited.add(p);
        boolean decision = false;
        if(row == maze.length-1 && col == maze[0].length-1)
        {
            path.add(row+","+col);
            return true;
        }


        if(row+1<maze.length && col<maze[0].length && !visited.contains(new Point(row+1, col)) && maze[row+1][col])
            decision = decision || findPath(row+1, col, visited, path, maze);
        if(col+1<maze[0].length && row<maze.length && !visited.contains(new Point(row, col+1)) && maze[row][col+1])
            decision = decision || findPath(row, col+1, visited, path, maze);
        if(decision)path.add(row+","+col);

        return decision;
    }

    public static void main(String[] args) {
        int size = 20;

        RobotInMaze rim = new RobotInMaze();
        boolean[][] maze = {{true, true,true},
                            {true,false, true},
                            {true,false, true},
                            {true,false, true}};
        for(int row=0;row<maze.length;row++)
        {
            for(int col=0;col<maze[0].length;col++)
                System.out.print(" "+maze[row][col]);
            System.out.println();
        }

//        System.out.println(maze.length+" & "+maze[0].length);

//        AssortedMethods.printMatrix(maze);

//        ArrayList<String> path = getPath(maze);
        
        ArrayList<String> path = rim.findPath(maze);
        if (path != null) {
            System.out.println(path.toString());
        } else {
            System.out.println("No path found.");
        }
    }
}
