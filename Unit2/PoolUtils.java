public class PoolUtils {
    public static String fixName(String ownerName) {
        String trimmedText = ownerName.trim();
        for ()
    }

    public static String generateUsername(String username) {
        return "@" + username.substring(0, username.indexOf(" ") + 1) 
            + "_" + username.substring(username.indexOf(" ")) + "_" + (int)(Math.random() * (2050 - 1950) + 1950);

    }

    public static int validateCleanlinessLevel(int cleanlinessLevel) {
        if (cleanlinessLevel < 0) {
            return 0;
        } else if (cleanlinessLevel > 10) {
            return 10;
        } else {
            return cleanlinessLevel;
        }
    }

    public static int cleanPool(Pool pool) {
        pool.setCleanlinessLevel() = pool.getCleanlinessLevel() + 2;
        return pool.setCleanlinessLevel();
    }
}
