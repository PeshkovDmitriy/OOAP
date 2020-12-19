public class Soldier {
    String name;
    public void chName(){
        System.out.println(name);
    }
}
class OrcSoldier extends Soldier {
    public OrcSoldier() {
        this.name = "Orc Soldier";
    }
}
class ElfSoldier extends Soldier{
    public ElfSoldier(){
        this.name = "Elf Warlord";

    }
}
