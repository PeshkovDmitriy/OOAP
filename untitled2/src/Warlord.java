public class Warlord {
    String name;
    public void chName(){
        System.out.println(name);
    }
}
class OrcWarlord extends Warlord {
    public OrcWarlord() {
        this.name = "Orc Warlord";
    }
}
class ElfWarlord extends Warlord{
    public ElfWarlord(){
        this.name = "Elf Warlord";

    }
}
