import unittest
from Blastoise import *


class BlastoiseTests(unittest.TestCase):
    def setUp(self):
        self.blastoise = Blastoise()

    def test_firstAttack(self):
        self.assertEquals(
            "Attacking opponent with Shower causing a damage of 20",
            self.blastoise.executeMainAttack())

    def test_secondAttack(self):
        self.assertEquals(
            "Attacking opponent with Slam causing a damage of 15",
            self.blastoise.executeSecondAttack())

    def test_defend(self):
        self.assertEquals(
            "Defending attack, damage caused is 0 new HP is 100",
            self.blastoise.defend(0))

    def test_name(self):
        self.assertEquals("Blastoise", self.blastoise.getName())

    def test_evolve(self):
        self.assertEquals(None, self.blastoise.evolve())

    def test_type(self):
        self.assertEquals("water", self.blastoise.getType())

    def test_evolution(self):
        self.assertEquals(False, self.blastoise.isHasEvolution())

    def test_getMain(self):
        self.assertEquals("Shower", self.blastoise.getMainAttack())

    def test_getSecondary(self):
        self.assertEquals("Slam", self.blastoise.getSecondAttack())

    def test_getMainDamage(self):
        self.assertEquals(20, self.blastoise.getMainAttackDamage())

    def test_getSecondDamage(self):
        self.assertEquals(15, self.blastoise.getSecondAttackDamage())

    def test_getMultiplier(self):
        self.assertEquals(0.4, self.blastoise.getDefenseMultiplier())

    def test_getPoints(self):
        self.assertEquals(100, self.blastoise.getHitPoints())
