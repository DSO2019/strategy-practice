from mockito import mock, verify, when
import unittest
from characters.Squirtle import Squirtle


class Squirtle_test(unnitest.TestCase):
    def setUp(self):
        self.character = Squirtle()

    def test_mainAttack(self):
        self.assertEqual(
            "Attacking opponent with Small Fire causing a damage of 7",
            self.character.funMainAttack())

    def test_secondAttack(self):
        self.assertEqual(
            "Attacking opponent with Big Fire causing a damage of 13",
            self.character.funSecondAttack())

    def test_defend(self):
        self.assertEqual(
            "Defending attack, damage caused is 1 new HP is 76",
            self.character.defend(5))

    def test_getName(self):
        self.assertEqual("Bulbasur", self.character.getName())

    def test_evolve(self):
        self.assertEqual(None, self.character.evolve())

    def test_type(self):
        self.assertEqual("planta", self.character.getType())

    def test_hasEvolution(self):
        self.assertEqual(False, self.character.isHasEvolution())

    def test_getMainAttackDamage(self):
        self.assertEqual(7, self.character.getMainAttackDamage())

    def test_getSecondAttackDamage(self):
        self.assertEqual(13, self.character.getSecondAttackDamage())

    def test_getHitPoints(self):
        self.assertEqual(77, self.character.getHitPoints())

    def test_getDefenseMultiplier(self):
        self.assertEqual(0.3, self.character.getDefenseMultiplier(), 0.0)
