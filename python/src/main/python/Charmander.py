class Charmander(PokemonCharacter):

    def __init__(self):
        super().__init__()
        super().setType("Fire")
        super().setName("Charmander")
        super().setHasEvolution(True)
        super().setSecondAttack(Splash())
        super().setMainAttack(Ember())
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
        attackMessage = "Charmander {}".format(super().getMainAttack())
        return attackMessage

    def secondAttack(self):
        attackMessage = "Charmander {}".format(super().getSecondAttack())
        return attackMessage
    
    def setNewAttack(self, attack:int, newAttack:Attack):
        if(attack == 1):
            super().setMainAttack(newAttack)
        else:
            super().setSecondAttack(newAttack)