from Attack import *

class Thunderbolt(Attack):

    def __init__(self, damage = 90):
        self.damage = damage

    def performAttack(self):
        return "Thunderbolt"

    def getAttackDamage(self):
        return self.damage

    def setAttackDamage(self, damage):
        self.damage = damage