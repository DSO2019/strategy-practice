import unittest
from Lugia import *


class LugiaTest(unittest.TestCase):
    def setUp(self):
        self.lugia = Lugia()

    def test_firstAttack(self):
        self.assertEquals(
            "Attacking opponent with Airslash causing a damage of 100",
            self.lugia.performMainAttack())

    def test_secondAttack(self):
        self.assertEquals(
            "Attacking opponent with Aeroblast causing a damage of 80",
            self.lugia.performSecondAttack())

    def test_defend(self):
        self.assertEquals(
            "Defending attack, damage caused is 0 new HP is 65",
            self.lugia.defend(0))

    def test_name(self):
        self.assertEquals("Lugia", self.lugia.getName())

    def test_evolve(self):
        self.assertEquals(None, self.lugia.evolve())

    def test_type(self):
        self.assertEquals("air", self.lugia.getType())

    def test_evolution(self):
        self.assertEquals(False, self.lugia.isHasEvolution())

    def test_getMain(self):
        self.assertEquals("Airslash", self.lugia.getMainAttack())

    def test_getSecondary(self):
        self.assertEquals("Aeroblast", self.lugia.getSecondAttack())

    def test_getMainDamage(self):
        self.assertEquals(100, self.lugia.getMainAttackDamage())

    def test_getSecondDamage(self):
        self.assertEquals(80, self.lugia.getSecondAttackDamage())

    def test_getMultiplier(self):
        self.assertEquals(0.6, self.lugia.getDefenseMultiplier())

    def test_getPoints(self):
        self.assertEquals(65, self.lugia.getHitPoints())
