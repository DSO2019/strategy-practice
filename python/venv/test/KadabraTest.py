import unittest
from main.pokemon.Kadabra import *

class CharmanderTests(unittest.TestCase):
    def setUp(self):
        self.kadabra = Kadabra()

    def test_firstAttack(self):
        self.assertEquals(
            "Attacking opponent with Firepunch causing a damage of 8",
            self.kadabra.doMainAttack())

    def test_secondAttack(self):
        self.assertEquals(
            "Attacking opponent with tackle causing a damage of 6",
            self.kadabra.doSecondAttack())

    def test_defend(self):
        self.assertEquals(
            "Defending attack, damage caused is 0 new HP is 100",
            self.kadabra.defend(0))

    def test_name(self):
        self.assertEquals("Kadabra", self.kadabra.getName())

    def test_evolve(self):
        self.assertEquals(None, self.kadabra.evolve())

    def test_type(self):
        self.assertEquals("psytic", self.kadabra.getType())

    def test_evolution(self):
        self.assertEquals(False, self.kadabra.isHasEvolution())

    def test_getMain(self):
        self.assertEquals("Firepunch", self.kadabra.getMainAttack())

    def test_getSecondary(self):
        self.assertEquals("Tackle", self.kadabra.getSecondAttack())

    def test_getMainDamage(self):
        self.assertEquals(8, self.kadabra.getMainAttackDamage())

    def test_getSecondDamage(self):
        self.assertEquals(6, self.kadabra.getSecondAttackDamage())

    def test_getMultiplier(self):
        self.assertEquals(0.4, self.kadabra.getDefenseMultiplier())

    def test_getPoints(self):
        self.assertEquals(100, self.kadabra.getHitPoints())