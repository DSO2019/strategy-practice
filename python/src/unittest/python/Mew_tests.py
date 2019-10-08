import unittest
from Mew import *


class MewTests(unittest.TestCase):
    def setUp(self):
        self.mew = Mew()

    def test_firstAttack(self):
        self.assertEquals(
            "Attacking opponent with Psychic causing a damage of 80",
            self.mew.performMainAttack())

    def test_secondAttack(self):
        self.assertEquals(
            "Attacking opponent with Surf causing a damage of 80",
            self.mew.performSecondAttack())

    def test_defend(self):
        self.assertEquals(
            "Defending attack, damage caused is 0 new HP is 100",
            self.mew.defend(0))

    def test_name(self):
        self.assertEquals("Mew", self.mew.getName())

    def test_evolve(self):
        self.assertEquals(None, self.mew.evolve())

    def test_type(self):
        self.assertEquals("psychic", self.mew.getType())

    def test_evolution(self):
        self.assertEquals(False, self.mew.isHasEvolution())

    def test_getMain(self):
        self.assertEquals("Psychic", self.mew.getMainAttack())

    def test_getSecondary(self):
        self.assertEquals("Surf", self.mew.getSecondAttack())

    def test_getMainDamage(self):
        self.assertEquals(80, self.mew.getMainAttackDamage())

    def test_getSecondDamage(self):
        self.assertEquals(80, self.mew.getSecondAttackDamage())

    def test_getMultiplier(self):
        self.assertEquals(0.5, self.mew.getDefenseMultiplier())

    def test_getPoints(self):
        self.assertEquals(100, self.mew.getHitPoints())
