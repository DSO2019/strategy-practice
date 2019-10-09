from behaviors.attack.QuickAttack import QuickAttack
from behaviors.attack.ImpactTruenoAttack import ImpactTruenoAttack
from characters.PokemonCharacter import PokemonCharacter


class Pikachu(PokemonCharacter):

    def __init__(self):
        self.HIT_POINTS = 100
        self.DEFENSE_MULTIPLIER = 0.4

        self.setType("electric")
        self.setName("Pikachu")
        self.setHasEvolution(True)
        self.setSecondAttack(ImpactTruenoAttack())
        self.setMainAttack(QuickAttack())
        self.setHitPoints(self.HIT_POINTS)
        self.setDefenseMultiplier(self.DEFENSE_MULTIPLIER)

    def evolve(self):
        return None

    def defend(self, attack):
        damage = (attack * self.getDefenseMultiplier())
        newHP = self.getHitPoints() - damage
        self.setHitPoints(newHP)
        string = "Defending attack, damage caused is "
        string += str(int(damage))
        string += " new HP is "
        string += str(int(newHP))
        return string

    def funSecondAttack(self):
        return self.getSecondAttack().attack()

    def funMainAttack(self):
        return self.getMainAttack().attack()

    def setNewAttack(self, attack, newAttack):
        if (attack == 1):
            self.setMainAttack(newAttack)
        else:
            self.setSecondAttack(newAttack)
