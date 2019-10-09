import unittest
from Pikachu import *


class PikachuTest(unittest.TestCase):
    def setUp(self):
        self.pikachu = Pikachu()

    def mainAttackTest(self):
        self.assertEquals(
            "Attacking opponent with Quick Attack causing a damage of 5",
            self.pikachu.mainAttack())

    def secondAttackTest(self):
        self.assertEquals(
            "Attacking opponent with Impactrueno causing a damage of 15",
            self.pikachu.secondAttack())

    def defendTest(self):
        self.assertEquals(
            "Defending attack, damage caused is 0 new HP is 100",
            self.pikachu.defend(0))

    def getNameTest(self):
        self.assertEquals("Pikachu", self.pikachu.getName())

    def evolveTest(self):
        self.assertEquals(None, self.pikachu.evolve())

    def typeTest(self):
        self.assertEquals("electric", self.pikachu.getType())

    def hasEvolutionTest(self):
        self.assertEquals(True, self.pikachu.isHasEvolution())


    def getMainAttackDamageTest(self):
        self.assertEquals(5, self.pikachu.getMainAttackDamage())

    def getSecondAttackDamageTest(self):
        self.assertEquals(15, self.pikachu.getSecondAttackDamage())

    def getDefenseMultiplierTest(self):
        self.assertEquals(0.4, self.pikachu.getDefenseMultiplier())

    def getHitPointsTest(self):
        self.assertEquals(100, self.pikachu.getHitPoints())