package SpeciesAndSuch;

//Animal class
public class Animals {
    //Constructors
    private int temp;
    private String type;
    public String name;
    public String sound;
    public int weight;

    //Three Methods
    public Animals(int temp, String type, String name, String sound, int weight){
        //Properties
        this.name = name;
        this.temp = temp;
        this.type = type;
        this.sound = sound;
        this.weight = weight;
    }
    //The String is what the output will be the int is what's being passed through
    public String isType(){
          return this.temp > 41 && this.temp <= 50 ? "cold blooded" : "warm blooded";
        }

    public String protection(){
        return this.type == "mammal" ? "fur" : "no fur";
    }
    public String animalFacts(){
        return  this.name + " is animal and classified as a " + this.type + " its makes a " +
                this.sound + " when communicating " + " on average weighs " + this.weight + " lbs " + " and has ";
    }
}

/*Code worked fine except when I added this.temp to animal facts it only read the number input instead of the boolean
outcome it only showed the number. Otherwise happy with the code. Any recommendations?

 */