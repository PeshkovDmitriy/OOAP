public abstract class army {
    String name;
    General1 general1;
    Warlord warlord;
    Soldier soldier;

    abstract void recruitArmy();
    public void setName(String name){
        this.name = name;
    }
    public void check(){
        general1.chName();
        warlord.chName();
        soldier.chName();
    }
}
