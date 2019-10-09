import unittest
from Mewtwo import *


class MewtwoTest(unittest.TestCase):
    def setUp(self):
        self.mewtwo = Mewtwo()

    def mainAttackTest(self):
        self.assertEquals(
            "Attacking opponent with Big Fire causing a damage of 17",
            self.mewtwo.mainAttack())

    def secondAttackTest(self):
        self.assertEquals(
            "Attacking opponent with Cosmic Power causing a damage of 25",
            self.mewtwo.secondAttack())

    def defendTest(self):
        self.assertEquals(
            "Defending attack, damage caused is 0 new HP is 105",
            self.mewtwo.defend(0))

    def getNameTest(self):
        self.assertEquals("Mewtwo", self.mewtwo.getName())

    def evolveTest(self):
        self.assertEquals(None, self.mewtwo.evolve())

    def typeTest(self):
        self.assertEquals("Psychic", self.mewtwo.getType())

    def hasEvolutionTest(self):
        self.assertEquals(True, self.mewtwo.isHasEvolution())


    def getMainAttackDamageTest(self):
        self.assertEquals(17, self.mewtwo.getMainAttackDamage())

    def getSecondAttackDamageTest(self):
        self.assertEquals(25, self.mewtwo.getSecondAttackDamage())

    def getDefenseMultiplierTest(self):
        self.assertEquals(0.6, self.mewtwo.getDefenseMultiplier())

    def getHitPointsTest(self):
        self.assertEquals(105, self.mewtwo.getHitPoints())