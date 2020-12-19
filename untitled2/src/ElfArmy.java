public class ElfArmy extends army{
    recruitArmy recruitment;
    public ElfArmy(recruitArmy recruitment){
        this.recruitment=recruitment;
    }
    void recruitArmy(){
        System.out.println("Армия"+ name);
        warlord = recruitment.recruitWarlord();
        general1 = recruitment.recruitGeneral1();
        soldier = recruitment.recruitSoldier();
    }
}
