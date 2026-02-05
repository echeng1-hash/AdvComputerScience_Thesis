public class SkyViewTester {
    public static void main(String[] args) {
        // normal
        double[] scanned1 = { 0.3, 0.7, 0.8, 0.4, 1.4, 1.1 };
        SkyView sky1 = new SkyView(3, 2, scanned1);
        System.out.println("Test 1 (3x2 normal): created SkyView successfully.");
        // Edge case1: scanned is null
        try {
            SkyView bad1 = new SkyView(3, 2, null);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Intentionally triggered: scanned is null\n");
        }
        // Edge case2: rows not positive
        try {
            SkyView bad2 = new SkyView(0, 2, scanned1);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Intentionally triggered: rows not positive\n");
        }

        // Edge case3: cols not positive
        try {
            SkyView bad3 = new SkyView(3, 0, scanned1);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Intentionally triggered: cols not positive\n");
        }

        // other given ones
        System.out.println(sky1.getView());
        System.out.println(sky1.getView().toString());

        System.out.println(sky1.getView().equals(sky1.getView()));

        System.out.println(sky1.getAverage(0, 2, 1, 2));
    }
}
