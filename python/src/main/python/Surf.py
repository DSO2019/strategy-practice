from Attack import *

class Surf(Attack):

    def __init__(self, damage = 80):
        self.damage = damage

    def performAttack(self):
        return "Surf"

    def getAttackDamage(self):
        return self.damage

    def setAttackDamage(self, damage):
        self.damage = damage