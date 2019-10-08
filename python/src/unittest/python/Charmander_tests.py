import unittest
from Charmander import *


class CharmanderTests(unittest.TestCase):
    def setUp(self):
        self.charmander = Charmander()

    def test_firstAttack(self):
        self.assertEquals(
            "Attacking opponent with Dig causing a damage of 80",
            self.charmander.performMainAttack())

    def test_secondAttack(self):
        self.assertEquals(
            "Attacking opponent with Earthquake causing a damage of 80",
            self.charmander.performSecondAttack())

    def test_defend(self):
        self.assertEquals(
            "Defending attack, damage caused is 0 new HP is 65",
            self.charmander.defend(0))

    def test_name(self):
        self.assertEquals("Charmander", self.charmander.getName())

    def test_evolve(self):
        self.assertEquals(None, self.charmander.evolve())

    def test_type(self):
        self.assertEquals("fire", self.charmander.getType())

    def test_evolution(self):
        self.assertEquals(True, self.charmander.isHasEvolution())

    def test_getMain(self):
        self.assertEquals("Dig", self.charmander.getMainAttack())

    def test_getSecondary(self):
        self.assertEquals("Earthquake", self.charmander.getSecondAttack())

    def test_getMainDamage(self):
        self.assertEquals(80, self.charmander.getMainAttackDamage())

    def test_getSecondDamage(self):
        self.assertEquals(80, self.charmander.getSecondAttackDamage())

    def test_getMultiplier(self):
        self.assertEquals(0.6, self.charmander.getDefenseMultiplier())

    def test_getPoints(self):
        self.assertEquals(65, self.charmander.getHitPoints())