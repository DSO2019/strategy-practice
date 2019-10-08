import unittest
from Rotom import *


class RotomTests(unittest.TestCase):
    def setUp(self):
        self.rotom = Rotom()

    def test_firstAttack(self):
        self.assertEquals(
            "Attacking opponent with Surf causing a damage of 80",
            self.rotom.performMainAttack())

    def test_secondAttack(self):
        self.assertEquals(
            "Attacking opponent with Thunderbolt causing a damage of 90",
            self.rotom.performSecondAttack())

    def test_defend(self):
        self.assertEquals(
            "Defending attack, damage caused is 0 new HP is 100",
            self.rotom.defend(0))

    def test_name(self):
        self.assertEquals("Rotom", self.rotom.getName())

    def test_evolve(self):
        self.assertEquals(None, self.rotom.evolve())

    def test_type(self):
        self.assertEquals("electric water", self.rotom.getType())

    def test_evolution(self):
        self.assertEquals(False, self.rotom.isHasEvolution())

    def test_getMain(self):
        self.assertEquals("Surf", self.rotom.getMainAttack())

    def test_getSecondary(self):
        self.assertEquals("Thunderbolt", self.rotom.getSecondAttack())

    def test_getMainDamage(self):
        self.assertEquals(80, self.rotom.getMainAttackDamage())

    def test_getSecondDamage(self):
        self.assertEquals(90, self.rotom.getSecondAttackDamage())

    def test_getMultiplier(self):
        self.assertEquals(0.4, self.rotom.getDefenseMultiplier())

    def test_getPoints(self):
        self.assertEquals(100, self.rotom.getHitPoints())
