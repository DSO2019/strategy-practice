import unittest
from Arceus import *


class ArceusTest(unittest.TestCase):
    def setUp(self):
        self.arceus = Arceus()

    def mainAttackTest(self):
        self.assertEquals(
            "Attacking opponent with Big Fire causing a damage of 17",
            self.arceus.mainAttack())

    def secondAttackTest(self):
        self.assertEquals(
            "Attacking opponent with Cosmic Power causing a damage of 25",
            self.arceus.secondAttack())

    def defendTest(self):
        self.assertEquals(
            "Defending attack, damage caused is 0 new HP is 120",
            self.arceus.defend(0))

    def getNameTest(self):
        self.assertEquals("Arceus", self.arceus.getName())

    def evolveTest(self):
        self.assertEquals(None, self.arceus.evolve())

    def typeTest(self):
        self.assertEquals("normal", self.arceus.getType())

    def hasEvolutionTest(self):
        self.assertEquals(True, self.arceus.isHasEvolution())


    def getMainAttackDamageTest(self):
        self.assertEquals(17, self.arceus.getMainAttackDamage())

    def getSecondAttackDamageTest(self):
        self.assertEquals(25, self.arceus.getSecondAttackDamage())

    def getDefenseMultiplierTest(self):
        self.assertEquals(0.7, self.arceus.getDefenseMultiplier())

    def getHitPointsTest(self):
        self.assertEquals(120, self.arceus.getHitPoints())