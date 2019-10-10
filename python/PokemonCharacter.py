from abc import ABC, abstractmethod


class PokemonCharacter(ABC):
    name = None
    type = None
    hasEvolution = False
    mainAttack = None
    secondAttack = None
    mainAttackDamage = 0
    secondAttackDamage = 0
    defenseMultiplier = 0
    hitPoints = 0

    def getName(self):
        return self.name

    def setName(self, newName):
        self.name = newName

    def evolve(self):
        pass

    def defend(self):
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

    def setSecondAttack(self, newSecondAttack):
        self.secondAttack = newSecondAttack

    def getSecondAttack(self):
        return self.secondAttack

    def getMainAttackDamage(self):
        return self.mainAttackDamage

    def setMainAttackDamage(self, damage):
        self.mainAttackDamage = damage

    def getSecondAttackDamage(self):
        return self.secondAttackDamage

    def setSecondAttackDamage(self, damage):
        self.secondAttackDamage = damage

    def getDefenseMultiplier(self):
        return self.defenseMultiplier

    def setDefenseMultiplier(self, multiplier):
        self.defenseMultiplier = multiplier

    def getHitPoints(self):
        return self.hitPoints

    def setHitPoints(self, hitPoints):
        self.hitPoints = hitPoints
