import abc

class PokemonCharacter ():

    def __init__(self):
        self.name = None
        self.type = None
        self.hasEvolution = False
        self.mainAttack = None
        self.secondAttack = None
        self.defenseMultiplier = 0
        self.hitPoints = 0

    # Get name.
    def getName(self):
        return self.name

    # Set name.
    def setName(self, newName):
        self.name = arg

    #Evolve?.
    def evolve(self):
        pass
    #get defense.
    def defend(self, attackDamage):
        pass

    #Main attack.
    def mainAttack(self):
        pass

    #Second attack.
    def secondAttack(self):
        pass

    #Set new Attack.
    def setNewAttack(self, attack, attackDamage, newAttack):
        pass

    #get Type.
    def getType(self):
        return self.type

    #Set Type.
    def setType(self, arg):
        self.type = arg

    #Ask for evo.
    def isHasEvolution(self):
        return self.hasEvolution

    #Set evo.
    def setHasEvolution(self, arg):
        self.hasEvolution = arg

    #Getter main attack.
    def getMainAttack(self):
        return self.mainAttack

    #Setter main attack.
    def setMainAttack(self, arg):
        self.mainAttack = arg

    #Getter seond attack.
    def getSecondAttack(self):
        return self.secondAttack

    #Setter second attack.
    def setSecondAttack(self, arg):
        self.secondAttack = arg

    #Getter main att dmg.
    def getMainAttackDamage(self):
        return self.mainAttackDamage

    # Seter main att dmg.
    def setMainAttackDamage(self, arg):
        self.mainAttackDamage = arg

    # Getter second att dmg.
    def getSecondAttackDamage(self):
        return self.secondAttackDamage

    # Getter second att dmg.
    def setSecondAttackDamage(self, arg):
        self.secondAttackDamage = arg

    #Getter defense multiplier.
    def getDefenseMultiplier(self):
        return self.defenseMultiplier

    #Setter defense multiplier.
    def setDefenseMultiplier(self, arg):
        self.defenseMultiplier = arg

    #Get HP
    def getHitPoints(self):
        return self.hitPoints

    #Set HP
    def setHitPoints(self, arg):
        self.hitPoints = arg