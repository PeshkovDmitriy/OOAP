public class ElfRecruitment implements recruitArmy{
    @Override
    public Warlord recruitWarlord() {
        return new ElfWarlord();
    }
    public General1 recruitGeneral1(){
        return new ElfGeneral();
    }
    public Soldier recruitSoldier(){
        return new ElfSoldier();
    }
}
