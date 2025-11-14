public class Robot {
    // to-do: change file name, class, and constructor to Robot
    private int[] hallway;
    private int position; // the robot's current position
    private boolean isFacingRight; // true if the robot is facing right

    public Robot(int[] hallwayToClean, int startingPosition) {
        this.hallway = hallwayToClean;
        this.position = startingPosition;
        this. isFacingRight = true;
    }

    public int[] getHallway() {
        return hallway;
    }

    public void setHallway(int[] hallway) {
        this.hallway = hallway;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public boolean isFacingRight() {
        return isFacingRight;
    }

    public void setFacingRight(boolean isFacingRight) {
        this.isFacingRight = isFacingRight;
    }

    /*
     * Determines if the robot is blocked by a wall (the end of an array)
     * 
     * @return true if the robot is blocked by a wall, false otherwise
     */
    public boolean isRobotBlockedByWall() {
        // to-do: implement this method
        return (position == 0 && !isFacingRight)
            || (position == hallway.length - 1 && isFacingRight);
    }

    /*
     * Commands the robot to pick up an item, move forward or turn around
     */
    public void move() {
        // to-do: implement this method
        // 1. Always try to pick up one item if there is any
        if (hallway[position] > 0) {
            hallway[position]--; // pick up one item
            // If there are still items left here, stay put
            if (hallway[position] > 0) {
                return; // Exits the method early if the message is invalid
            }
            // If now zero, we will either move or turn around below
        }
        // At this point, the current tile has no items
        if (!isRobotBlockedByWall()) {
            // move forward one step in the direction we are facing
            if (isFacingRight) {
                position++;
            } else {
                position--;
            }
        } else {
            // cannot move forward, so turn around
            isFacingRight = !isFacingRight;
        }
    }

    /**
     * This method displays the current state of the robot and the hallway. It then
     * calls the move() method and counts the number of moves it takes to clear the
     * hallway. The method should display the current state of the robot after each
     * move.
     * 
     * @return the number of moves made
     */

    public int clearHall() {
        int count = 0;
        // keep moving until hallway is clear
        while (!hallIsClear()) {
            move();
            count++;
            displayState();
        }
        return count;
    }

    /**
     * This method determines if the hallway contains any items.
     * 
     * @return a boolean value indicating if the hallway contains any items
     */
    public boolean hallIsClear() {
        // to-do: implement this method
        for (int i = 0; i < hallway.length; i++) {
            if (hallway[i] != 0) {
                return false;
            }
        }
        return true;
    }

    /*
     * Displays the current state of the robot and the hallway.
     */
    public void displayState() {
        // to-do: implement this method
        // print hallway numbers with one space between each
        for (int i = 0; i < hallway.length; i++) {
            System.out.print(hallway[i]);
            if (i < hallway.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
        // print spaces so the arrow lines up with the current position
        // each tile uses "number + space" so we need two spaces per index
        for (int i = 0; i < position; i++) {
            System.out.print("  ");
        }
        // print the robot's direction
        if (isFacingRight) {
            System.out.println(">");
        } else {
            System.out.println("<");
        }
    }
}
