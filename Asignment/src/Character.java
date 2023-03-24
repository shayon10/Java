import java.util.Random;


public abstract class Character   {
    public String name;
    public int level;
    public int strength, dexterity, constitution, intelligence, wisdom, charisma;
    public int strengthMod, dexterityMod, constitutionMod, intelligenceMod, wisdomMod, charismaMod;
    public int strengthInc, dexterityInc, constitutionInc, intelligenceInc, wisdomInc, charismaInc;
    public int proficiencyMod;
    public int health;
    public int race;
    public boolean isDead = false;




    public int getDiceRollValue(int seed) {

        int numberOne, secondNumber, numberThree, NumberFour, minimumValue;
        Random r = new Random(seed);

        numberOne = r.nextInt(6)+1;

        secondNumber = r.nextInt(6)+1;

        numberThree = r.nextInt(6)+1;

        NumberFour = r.nextInt(6)+1;

        minimumValue =numberOne;
        if (minimumValue > secondNumber)
            minimumValue = secondNumber;
        if (minimumValue > numberThree)
            minimumValue = numberThree;
        if (minimumValue > NumberFour)
            minimumValue = NumberFour;

        return numberOne + secondNumber + numberThree + NumberFour - minimumValue;
    }


    public Character(String name, int seed) {
        this.name = name;
        this.level = 1;
        health = 5;
        int proficiencyMod=+2;
        int race;
        int distribute[] = new int[6];
        for (int i = 0; i < 6; i++) distribute[i] = getDiceRollValue(seed);
        strength = distribute[0];
        wisdom = distribute[1];
        dexterity = distribute[2];
        constitution = distribute[3];
        intelligence = distribute[4];
        charisma = distribute[5];
    }


