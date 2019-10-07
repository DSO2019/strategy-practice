from Attack import *

class Dig(Attack):

    def __init__(self, damage = 80):
        self.damage = damage

    def performAttack(self):
        return "Dig"

    def getAttackDamage(self):
        return self.damage

    def setAttackDamage(self, damage):
        self.damage = damage