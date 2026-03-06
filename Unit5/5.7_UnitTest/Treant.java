public class Treant extends Monster { // monster's subclass

    public Treant() {
        super(
                "Treant",
                ElementType.EARTH,
                100,
                40,
                50,
                60,
                "Vine",
                "Air",
                ElementType.EARTH,
                ElementType.AIR);
    }

    @Override
    public String victoryNoise() {
        return "Treant rumbles!";
    }
}