from behaviors.attack.Attack import Attack

class ImpactTruenoAttack(Attack):
    attackName = "Impactrueno"
    attackDamage = 13
    
    def attack(self):
        return "Attacking opponent with " + self.attackName + " causing a damage of " + str(self.attackDamage)

    def setAttackDamage(self, newDmg):
        self.attackDamage = newDmg
    
    def getAttackDamage(self):
        return self.attackDamage
    
    def setAttackName(self, newAttackName):
        self.attackName = newAttackName

    def getAttackName(self):
        return self.attackName
