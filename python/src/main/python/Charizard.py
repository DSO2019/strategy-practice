from PokemonCharacter import *
from Flamethrower import *
from FireSpin import *


class Charizard(PokemonCharacter):
    def __init__(self):
        self.HIT_POINTS = 100
        self.DEFENSE_MULTIPLIER = 0.3
        self.flamethrower = Flamethrower()
        self.firespin = FireSpin()
        self.setType("fire")
        self.setName("Charizard")
        self.setHasEvolution(False)
        self.setSecondAttack(self.firespin.performAttack())
        self.setMainAttack(self.flamethrower.performAttack())
        self.setHitPoints(self.HIT_POINTS)
        self.setDefenseMultiplier(self.DEFENSE_MULTIPLIER)
        self.setMainAttackDamage(self.flamethrower.attackPower())
        self.setSecondAttackDamage(self.firespin.attackPower())

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

    def executeSecondAttack(self):
        attackMessage = "Attacking opponent with "
        attackMessage += self.getSecondAttack()
        attackMessage += " causing a damage of "
        attackMessage += str(self.getSecondAttackDamage())
        return attackMessage

    def executeMainAttack(self):
        attackMessage = "Attacking opponent with "
        attackMessage += self.getMainAttack()
        attackMessage += " causing a damage of "
        attackMessage += str(self.getMainAttackDamage())
        return attackMessage

    def setNewAttack(self, attack, attackDamage, newAttack):
        if (attack == 1):
            self.setMainAttack(newAttack)
            self.setMainAttackDamage(attackDamage)
        else:
            self.setSecondAttack(newAttack)
            self.setSecondAttackDamage(attackDamage)
