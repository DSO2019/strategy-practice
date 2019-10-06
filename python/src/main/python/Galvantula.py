from PokemonCharacter import PokemonCharacter
from Attack import Attack
from BugBuzz import BugBuzz
from ElectroWeb import ElectroWeb

class Galvantula(PokemonCharacter):

    def __init__(self):
        super().__init__()
        super().setType("bug/electric")
        super().setName("Galvantula")
        super().setHasEvolution(False)
        super().setSecondAttack(BugBuzz())
        super().setMainAttack(ElectroWeb())
        super().setHitPoints(77)
        super().setDefenseMultiplier(0.3)

    def evolve(self) -> str:
        return None

    def defend(self, attack:int) -> str:
        damage = int(attack * super().getDefenseMultiplier())
        newHP = super().getHitPoints() - damage
        defendMessage = "Defending attack, damage caused is {} new HP is {}".format(damage, newHP) 
        super().setHitPoints(newHP)
        return defendMessage
    
    def secondAttack(self) -> str:
        attackMessage = "Attacking opponent with {} causing a damage of {}".format(super().getSecondAttack(), super().getSecondAttackDamage())
        return attackMessage

    def mainAttack(self) -> str:
        attackMessage = "Attacking opponent with {} causing a damage of {}".format(super().getMainAttack(), super().getMainAttackDamage())
        return attackMessage
    
    def setNewAttack(self, attack:int, newAttack:Attack)->None:
        if(attack == 1):
            super().setMainAttack(newAttack)
        else:
            super().setSecondAttack(newAttack)