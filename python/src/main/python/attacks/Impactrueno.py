from Attack import *


class Impactrueno(Attack):

    def __init__(self, damage=5):
        self.damage = damage

    def performAttack(self):
        return "Impactrueno"

    def getAttackDamage(self):
        return self.damage

    def setAttackDamage(self, damage):
        self.damage = damage
