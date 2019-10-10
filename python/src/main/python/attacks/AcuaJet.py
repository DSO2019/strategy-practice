from Attack import *


class AcuaJet(Attack):

    def __init__(self, damage=45):
        self.damage = damage

    def performAttack(self):
        return "Acua Jet"

    def getAttackDamage(self):
        return self.damage

    def setAttackDamage(self, damage):
        self.damage = damage
