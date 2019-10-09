import unittest
from Charmander import *


class CharmanderTest(unittest.TestCase):
    def setUp(self):
        self.charmander = Charmander()

    def mainAttackTest(self):
        self.assertEquals(
            "Attacking opponent with Small Fire causing a damage of 3",
            self.charmander.mainAttack())

    def secondAttackTest(self):
        self.assertEquals(
            "Attacking opponent with Big Fire causing a damage of 17",
            self.charmander.secondAttack())

    def defendTest(self):
        self.assertEquals(
            "Defending attack, damage caused is 0 new HP is 77",
            self.charmander.defend(0))

    def getNameTest(self):
        self.assertEquals("Charmander", self.charmander.getName())

    def evolveTest(self):
        self.assertEquals(None, self.charmander.evolve())

    def typeTest(self):
        self.assertEquals("fire", self.charmander.getType())

    def hasEvolutionTest(self):
        self.assertEquals(True, self.charmander.isHasEvolution())


    def getMainAttackDamageTest(self):
        self.assertEquals(3, self.charmander.getMainAttackDamage())

    def getSecondAttackDamageTest(self):
        self.assertEquals(17, self.charmander.getSecondAttackDamage())

    def getDefenseMultiplierTest(self):
        self.assertEquals(0.3, self.charmander.getDefenseMultiplier())

    def getHitPointsTest(self):
        self.assertEquals(77, self.charmander.getHitPoints())