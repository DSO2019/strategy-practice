import abc

class PokemonCharacter():

    def __init__(self):
        self.name = None
        self.type = None
        self.hasEvolution = False
        self.mainAttack = None
        self.secondAttack = None
        self.deffenceMultiplier = 0
        self.hitPoints = 0

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
        return self.mainAttack.performAttack()

    def setMainAttack(self, newMainAttack):
        self.mainAttack = newMainAttack
    
    def getSecondAttack(self):
        return self.secondAttack.performAttack()

    def setSecondAttack(sel, newSecondAttack):
        self.secondAttack = newSecondAttack

    def getMainAttackDamage(self):
        return self.mainAttack.getAttackDamage()

    def setMainAttackDamage(self, newMainAttackDamage):
        self.mainAttack.setAttackDamage(newMainAttackDamage)

    def getSecondAttackDamage(self):
        return self.secondAttack.getAttackDamage()

    def setSecondAttackDamage(self, newSecondAttackDamage):
        self.secondAttack.setAttackDamage(newSecondAttackDamage)
    
    def getDefenseMultiplier(self):
        return self.deffenceMultiplier

    def setDeffenseMultiplier(self, newDeffenseMultiplier):
        self.deffenceMultiplier = newDeffenseMultiplier

    def getHitPoints(self):
        return self.hitPoints
    
    def setHitPoints(self, newHitPoints):
        self.hitPoints = newHitPoints