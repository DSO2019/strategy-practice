class PokemonCharacter ():

    def __init__(self):
        self.name = None
        self.type = None
        self.hasEvolution = False
        self.defenseMultiplier = 0
        self.hitPoints = 0
        self.mainAttack = None
        self.secondAttack = None

    def __call__(self):
        return self

    def setMainAttack(self, mainAttack):
        self.mainAttack = mainAttack

    def setSecondAttack(self, secondAttack):
        self.secondAttack = secondAttack

    def getName(self):
        return self.name

    def setName(self, newName):
        self.name = newName

    def evolve(self):
        pass

    def defend(self, attackDamage):
        pass

    def getType(self):
        return self.type

    def funSecondAttack(self):
        pass

    def funMainAttack(self):
        pass

    def setNewAttack(self, attack, newAttack):
        pass

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
        return self.mainAttack.getAttackDamage()

    def setMainAttackDamage(self, newMainAttackDamage):
        self.mainAttack.setAttackDamage(newMainAttackDamage)

    def getSecondAttackDamage(self):
        return self.secondAttack.getAttackDamage()

    def setSecondAttackDamage(self, newSecondAttackDamage):
        self.secondAttack.setAttackDamage(newSecondAttackDamage)

    def getDefenseMultiplier(self):
        return self.defenseMultiplier

    def setDefenseMultiplier(self, newDefenseMultiplier):
        self.defenseMultiplier = newDefenseMultiplier

    def getHitPoints(self):
        return self.hitPoints

    def setHitPoints(self, newHitPoints):
        self.hitPoints = newHitPoints
