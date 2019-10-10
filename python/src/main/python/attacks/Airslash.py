from Attack import *


class Airslash(Attack):

    def __init__(self, damage=100):
        self.damage = damage

    def performAttack(self):
        return "Airslash"

    def getAttackDamage(self):
        return self.damage

    def setAttackDamage(self, damage):
        self.damage = damage
