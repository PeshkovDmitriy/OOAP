public class OrcRecruitment implements recruitArmy{
    @Override
    public Warlord recruitWarlord() {
        return new OrcWarlord();
    }

    @Override
    public General1 recruitGeneral1() {
        return new OrcGeneral();
    }

    @Override
    public Soldier recruitSoldier() {
        return new OrcSoldier();
    }
}
