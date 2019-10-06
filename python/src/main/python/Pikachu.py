class Pikachu(PokemonCharacter):

    def __init__(self):
        super().__init__()
        super().setType("Electric")
        super().setName("Pikachu")
        super().setHasEvolution(True)
        super().setSecondAttack(Harden())
        super().setMainAttack(Splash())
        super().setHitPoints(77)
        super().setDefenseMultiplier(0.3)

    def evolve(self):
        return None

    def defend(self, attack):
        damage = int(attack * super().getDefenseMultiplier())
        newHP = super().getHitPoints() - damage
        defendMessage = "Defending attack, damage caused is {} new HP is {}".format(damage, newHP) 
        super().setHitPoints(newHP)
        return defendMessage
    
    def mainAttack(self):
        attackMessage = "Pikachu {}".format(super().getMainAttack())
        return attackMessage

    def secondAttack(self):
        attackMessage = "Pikachu {}".format(super().getSecondAttack())
        return attackMessage
 
    def setNewAttack(self, attack:int, newAttack:Attack):
        if(attack == 1):
            super().setMainAttack(newAttack)
        else:
            super().setSecondAttack(newAttack)