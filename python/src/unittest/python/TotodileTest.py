import unittest
from Totodile import *


class TotodileTests(unittest.TestCase):
    def setUp(self):
        self.totodile = Totodile()

    def test_firstAttack(self):
        self.assertEquals(
            "Attacking opponent with Aquajet causing a damage of 60",
            self.totodile.performMainAttack())

    def test_secondAttack(self):
        self.assertEquals(
            "Attacking opponent with Hydropump causing a damage of 70",
            self.totodile.performSecondAttack())

    def test_defend(self):
        self.assertEquals(
            "Defending attack, damage caused is 0 new HP is 100",
            self.totodile.defend(0))

    def test_name(self):
        self.assertEquals("Totodile", self.totodile.getName())

    def test_evolve(self):
        self.assertEquals(None, self.totodile.evolve())

    def test_type(self):
        self.assertEquals("water", self.totodile.getType())

    def test_evolution(self):
        self.assertEquals(False, self.totodile.isHasEvolution())

    def test_getMain(self):
        self.assertEquals("Aquajet", self.totodile.getMainAttack())

    def test_getSecondary(self):
        self.assertEquals("Hydropump", self.totodile.getSecondAttack())

    def test_getMainDamage(self):
        self.assertEquals(60, self.totodile.getMainAttackDamage())

    def test_getSecondDamage(self):
        self.assertEquals(70, self.totodile.getSecondAttackDamage())

    def test_getMultiplier(self):
        self.assertEquals(0.5, self.totodile.getDefenseMultiplier())

    def test_getPoints(self):
        self.assertEquals(100, self.totodile.getHitPoints())