    public Character(String name, int level, int strength, int dexterity, int constitution, int intelligence,
                     int wisdom, int charisma, int proficiencyMod, int health,  boolean isDead,int race) {
        this.name=name;
        this.level=level;
        this.strength=strength;
        this.dexterity=dexterity;
        this.constitution=constitution;
        this.intelligence=intelligence;
        this.wisdom=wisdom;
        this.charisma=charisma;
        this.proficiencyMod=proficiencyMod;
        this.health=health;
        this.isDead=isDead;
        this.race=race;

        if (health <= level * 5) {
            this.health = level * 5;
            this.isDead = false;
        }
        if (health < 0) {
            this.health = 0;
            this.isDead = true;
        }


        if(strength==2||strength==3){
            this.strengthMod=-4;
        }
        else if(strength==4||strength==5){
            this.strengthMod=-3;
        }
        else if(strength==6||strength==7){
            this.strengthMod=-2;
        }
        else if(strength==8||strength==9){
            this.strengthMod=-1;
        }
        else if(strength==10||strength==11){
            this.strengthMod=0;
        }
        else if(strength==12||strength==13){
            this.strengthMod=1;
        }
        else if(strength==14||strength==15){
            this.strengthMod=2;
        }
        else if(strength==16||strength==17){
            this.strengthMod=3;
        }
        else if(strength==18||strength==19){
            this.strengthMod=4;
        }
        else if(strength==20||strength==21){
            this.strengthMod=5;
        }
        if(dexterity==2||dexterity==3){
            this.dexterityMod=-4;
        }
        else if(dexterity==4||dexterity==5){
            this.dexterityMod=-3;
        }
        else if(dexterity==6||dexterity==7){
            this.dexterityMod=-2;
        }
        else if(dexterity==8||dexterity==9){
            this.dexterityMod=-1;
        }
        else if(dexterity==10||dexterity==11){
            this.dexterityMod=0;
        }

        else if(dexterity==12||dexterity==13){
            this.dexterityMod=1;
        }
        else if(dexterity==14||dexterity==15){
            this.dexterityMod=2;
        }
        else if(dexterity==16||dexterity==17){
            this.dexterityMod=3;
        }
        else if(dexterity==18||dexterity==19){
            this.dexterityMod=4;
        }
        else if(dexterity==20||dexterity==21){
            this.dexterityMod=5;
        }


        if(constitution==2||constitution==3){
            this.constitutionMod=-4;
        }
        else if(constitution==4||constitution==5){
            this.constitutionMod=-3;
        }
        else if(constitution==6||constitution==7){
            this.constitutionMod=-2;
        }
        else if(constitution==8||constitution==9){
            this.constitutionMod=-1;
        }
        else if(constitution==10||constitution==11){
            this.constitutionMod=0;
        }
        else if(constitution==12||constitution==13){
            this.constitutionMod=1;
        }
        else if(constitution==14||constitution==15){
            this.constitutionMod=2;
        }
        else if(constitution==16||constitution==17){
            this.constitutionMod=3;
        }
        else if(constitution==18||constitution==19){
            this.constitutionMod=4;
        }
        else if(constitution==20||constitution==21){
            this.constitutionMod=5;
        }
        if(intelligence==2||intelligence==3){
            this.intelligenceMod=-4;
        }
        else if(intelligence==4||intelligence==5){
            this.intelligenceMod=-3;
        }
        else if(intelligence==6||intelligence==7){
            this.intelligenceMod=-2;
        }
        else if(intelligence==8||intelligence==9){
            this.intelligenceMod=-1;
        }
        else if(intelligence==10||intelligence==11){
            this.intelligenceMod=0;
        }

        else if(intelligence==12||intelligence==13){
            this.intelligenceMod=1;
        }
        else if(intelligence==14||intelligence==15){
            this.intelligenceMod=2;
        }
        else if(intelligence==16||intelligence==17){
            this.intelligenceMod=3;
        }
        else if(intelligence==18||intelligence==19){
            this.intelligenceMod=4;
        }
        else if(intelligence==20||intelligence==21) {
            this.intelligenceMod = 5;
        }
        if (wisdom == 2 || wisdom == 3) {
            this.wisdomMod = -4;
        } else if (wisdom == 4 || wisdom == 5) {
            this.wisdomMod = -3;
        } else if (wisdom == 6 || wisdom == 7) {
            this.wisdomMod = -2;
        } else if (wisdom == 8 || wisdom == 9) {
            this.wisdomMod = -1;
        } else if (wisdom == 10 || wisdom == 11) {
            this.wisdomMod = 0;
        } else if (wisdom == 12 || wisdom == 13) {
            this.wisdomMod = 1;
        } else if (wisdom == 14 || wisdom == 15) {
            this.wisdomMod = 2;
        } else if (wisdom == 16 || wisdom == 17) {
            this.wisdomMod = 3;
        } else if (wisdom == 18 || wisdom == 19) {
            this.wisdomMod = 4;
        } else if (wisdom == 20 || wisdom == 21) {
            this.wisdomMod = 5;
        }
        if (charisma == 2 || charisma == 3) {
            charismaMod = -4;
        } else if (charisma == 4 || charisma == 5) {
            charismaMod = -3;
        } else if (charisma == 6 || charisma == 7) {
            charismaMod = -2;
        } else if (charisma == 8 || charisma == 9) {
            charismaMod = -1;
        } else if (charisma == 10 || charisma == 11) {
            charismaMod = 0;
        } else if (charisma == 12 || charisma == 13) {
            charismaMod = 1;
        } else if (charisma == 14 || charisma == 15) {
            charismaMod = 2;
        } else if (charisma == 16 || charisma == 17) {
            charismaMod = 3;
        } else if (charisma == 18 || charisma == 19) {
            charismaMod = 4;
        } else if (charisma == 20 || charisma == 21) {
            charismaMod = 5;
        }
    }
    public void ability(){
        if(race==0){
            this.strengthInc=strength+1;
            this.dexterityInc=dexterity+1;
            this.constitutionInc=constitution+1;
            this.wisdomInc=wisdom+1;
            this.intelligenceInc=intelligence+1;
            this.charismaInc=charisma+1;
        }
        else if(race==1){
            this.dexterityInc=dexterity+2;
        }
        else if(race==2){
            this.dexterityInc=dexterity+2;
        }
        else if(race==3){
            this.constitutionInc=constitution+2;
        }
    }


    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getConstitution() {
        return constitution;
    }

    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getCharisma() {
        return charisma;
    }



    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }


    public int getHealth() {

            return health;
        }


    public void setHealth(int health) {
        this.health = health;
    }

    public boolean isDead() {
        return isDead;
    }

    public void setDead(boolean isDead) {
        this.isDead = isDead;
    }

    public abstract void levelUp();

    public abstract void attack(Character c);

    public abstract String toString();

}





 //Fighter

class Fighter extends Character implements Race {

    public Fighter(String name, int seed) {

        super(name, seed);
    }

    public Fighter(String name, int level, int strength, int dexterity,int constitution, int intelligence, int wisdom,int charisma, int proficiencyMod, int health, boolean isDead, int race) {
        super(name, level, strength, dexterity, constitution, intelligence,wisdom, charisma, proficiencyMod, health, isDead, race);
    }

    public void attack(Character c) {

        if(isDead() == true) {
            System.out.println("Cannot attack a dead character");

        } else {


            setHealth(getHealth() - 10);
            setStrength(getStrength() - 10);
        }

    }

    public void levelUp() {


        setLevel(getLevel() + 1);


        setHealth(getLevel() * 5);


        setStrength(getStrength() + 2);


        setDexterity(getDexterity() + 1);
        setConstitution(getConstitution() + 1);
        setIntelligence(getIntelligence() + 1);
        setWisdom(getWisdom() + 1);
        setCharisma(getCharisma() + 1);


    }

    public String toString() {

        return ("Level " + getLevel() + " fighter named " + getName() +" with " + getStrength() + " strength, " + getDexterity() + " dexterity, " + getConstitution() + " constitution, " + getIntelligence() + " intelligence, " + getWisdom() + " wisdom and " + getCharisma() + " charisma");
    }

}



