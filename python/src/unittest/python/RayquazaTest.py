import unittest
from Rayquaza import *


class RayquazaTest(unittest.TestCase):
    def setUp(self):
        self.rayquaza = Rayquaza()

    def test_firstAttack(self):
        self.assertEquals(
            "Attacking opponent with Dragonbreath causing a damage of 110",
            self.rayquaza.performMainAttack())

    def test_secondAttack(self):
        self.assertEquals(
            "Attacking opponent with Dragonclaw causing a damage of 85",
            self.rayquaza.performSecondAttack())

    def test_defend(self):
        self.assertEquals(
            "Defending attack, damage caused is 0 new HP is 75",
            self.rayquaza.defend(0))

    def test_name(self):
        self.assertEquals("Rayquaza", self.rayquaza.getName())

    def test_evolve(self):
        self.assertEquals(None, self.rayquaza.evolve())

    def test_type(self):
        self.assertEquals("dragon", self.rayquaza.getType())

    def test_evolution(self):
        self.assertEquals(False, self.rayquaza.isHasEvolution())

    def test_getMain(self):
        self.assertEquals("Dragonbreath", self.rayquaza.getMainAttack())

    def test_getSecondary(self):
        self.assertEquals("Dragonclaw", self.rayquaza.getSecondAttack())

    def test_getMainDamage(self):
        self.assertEquals(110, self.rayquaza.getMainAttackDamage())

    def test_getSecondDamage(self):
        self.assertEquals(85, self.rayquaza.getSecondAttackDamage())

    def test_getMultiplier(self):
        self.assertEquals(0.4, self.rayquaza.getDefenseMultiplier())

    def test_getPoints(self):
        self.assertEquals(75, self.rayquaza.getHitPoints())
