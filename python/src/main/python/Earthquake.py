from Attack import *


class Earthquake(Attack):

    def __init__(self, damage=80):
        self.damage = damage

    def performAttack(self):
        return "Earthquake"

    def getAttackDamage(self):
        return self.damage

    def setAttackDamage(self, damage):
        self.damage = damage
