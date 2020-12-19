public abstract class ArmySt {
    public army orcArmy(String type){
        army Army;
        Army = crar(type);
        Army.recruitArmy();
        Army.check();
        return Army;
    }
    protected abstract army crar(String type);
}
class OrcElfArmySt extends ArmySt{
    @Override
    protected army crar(String type) {
        army Army = null;
        if (type.equals("orc")) {
            recruitArmy recruitment = new OrcRecruitment();
            Army = new OrcArmy(recruitment);
            Army.setName("Орков");
        }
        if (type.equals("elf")) {
            recruitArmy recruitment = new ElfRecruitment();
            Army = new ElfArmy(recruitment);
            Army.setName("Эльфов");
        }
        return Army;
    }

}