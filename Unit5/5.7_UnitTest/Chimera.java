public class Chimera extends Monster { // monster's subclass

    public Chimera() {
        super(
                "Chimera",
                ElementType.FIRE,
                50,
                50,
                10,
                140,
                "Pepper attack",
                "Scream attack",
                ElementType.FIRE,
                ElementType.AIR);
    }

    @Override
    public String victoryNoise() {
        return "Chimera roars!";
    }
}