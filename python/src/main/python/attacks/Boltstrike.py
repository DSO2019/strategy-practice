from Attack import *


class Boltstrike(Attack):

    def __init__(self, damage=90):
        self.damage = damage

    def performAttack(self):
        return "Boltstrike"

    def getAttackDamage(self):
        return self.damage

    def setAttackDamage(self, damage):
        self.damage = damage
