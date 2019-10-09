import unittest
from Lucario import *


class LucarioTest(unittest.TestCase):
    def setUp(self):
        self.lucario = Lucario()

    def mainAttackTest(self):
        self.assertEquals(
            "Attacking opponent with Small Fire causing a damage of 3",
            self.lucario.mainAttack())

    def secondAttackTest(self):
        self.assertEquals(
            "Attacking opponent with Quick Attack causing a damage of 5",
            self.lucario.secondAttack())

    def defendTest(self):
        self.assertEquals(
            "Defending attack, damage caused is 0 new HP is 77",
            self.lucario.defend(0))

    def getNameTest(self):
        self.assertEquals("Lucario", self.lucario.getName())

    def evolveTest(self):
        self.assertEquals(None, self.lucario.evolve())

    def typeTest(self):
        self.assertEquals("fighter", self.lucario.getType())

    def hasEvolutionTest(self):
        self.assertEquals(True, self.lucario.isHasEvolution())


    def getMainAttackDamageTest(self):
        self.assertEquals(3, self.lucario.getMainAttackDamage())

    def getSecondAttackDamageTest(self):
        self.assertEquals(5, self.lucario.getSecondAttackDamage())

    def getDefenseMultiplierTest(self):
        self.assertEquals(0.3, self.lucario.getDefenseMultiplier())

    def getHitPointsTest(self):
        self.assertEquals(77, self.lucario.getHitPoints())