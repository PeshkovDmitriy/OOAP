public class OrcArmy extends army {
    recruitArmy recruitment;
    public OrcArmy(recruitArmy recruitment){
        this.recruitment=recruitment;
    }
    void recruitArmy(){
        System.out.println("Армия"+ name);
        warlord = recruitment.recruitWarlord();
        general1 = recruitment.recruitGeneral1();
        soldier = recruitment.recruitSoldier();
    }
}
