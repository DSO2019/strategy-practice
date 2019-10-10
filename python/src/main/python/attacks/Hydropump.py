from Attack import *


class Hydropump(Attack):

    def __init__(self, damage=70):
        self.damage = damage

    def performAttack(self):
        return "Hydropump"

    def getAttackDamage(self):
        return self.damage

    def setAttackDamage(self, damage):
        self.damage = damage
