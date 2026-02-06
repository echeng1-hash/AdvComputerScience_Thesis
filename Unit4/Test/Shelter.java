import java.util.ArrayList;

public class Shelter {
    // instance variables
    private Dog[][] kennels;

    // constructors
    public Shelter(int rows, int cols) {
        if (rows <= 0 || cols <= 0) {
            throw new IllegalArgumentException("Parameters cannot be less than or equal to zero.");
        }
        kennels = new Dog[rows][cols];
    }

    /* initializes kennels as a 3x3 2D array */
    public Shelter() {
        kennels = new Dog[3][3];
    }

    // getters and setters
    public Dog[][] getKennels() {
        return kennels;
    }

    public void setKennels(Dog[][] kennels) {
        this.kennels = kennels;
    }

    // methods

    /*
     * prints out the 2D array 'kennels', displaying the dog's info if the kennel is
     * occupied, or
     * 'empty' if the kennel is empty
     */
    public void displayStatus() {
        for (Dog[] row : kennels) {
            for (Dog animal : row) {
                if (animal != null) {
                    System.out.print(animal);
                } else {
                    System.out.print("[Empty]");
                }
            }
            System.out.println();
        }
    }

    public void add(Dog animal) {
        if (animal == null) {
            throw new IllegalArgumentException("Animal is null, and it can't be null.");
        }
        for (int r = 0; r < kennels.length; r++) {
            for (int c = 0; c < kennels[r].length; c++) {
                if (kennels[r][c] == null) {
                    kennels[r][c] = animal;
                }
            }
        }
        System.out.println("No empty kennels.");
    }

    public void add(Dog animal, int row, int col) {
        if (animal == null) {
            throw new IllegalArgumentException("Animal is null, and it can't be null.");
        }
        if (row < 0 || row >= kennels.length) {
            throw new IllegalArgumentException("The row is invalid.");
        }
        if (col < 0 || col >= kennels[row].length) {
            throw new IllegalArgumentException("The col is invalid.");
        }
        if (kennels[row][col] == null) {
            kennels[row][col] = animal;
        }
        for (int r = 0; r < kennels.length; r++) {
            for (int c = 0; c < kennels[r].length; c++) {
                if (kennels[r][c] == null) {
                    kennels[r][c] = animal;
                }
            }
        }
        System.out.println("No empty kennels.");
    }

    public void add(ArrayList<Dog> animals) {
        if (animals == null) {
            throw new IllegalArgumentException("Animal is null, and it can't be null.");
        }
        for (int i = 0; i < animals.size(); i++) {
            Dog dog = animals.get(i);
            if (dog == null) {
                throw new IllegalArgumentException("Animal contains null, and it can't be null.");
            }
            boolean placed = false;
            for (int r = 0; r < kennels.length; r++) {
                for (int c = 0; c < kennels[r].length; c++) {
                    if (kennels[r][c] == null) {
                        kennels[r][c] = dog;
                        placed = true;
                        break; // it says void here, so break to stop columns
                    }
                }
                if (placed) {
                    break; // stop rows
                }
            }
            if (!placed) {
                System.out.println("No empty kennels.");
            }
        }
    }

    public Dog adopt(int row, int col) {
        if (row < 0 || row >= kennels.length) {
            throw new IllegalArgumentException("The row is invalid.");
        }
        if (col < 0 || col >= kennels[row].length) {
            throw new IllegalArgumentException("The col is invalid.");
        }
        if (kennels[row][col] == null) {
            throw new IllegalArgumentException("There is no dog here:(");
        }
        Dog adopted = kennels[row][col];
        kennels[row][col] = null;
        return adopted;
    }

    public ArrayList<Dog> search(String name) {
        if (name == null) {
            throw new IllegalArgumentException("The name is null, and it can't be null.");
        }
        ArrayList<Dog> result = new ArrayList<Dog>();
        for (int r = 0; r < kennels.length; r++) {
            for (int c = 0; c < kennels[r].length; c++) {
                Dog dog = kennels[r][c];
                if (dog != null && dog.getName().equals(name)) {
                    result.add(dog);
                }
            }
        }
        return result;
    }

    public ArrayList<Dog> search(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("The age cannot be negative!");
        }
        ArrayList<Dog> result = new ArrayList<Dog>();
        for (int r = 0; r < kennels.length; r++) {
            for (int c = 0; c < kennels[r].length; c++) {
                Dog dog = kennels[r][c];
                if (dog != null && dog.getAge() == age) {
                    result.add(dog);
                }
            }
        }
        return result;
    }
}
