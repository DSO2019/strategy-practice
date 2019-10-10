# Created by rvillalobos on 2/24/18.
import abc


class PokemonCharacter ():

    def __init__(self):
        self.name = None
        self.type = None
        self.hasEvolution = False
        self.mainAttack = None
        self.secondAttack = None
        self.mainAttackDamage = 0
        self.secondAttackDamage = 0
        self.defenseMultiplier = 0
        self.hitPoints = 0

    # Get pokemon name.
    def getName(self):
        return self.name

    def setName(self, newName):
        self.name = newName

    def evolve(self):
        pass

    def defend(self, attackDamage):
        pass

    def secondAttack(self):
        pass

    def mainAttack(self):
        pass

    def setNewAttack(self, attack, attackDamage, newAttack):
        pass

    def getType(self):
        return self.type

    def setType(self, newType):
        self.type = newType

    def isHasEvolution(self):
        return self.hasEvolution

    def setHasEvolution(self, evolution):
        self.hasEvolution = evolution

    def getMainAttack(self):
        return self.mainAttack

    def setMainAttack(self, newMainAttack):
        self.mainAttack = newMainAttack

    def getSecondAttack(self):
        return self.secondAttack

    def setSecondAttack(self, newSecondAttack):
        self.secondAttack = newSecondAttack

    def getMainAttackDamage(self):
        return self.mainAttackDamage

    def setMainAttackDamage(self, newMainAttackDamage):
        self.mainAttackDamage = newMainAttackDamage

    def getSecondAttackDamage(self):
        return self.secondAttackDamage

    def setSecondAttackDamage(self, newSecondAttackDamage):
        self.secondAttackDamage = newSecondAttackDamage

    def getDefenseMultiplier(self):
        return self.defenseMultiplier

    def setDefenseMultiplier(self, newDefenseMultiplier):
        self.defenseMultiplier = newDefenseMultiplier

    def getHitPoints(self):
        return self.hitPoints

    def setHitPoints(self, newHitPoints):
        self.hitPoints = newHitPoints
