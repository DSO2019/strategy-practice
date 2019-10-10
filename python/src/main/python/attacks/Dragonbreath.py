from Attack import *


class Dragonbreath(Attack):

    def __init__(self, damage=110):
        self.damage = damage

    def performAttack(self):
        return "Dragonbreath"

    def getAttackDamage(self):
        return self.damage

    def setAttackDamage(self, damage):
        self.damage = damage
