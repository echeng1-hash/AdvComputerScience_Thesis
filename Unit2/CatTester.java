public class CatTester {
    public static void main(String[] args) {
        Cat c1 = new Cat ("Cookie", "Abby", 8, "1435N");
        System.out.println(c1.getCatChar());
        c1.setCatId("1234A");
        System.out.println(c1.getCatChar());
        Cat c2 = new Cat ("Cookie", "Abby", 8, "1234A");
        c1.equals(c2); // expect true
        PurrfectUtils.bootUp(c1);
        PurrfectUtils.pet(c1);
        for (int i = 1; i < 5; i++) {
            PurrfectUtils.trimClaws(c2); // confirm that it is random
        }
        PurrfectUtils.cleanLitterBox(c1);
        PurrfectUtils.feed(c1);
    }
}
