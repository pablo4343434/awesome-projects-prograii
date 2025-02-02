package main;
public class Potions extends Equipment {

    public boolean berserkActive = false;
    public boolean healthActive = false;
    public boolean rockActive = false;
    public boolean eyeActive = false;
    public boolean twitterActive = false;
    public Potions(String name, int cuantity) {
        super(name, cuantity);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCuantity(int cuantity) {
        this.cuantity = cuantity;
    }
    public boolean activateberserkPotion() {
        return this.berserkActive = true;
    }
    public boolean deactivateberserkPotion() {
        return this.berserkActive = false;
    }
    public boolean activatehealthPotion() {
        return this.healthActive = true;
    }
    public boolean deactivatehealthPotion() {
        return this.healthActive = false;
    }
    public boolean activaterockPotion() {
        return this.rockActive = true;
    }
    public boolean deactivaterockPotion() {
        return this.rockActive = false;
    }
    public boolean activateeyePotion() {
        return this.eyeActive = true;
    }
    public boolean deactivateeyePotion() {
        return this.eyeActive = false;
    }
    public boolean activatetwitterPotion() {
        return this.twitterActive = true;
    }
    public boolean deactivatetwitterPotion() {
        return this.twitterActive = false;
    }

    public String getName() {
        return this.name;
    }

    public double getCuantity() {
        return this.cuantity;
    }

    //cambiar precision
    public void berserkPotion(Warrior character) {
        activateberserkPotion();
        boolean berserkActive = true;
        double health = character.getHealth()*1.5;
        character.setHealth(health);
        double berserkPotion = this.cuantity-1;
        double counter1 = 0;
        System.out.println("You have used a Berserk Potion, your stats are: "+ "Health: "+ character.getHealth());
        while (counter1 <=3){
            counter1++;
            System.out.println("You feel the effects of the potion fading away...");
        }
        if (counter1 ==3){
            deactivateberserkPotion();
            character.setHealth(health-20);
            System.out.println("The effects of the potion have faded away, your stats are now: "+ "Health: "+ character.getHealth());
        }
    }
    public void healthPotion(Warrior character) {
        activatehealthPotion();
        double health = character.getHealth()+10;
        character.setHealth(health);
        double healthPotion = this.cuantity-1;
        double counter = 0;
        System.out.println("You have used a Health Potion on " + character.getName()+ "and now his health is: "+ character.getHealth());
        while (counter <=3){
            counter++;
            System.out.println("You feel the effects of the potion fading away...");
        }
        if (counter ==3){
            if (health !=0){
                deactivatehealthPotion();
                character.setHealth(health+20);
                System.out.println("The effects of the potion have faded away, your health is now: "+ character.getHealth());
            }else {
                System.out.println("You are dead, the effects of the potion won't work on you.");
            }
        }

    }
    public void rockSolid(Warrior character) {
        activaterockPotion();
        double counter = 0;
        double health = character.getHealth();
        while (counter <=3){
            counter++;
            System.out.println("You feel the effects of the potion fading away...");
        }
        if(counter ==3){
            if (health !=0){
                deactivaterockPotion();;
                System.out.println("The effects of the potion have faded away, your health is now: "+ character.getHealth());
            }else {
                System.out.println("You are dead, the effects of the potion won't work on you.");
            }
        }

    }
    public void seagullEye(Warrior character) {
        activateeyePotion();
        double accuracy = (double) (character.getAccuracy()+(character.getAccuracy()*0.25));
        character.setAccuracy(accuracy);
        double accuracyPotion = this.cuantity-1;
        double counter = 0;
        double health = character.getHealth()+10;
        System.out.println("You have used a Accuracy Potion on " + character.getName()+ "and now his accuracy is: "+ character.getAccuracy());
        while (counter <=3){
            counter++;
            System.out.println("You feel the effects of the potion fading away...");
        }
        if (counter ==3){
            if (health !=0){
                deactivateeyePotion();
                character.setAccuracy((double) (accuracy-(character.getAccuracy()*0.25)));
                System.out.println("The effects of the potion have faded away, your accuracy is now: "+ character.getAccuracy());
            }else {
                System.out.println("You are dead, the effects of the potion won't work on you.");
            }
        }

    }
    public void twitterEssence(Warrior character){
        activatetwitterPotion();
        double attack = character.getAttack()+8;
        character.setAttack(attack);
        double attackPotion = this.cuantity-1;
        double counter = 0;
        double health = character.getHealth();
        System.out.println("You have used a Attack Potion on " + character.getName()+ "and now his attack is: "+ character.getAttack());
        while (counter <=2){
            counter++;
            System.out.println("You feel the effects of the potion fading away...");
        }
        if (counter ==2){
            if (health !=0){
                deactivatetwitterPotion();
                character.setAttack(attack-8);
                System.out.println("The effects of the potion have faded away, your attack is now: "+ character.getAttack());
            }else {
                System.out.println("You are dead, the effects of the potion won't work on you.");
            }
        }
    }
}

