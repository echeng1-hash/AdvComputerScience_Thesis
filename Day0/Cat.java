public class Cat { //1. Made 'public' lowercase //2. Make "Cats" into "Cat" 
	private String name;
	private String breed;
	private boolean isHungry;
	private int livesRemaining;
	
	// 2-Parameter Constructor
	public Cat(String name, String breed, boolean isHungry) { //3. Make "cat" into "Cat" //11. Add "String breed" //16. Add "boolean isHungry"
		this.name = name; //4. Make "name = name;" into "this.name = name;"
		this.breed = breed; //5. Make "breed = breed;" into "this.breed = breed;"
		this.isHungry = isHungry; //6. Make "this.isHungry = yes;" into ""
		livesRemaining = 9;
	}

	public String getName() { //7. make "void" into String
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean getIsHungry(){ //8. make "void" into boolean //15. Make "ishungry" into "IsHungry"
		return isHungry;
	}

    public void setisHungry(boolean isHungry) { //12. Add this setter
		this.isHungry = isHungry;
	}

	public boolean isHungry() { //13. Make "feed" into "isHungry"
		return this.isHungry = false; //14. Add "return"
	}

	public boolean equals(Cat other) {
		return this.name == other.name && this.breed.equals(other.breed)
			&& this.livesRemaining == other.livesRemaining; //10. make "=" into "=="
	}

	public String toString() { //9. make "System.out.println" into "return"
		return name + " is of breed " + breed + " and has " + livesRemaining + " lives remaining.";
	}
}