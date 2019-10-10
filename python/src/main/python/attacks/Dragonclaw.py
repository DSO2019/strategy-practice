from Attack import *


class Dragonclaw(Attack):

    def __init__(self, damage=85):
        self.damage = damage

    def performAttack(self):
        return "Dragonclaw"

    def getAttackDamage(self):
        return self.damage

    def setAttackDamage(self, damage):
        self.damage = damage
