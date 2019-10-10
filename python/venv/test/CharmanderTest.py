import unittest
from main.pokemon.Charmander import *

class CharmanderTests(unittest.TestCase):
    def setUp(self):
        self.charmander = Charmander()

    def test_firstAttack(self):
        self.assertEquals(
            "Attacking opponent with Firepunch causing a damage of 8",
            self.charmander.doMainAttack())

    def test_secondAttack(self):
        self.assertEquals(
            "Attacking opponent with tackle causing a damage of 6",
            self.charmander.doSecondAttack())

    def test_defend(self):
        self.assertEquals(
            "Defending attack, damage caused is 0 new HP is 100",
            self.charmander.defend(0))

    def test_name(self):
        self.assertEquals("Charmander", self.charmander.getName())

    def test_evolve(self):
        self.assertEquals(None, self.charmander.evolve())

    def test_type(self):
        self.assertEquals("fire", self.charmander.getType())

    def test_evolution(self):
        self.assertEquals(False, self.charmander.isHasEvolution())

    def test_getMain(self):
        self.assertEquals("firepunch", self.charmander.getMainAttack())

    def test_getSecondary(self):
        self.assertEquals("tackle", self.charmander.getSecondAttack())

    def test_getMainDamage(self):
        self.assertEquals(20, self.charmander.getMainAttackDamage())

    def test_getSecondDamage(self):
        self.assertEquals(15, self.charmander.getSecondAttackDamage())

    def test_getMultiplier(self):
        self.assertEquals(0.4, self.hey.getDefenseMultiplier())

    def test_getPoints(self):
        self.assertEquals(100, self.charmander.getHitPoints())