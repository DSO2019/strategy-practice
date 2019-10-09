import unittest
from Charizard import *


class CharizardTest(unittest.TestCase):
    def setUp(self):
        self.charizard = Charizard()

    def mainAttackTest(self):
        self.assertEquals(
            "Attacking opponent with Small Fire causing a damage of 3",
            self.charizard.mainAttack())

    def secondAttackTest(self):
        self.assertEquals(
            "Attacking opponent with Quick Attack causing a damage of 5",
            self.charizard.secondAttack())

    def defendTest(self):
        self.assertEquals(
            "Defending attack, damage caused is 0 new HP is 77",
            self.charizard.defend(0))

    def getNameTest(self):
        self.assertEquals("Charizard", self.charizard.getName())

    def evolveTest(self):
        self.assertEquals(None, self.charizard.evolve())

    def typeTest(self):
        self.assertEquals("fire", self.charizard.getType())

    def hasEvolutionTest(self):
        self.assertEquals(True, self.charizard.isHasEvolution())


    def getMainAttackDamageTest(self):
        self.assertEquals(3, self.charizard.getMainAttackDamage())

    def getSecondAttackDamageTest(self):
        self.assertEquals(5, self.charizard.getSecondAttackDamage())

    def getDefenseMultiplierTest(self):
        self.assertEquals(0.3, self.charizard.getDefenseMultiplier())

    def getHitPointsTest(self):
        self.assertEquals(77, self.charizard.getHitPoints())