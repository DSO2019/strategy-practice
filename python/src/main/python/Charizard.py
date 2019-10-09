from PokemonCharacter import *
from QuickAttackBehavior import *
from SmallFireBehavior import *


class Charizard(PokemonCharacter):
    def __init__(self):
        self.HIT_POINTS = 77
        self.DEFENSE_MULTIPLIER = 0.3
        self.QuickAttackBehavior = QuickAttackBehavior()
        self.SmallFireBehavior = SmallFireBehavior()
        self.setType("fire")
        self.setName("Charizard")
        self.setSecondaryAttackBehavior(self.QuickAttackBehavior)
        self.setMainAttackBehavior(self.SmallFireBehavior)
        self.setHasEvolution(True)
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

    def secondAttack(self):
        return self.getSecondAttackBehavior().attack()

    def mainAttack(self):
        return self.getMainAttackBehavior().attack()

    def setNewAttack(self, attack, newAttack):
        if (attack == 1):
            self.setMainAttack(newAttack)
        else:
            self.setSecondAttack(newAttack)