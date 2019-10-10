from PokemonCharacter import *
from Hojaafilada import *
from Latigocepa import *


class Venusaur(PokemonCharacter):
    def __init__(self):
        self.HIT_POINTS = 150
        self.DEFENSE_MULTIPLIER = 0.4
        self.confusion = Confusion()
        self.confusion = Confusion()
        self.setType("hoja")
        self.setName("Venusaur")
        self.setHasEvolution(False)
        self.setSecondAttack(self.Confusion.atacaprro())
        self.setMainAttack(self.Latigocepa.atacaprro())
        self.setHitPoints(self.HIT_POINTS)
        self.setDefenseMultiplier(self.DEFENSE_MULTIPLIER)
        self.setMainAttackDamage(self.Confusion.attackPower())
        self.setSecondAttackDamage(self.Latigocepa.attackPower())

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
        mensajeparaatacar = "Attacking opponent with "
        mensajeparaatacar += self.getSecondAttack()
        mensajeparaatacar += " causing a damage of "
        mensajeparaatacar += str(self.getSecondAttackDamage())
        return mensajeparaatacar

    def executeMainAttack(self):
        mensajeparaatacar = "Attacking opponent with "
        mensajeparaatacar += self.getMainAttack()
        mensajeparaatacar += " causing a damage of "
        mensajeparaatacar += str(self.getMainAttackDamage())
        return mensajeparaatacar

    def setNewAttack(self, attack, attackDamage, newAttack):
        if (attack == 1):
            self.setMainAttack(newAttack)
            self.setMainAttackDamage(attackDamage)
        else:
            self.setSecondAttack(newAttack)
            self.setSecondAttackDamage(attackDamage)