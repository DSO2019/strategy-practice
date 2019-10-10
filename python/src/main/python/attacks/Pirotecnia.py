from Attack import *


class Pirotecnia(Attack):

    def __init__(self, damage=70):
        self.damage = damage

    def performAttack(self):
        return "Pirotecnia"

    def getAttackDamage(self):
        return self.damage

    def setAttackDamage(self, damage):
        self.damage = damage
