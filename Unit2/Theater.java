public class Theater {
    // Instance Variables
    private String theaterName;
    private TheaterMember[] registeredMembers;

    // Constructors
    public Theater(String theaterName, TheaterMember[] registeredMembers) {
        this.theaterName = theaterName;
        this.registeredMembers = registeredMembers;
    }

    // Getters and Setters
    public Theater(String theaterName, int initialCapacity) {
        this.theaterName = theaterName;
        registeredMembers = new TheaterMember[initialCapacity];
    }

    public String getTheaterName() {
        return theaterName;
    }

    public void setTheaterName(String theaterName) {
        this.theaterName = theaterName;
    }

    public TheaterMember[] getRegisteredMembers() {
        return registeredMembers;
    }

    public void setRegisteredMembers(TheaterMember[] registeredMembers) {
        this.registeredMembers = registeredMembers;
    }

    // Methods
    public boolean isFull() {
        for (int i = 0; i < 10; i++) {
            if (registeredMembers[i] == null) {
                return false;
            }
        }
        return true;
    }

    public void increaseCapacity() {
        newArray = new TheaterMember[registeredMembers.length * 2];
    }

    public void registerMember(TheaterMember member) {
        for (int i = 0; i < registeredMembers.length; i++) {
            if (registeredMembers[i] == null) {
                registeredMembers[i] = member;
                break;
            } else if (isFull()) {
                increaseCapacity();
            }
        }
    }

    public String toString() {
        int lineNum = 1;
        for (int i = 0; i < registeredMembers.length; i++) {
            TheaterMember m = registeredMembers[i];
            if (m != null) {
                result += lineNum + ".) "
                        + m.getName() + " (" +;
                lineNum++;
            }
        }

        return "== AMC Members ==\n" += ;
    }

    public boolean deleteMember(TheaterMember member) {
        for (int i = 0; i < registeredMembers.length; i++) {
            if (registeredMembers[i] != null &&
                    registeredMembers[i].equals(member)) {
                registeredMembers[i] = null;
                return true;
            }
        }
        return false;
    }
}