//Rouge

class Rogue extends Character implements Race{

    public Rogue(String name, int seed) {
        super(name, seed);
    }
    public Rogue(String name, int level, int strength, int dexterity,int constitution, int intelligence, int wisdom,int charisma, int proficiencyMod, int health, boolean isDead, int race) {
        super(name, level, strength, dexterity, constitution, intelligence,wisdom, charisma, proficiencyMod, health, isDead, race);
    }

    public void attack(Character c) {
        if(c.isDead()) {
            System.out.println("Cannot attack a dead character");
        }
        else {
            int current_health = c.getHealth();
            c.setHealth(current_health - (6 + c.getDexterity()));
        }
    }


    public void levelUp() {
        this.setLevel(getLevel() + 1);
        this.setHealth(5 * this.getLevel());
        this.setDexterity(this.getDexterity() + 3);
        this.setStrength(this.getStrength() + 2);
        this.setConstitution(this.getConstitution() + 2);
        this.setIntelligence(this.getIntelligence() + 2);
        this.setWisdom(this.getWisdom() + 2);
        this.setCharisma(this.getCharisma() + 2);
    }


    public String toString() {
        return "Level " + getLevel() + " fighter named " + getName() +
                " with " + getStrength() + " strength, " + getDexterity() +
                " dexterity, " + getConstitution() + " constitution, " + getIntelligence() +
                " intelligence, " + getWisdom() + " wisdom and " + getCharisma() + " charisma";
    }
}



//Wizard

class Wizard extends Character implements Race {
    public Wizard(String name, int seed) {
        super(name, seed);
    }

    public Wizard(String name, int level, int strength, int dexterity,int constitution, int intelligence, int wisdom,int charisma, int proficiencyMod, int health, boolean isDead, int race) {
        super(name, level, strength, dexterity, constitution, intelligence,wisdom, charisma, proficiencyMod, health, isDead, race);
    }



    public void attack(Character c) {
        if (c.isDead()) {
            System.out.println("Cannot attack a dead character");
        } else {
            c.setHealth(c.getHealth() - 4 + getIntelligence());
        }
    }


    public void levelUp() {
        setLevel(getLevel() + 1);
        setHealth(5 * getLevel());
        setIntelligence(getIntelligence() + 2);
        setWisdom(getWisdom() + 1);
        setStrength(getStrength() + 1);
        setDexterity(getDexterity() + 1);
        setCharisma(getCharisma() + 1);
    }




    public void multiAttack(Character[] c) {
        for (Character ch : c) {
            if (ch.isDead()) {
                System.out.println("Cannot damage a dead character");
            } else {
                ch.setHealth(ch.getHealth() - 2 + getIntelligence());
            }
        }
    }


    public String toString() {
        return "Level (" + getLevel() + ") ghter named (" + getName() + ") with (" + getStrength()
                + ") strength, (" + getDexterity() + ") dexterity, (" + getConstitution() + ") constitution, "
                + "(" + getIntelligence() + ") intelligence, (" + getWisdom() + ") wisdom and (" + getCharisma() + ") charisma";

    }

}



//Cleric

class Cleric extends Character implements Race {


    public Cleric(String name, int seed) {
        super(name, seed);
    }


    public Cleric(String name, int level, int strength, int dexterity,
                  int constitution, int intelligence, int wisdom,
                  int charisma, int proficiencyMod, int health, boolean isDead, int race) {
        super(name, level, strength, dexterity, constitution, intelligence, wisdom,
                charisma, proficiencyMod, health, isDead, race);
    }


    public void levelUp() {
        setLevel(getLevel() + 1);
        setHealth(5 * getLevel());
        setWisdom(getWisdom() + 2);
        setStrength(getStrength() + 1);
        setDexterity(getDexterity() + 1);
        setIntelligence(getIntelligence() + 1);
        setCharisma(getCharisma() + 1);
    }


    public void attack(Character c) {
        if (c.isDead()) {
            System.out.println("Cannot attack a dead character");
        } else {
            c.setHealth(c.getHealth() - 6 + getWisdom());
        }
    }


    public String toString() {
        return "Cleric [Name()=" + getName() + ", Level()=" + getLevel() + ", Strength()=" + getStrength()
                + ", Dexterity()=" + getDexterity() + ", Constitution()=" + getConstitution()
                + ", Intelligence()=" + getIntelligence() + ", getWisdom()=" + getWisdom() + ", Charisma()="
                + getCharisma() + "]";
    }


    public void heal(Character c) {
        if (c.isDead()) {
            System.out.println("Cannot heal a dead character");
        } else {
            int health = getHealth() + 6 + getWisdom();
            if (health < 5 * getLevel())
                setHealth(getHealth() + 6 + getWisdom());
            else
                setHealth(5 * getLevel());
        }
    }

}

