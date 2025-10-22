public class Dog {
    public static final String toString = null;
    private String name;
    private String ownerName;
    private int age;
    private int dogId;
    private char dogChar;
    private String dogTag;
    private boolean strillInFacility;

    public Dog(String name, String ownerName, int age, int dogId) {
        this.name = name;
        this.ownerName = ownerName;
        this.age = age;
        this.dogId = PawesomeUtils.validateDogId(dogId);
        this.dogChar = PawesomeUtils.generateDogChar(this.dogId);
        this.dogTag = PawesomeUtils.generateDogTag(this.dogId, this.dogChar);
        this.strillInFacility = true;
    }
    
    public Dog() {
        this.name = "Cloudy";
        this.ownerName = "Ellie";
        this.age = 4;
        this.dogId = PawesomeUtils.validateDogId(dogId);
        this.dogChar = PawesomeUtils.generateDogChar(this.dogId);
        this.dogTag = PawesomeUtils.generateDogTag(this.dogId, this.dogChar);
        this.strillInFacility = false;
    }
    
    public String getName() {
        return name;
    }
    
    public String getOwnerName() {
        return ownerName;
    }
    
    public int getAge() {
        return age;
    }
    
    public int getDogId() {
        return dogId;
    }
   
    public char getDogChar() {
        return dogChar;
    }
    
    public String getDogTag() {
        return dogTag;
    }
   
    public boolean isStillInFacility() {
        return strillInFacility;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public void setDogId(int dogId) {
        this.dogId = PawesomeUtils.validateDogId(dogId);
        char newChar = PawesomeUtils.generateDogChar(this.dogId);
        setDogChar(newChar);

        String newTag = PawesomeUtils.generateDogTag(this.dogId, this.dogChar);
        setDogTag(newTag);
    }
    
    public void setDogChar(char dogChar) {
        this.dogChar = dogChar;
        String newTag = PawesomeUtils.generateDogTag(this.dogId, this.dogChar);
        setDogTag(newTag);
    }
    
    
    public void setDogTag(String dogTag) {
        this.dogTag = dogTag;
    }
    
    public void setStillInFacility(boolean strillInFacility) {
        this.strillInFacility = strillInFacility;
    }

    public String toString() {
        if (strillInFacility) {
            return (name + " is a good dog. They are " + age 
            + " years old and belong to " + ownerName 
            + ". They are currently in our facility. For employee use only: DogTag is " 
            + dogTag +".");
        } else {
            return (name + " is a good dog. They are " + age 
            + " years old and belong to " + ownerName 
            + ". They are currently not in our facility. For employee use only: DogTag is " 
            + dogTag +".");
        }
    }

    public boolean equals(Dog other) {
        if (this.name.equals(other.name) && this.ownerName.equals(other.ownerName) 
        && this.age == other.age && this.dogId == other.dogId && this.dogChar == other.dogChar 
        && this.dogChar == other.dogChar && this.strillInFacility == other.strillInFacility) {
            return true;
        } else {
            return false;
        }
    }
}