public class PoolTester {
    public static void main(String[] args) {
        Pool p1 = new Pool ("Olivia Bei", "Abby", 8, true);
        System.out.println(p1.getName());
        System.out.println(p1.getUsername());
        p1.setCleanlinessLevel(-4);
        System.out.println(p1.getCleanlinessLevel());
    }
}
