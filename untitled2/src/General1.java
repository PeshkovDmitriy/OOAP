public class General1 {
    String name;
    public void chName(){
        System.out.println(name);
    }
}
class OrcGeneral extends General1 {
    public OrcGeneral() {
        this.name = "Orc General";
    }
}
class ElfGeneral extends General1{
    public ElfGeneral(){
        this.name = "Elf General";
    }
}
