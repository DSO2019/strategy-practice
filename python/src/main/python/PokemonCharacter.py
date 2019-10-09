class PokemonCharacter ():

    def __init__(self):
        self.name = None
        self.type = None
        self.hasEvolution = False
        self.mainAttack = None
        self.secondAttack = None
        self.defenseMultiplier = 0
        self.hitPoints = 0

    def getMainAttackBehavior():
        return self.mainAttack

    def getSecondAttackBehavior():
        return self.secondAttack

    def setMainAttackBehavior(self, ab):
        self.mainAttack = ab

    def setSecondaryAttackBehavior(self, ab2):
        self.secondAttack = ab2

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

    def getType(self):
        return self.type

    def setNewAttack(self, attack, newAttack):
        pass

    def setType(self, newType):
        self.type = newType

    def isHasEvolution(self):
        return self.hasEvolution

    def setHasEvolution(self, evolution):
        self.hasEvolution = evolution

    ################
    def getMainAttack(self):
        return self.mainAttack.getAttack()

    def getSecondAttack(self):
        return self.secondAttack.getAttack()

    def getMainAttackDamage(self):
        return self.mainAttack.getAttackDamage()

    def setMainAttackDamage(self, newMainAttackDamage):
        self.mainAttack.setAttackDamage(newMainAttackDamage)

    def getSecondAttackDamage(self):
        return self.secondAttack.getAttackDamage()

    def setSecondAttackDamage(self, newSecondAttackDamage):
        self.secondAttack.setAttackDamage(newSecondAttackDamage)
    ################

    def getDefenseMultiplier(self):
        return self.defenseMultiplier

    def setDefenseMultiplier(self, newDefenseMultiplier):
        self.defenseMultiplier = newDefenseMultiplier

    def getHitPoints(self):
        return self.hitPoints

    def setHitPoints(self, newHitPoints):
        self.hitPoints = newHitPoints
