import java.awt.Point;
import java.util.HashSet;
import java.util.Set;

class Solution {
    int direction = 0;
    int[] position = {0,0};
    int result = 0;
    int aux = 0;
    Point point = new Point(0,0);

    public int robotSim(int[] commands, int[][] obstacles) {
        Set<Point> obstaclesSet = new HashSet<>();

        for (int[] coord : obstacles) {
            obstaclesSet.add(new Point(coord[0],coord[1]));
        }

        for (int command : commands) {
            checkCommand(command, obstaclesSet);
        }

        return result;
    }

    public void moveRobot(int num, Set<Point> obstaclesSet) {
        for (int i = 0; i < num; i++) {
            int originalX = this.position[0];
            int originalY = this.position[1];

            switch (direction) {
                case 0: // North
                this.position[1]++;
                    break;
                case 1: // East
                this.position[0]++;
                    break;
                case 2: // South
                this.position[1]--;
                    break;
                case 3: // West
                this.position[0]--;
                    break;
            }

            point.move(position[0], position[1]);
            if (obstaclesSet.contains(point)) {
                this.position[0] = originalX;
                this.position[1] = originalY;
                return;
            }

            aux = euclideanDist(position[0], position[1]);

            if (result < aux) {
                result = aux;
            }
        }
    }

    public void checkCommand(int command,  Set<Point> obstaclesSet) {
        switch (command) {
            case -1:
                direction = (direction + 1) % 4;
                break;

            case -2:
                direction = (direction + 3) % 4;
                break;
        
            default:
                moveRobot(command, obstaclesSet);
                break;
        }

    }

    public int euclideanDist(int x, int y) {
        return ((x*x) + (y*y));
    }

    public static void main(String[] args) {
        int[] commands = {6,-1,-1,6};
        int[][] obstacles = {};
        Solution solution = new Solution();
        int result = solution.robotSim(commands, obstacles);
        System.out.println("Result: " + result);
    }

}