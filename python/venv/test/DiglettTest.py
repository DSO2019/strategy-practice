import unittest
from main.pokemon.Diglett import *

class CharmanderTests(unittest.TestCase):
    def setUp(self):
        self.diglett = Diglett()

    def test_firstAttack(self):
        self.assertEquals(
            "Attacking opponent with QuickAttack causing a damage of 8",
            self.diglett.doMainAttack())

    def test_secondAttack(self):
        self.assertEquals(
            "Attacking opponent with tackle causing a damage of 6",
            self.diglett.doSecondAttack())

    def test_defend(self):
        self.assertEquals(
            "Defending attack, damage caused is 0 new HP is 100",
            self.diglett.defend(0))

    def test_name(self):
        self.assertEquals("Diglett", self.diglett.getName())

    def test_evolve(self):
        self.assertEquals(None, self.diglett.evolve())

    def test_type(self):
        self.assertEquals("rock", self.diglett.getType())

    def test_evolution(self):
        self.assertEquals(False, self.diglett.isHasEvolution())

    def test_getMain(self):
        self.assertEquals("QuickAttack", self.diglett.getMainAttack())

    def test_getSecondary(self):
        self.assertEquals("Tackle", self.diglett.getSecondAttack())

    def test_getMainDamage(self):
        self.assertEquals(7, self.diglett.getMainAttackDamage())

    def test_getSecondDamage(self):
        self.assertEquals(6, self.diglett.getSecondAttackDamage())

    def test_getMultiplier(self):
        self.assertEquals(0.4, self.diglett.getDefenseMultiplier())

    def test_getPoints(self):
        self.assertEquals(100, self.diglett.getHitPoints())