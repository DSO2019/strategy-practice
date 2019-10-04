from PokemonCharacter import *
from Slam import *
from Impacthunder import *


class Pikachu(PokemonCharacter):
    def __init__(self):
        self.HIT_POINTS = 90
        self.DEFENSE_MULTIPLIER = 0.4
        self.slam = Slam()
        self.impacthunder = Impacthunder()
        self.setType("electric")
        self.setName("Pikachu")
        self.setHasEvolution(True)
        self.setSecondAttack(self.slam.performAttack())
        self.setMainAttack(self.impacthunder.performAttack())
        self.setHitPoints(self.HIT_POINTS)
        self.setDefenseMultiplier(self.DEFENSE_MULTIPLIER)
        self.setMainAttackDamage(self.impacthunder.attackPower())
        self.setSecondAttackDamage(self.slam.attackPower())

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
