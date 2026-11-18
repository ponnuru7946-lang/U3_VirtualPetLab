public class VirtualPet {
    private String name;
    private int energyLevel;
    private int happinessLevel;
    private int weight;
    private int yearAge;
    private int monthAge;

    public VirtualPet(String name) {
        this.name = name;
        this.energyLevel = 0;
        this.happinessLevel = 0;
        this.weight = 5;
        this.yearAge = 0;
        this.monthAge = 0;
    }

    public String getName(){
        return name;
    }
    public int getEnergyLevel(){
        return energyLevel;
    }
    public int getHappinessLevel(){
        return happinessLevel;
    }
    public String toString(){
        String result = name + "'s" + "\n";
        result += "Information: " + "\\" + "n" + "\n";
        result += "Energy: " + energyLevel + "\\" + "n" + "\n";
        result += "Happiness: " + happinessLevel + "\\" + "n" + "\n";
        result += "Weight: " + weight + "g" + "\\" + "n" + "\n";
        result += "Age: " + monthAge + " months" + "\n";
        result += "and " + yearAge + " years";
        return result;
    }
    public void feed(){
        weight += 1;
        if (energyLevel < 10){
            energyLevel += 1;
        }
    }
    

}
