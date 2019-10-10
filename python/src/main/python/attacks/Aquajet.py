from Attack import *


class Aquajet(Attack):

    def __init__(self, damage=60):
        self.damage = damage

    def performAttack(self):
        return "Aquajet"

    def getAttackDamage(self):
        return self.damage

    def setAttackDamage(self, damage):
        self.damage = damage
