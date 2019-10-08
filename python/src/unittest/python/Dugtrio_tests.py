import unittest
from Dugtrio import *


class DugtrioTests(unittest.TestCase):
    def setUp(self):
        self.dugtrio = Dugtrio()

    def test_firstAttack(self):
        self.assertEquals(
            "Attacking opponent with Earthquake causing a damage of 80",
            self.dugtrio.performMainAttack())

    def test_secondAttack(self):
        self.assertEquals(
            "Attacking opponent with Dig causing a damage of 80",
            self.dugtrio.performSecondAttack())

    def test_defend(self):
        self.assertEquals(
            "Defending attack, damage caused is 0 new HP is 65",
            self.dugtrio.defend(0))

    def test_name(self):
        self.assertEquals("Dugtrio", self.dugtrio.getName())

    def test_evolve(self):
        self.assertEquals(None, self.dugtrio.evolve())

    def test_type(self):
        self.assertEquals("earth", self.dugtrio.getType())

    def test_evolution(self):
        self.assertEquals(False, self.dugtrio.isHasEvolution())

    def test_getMain(self):
        self.assertEquals("Earthquake", self.dugtrio.getMainAttack())

    def test_getSecondary(self):
        self.assertEquals("Dig", self.dugtrio.getSecondAttack())

    def test_getMainDamage(self):
        self.assertEquals(80, self.dugtrio.getMainAttackDamage())

    def test_getSecondDamage(self):
        self.assertEquals(80, self.dugtrio.getSecondAttackDamage())

    def test_getMultiplier(self):
        self.assertEquals(0.6, self.dugtrio.getDefenseMultiplier())

    def test_getPoints(self):
        self.assertEquals(65, self.dugtrio.getHitPoints())