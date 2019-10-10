import unittest
from Charmeleon import *


class CharmeleonTest(unittest.TestCase):
    def setUp(self):
        self.charmeleon = Charmeleon()

    def test_firstAttack(self):
        self.assertEquals(
            "Attacking opponent with Lanzallamas causing a damage of 70",
            self.charmeleon.performMainAttack())

    def test_secondAttack(self):
        self.assertEquals(
            "Attacking opponent with Pirotecnia causing a damage of 70",
            self.charmeleon.performSecondAttack())

    def test_defend(self):
        self.assertEquals(
            "Defending attack, damage caused is 0 new HP is 65",
            self.charmeleon.defend(0))

    def test_name(self):
        self.assertEquals("Charmeleon", self.charmeleon.getName())

    def test_evolve(self):
        self.assertEquals(None, self.charmeleon.evolve())

    def test_type(self):
        self.assertEquals("Fuego", self.charmeleon.getType())

    def test_evolution(self):
        self.assertEquals(False, self.charmeleon.isHasEvolution())

    def test_getMain(self):
        self.assertEquals("Lanzallamas", self.charmeleon.getMainAttack())

    def test_getSecondary(self):
        self.assertEquals("Pirotecnia", self.charmeleon.getSecondAttack())

    def test_getMainDamage(self):
        self.assertEquals(70, self.charmeleon.getMainAttackDamage())

    def test_getSecondDamage(self):
        self.assertEquals(70, self.charmeleon.getSecondAttackDamage())

    def test_getMultiplier(self):
        self.assertEquals(0.6, self.charmeleon.getDefenseMultiplier())

    def test_getPoints(self):
        self.assertEquals(65, self.charmeleon.getHitPoints())
