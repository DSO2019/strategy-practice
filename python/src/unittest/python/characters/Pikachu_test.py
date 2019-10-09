from mockito import mock, verify, when
import unittest
from characters.Pikachu import Pikachu


class Pikachu_test(unnitest.TestCase):
    def setUp(self):
        self.character = Pikachu()

    def test_mainAttack(self):
        self.assertEqual(
            "Attacking opponent with Quick Attack causing a damage of 6",
            self.character.funMainAttack())

    def test_secondAttack(self):
        self.assertEqual(
            "Attacking opponent with Impactrueno causing a damage of 13",
            self.character.funSecondAttack())

    def test_defend(self):
        self.assertEqual(
            "Defending attack, damage caused is 0 new HP is 100",
            self.character.defend(5))

    def test_getName(self):
        self.assertEqual("Pikachu", self.character.getName())

    def test_evolve(self):
        self.assertEqual(None, self.character.evolve())

    def test_type(self):
        self.assertEqual("electric", self.character.getType())

    def test_hasEvolution(self):
        self.assertEqual(True, self.character.isHasEvolution())

    def test_getMainAttackDamage(self):
        self.assertEqual(6, self.character.getMainAttackDamage())

    def test_getSecondAttackDamage(self):
        self.assertEqual(13, self.character.getSecondAttackDamage())

    def test_getHitPoints(self):
        self.assertEqual(100, self.character.getHitPoints())

    def test_getDefenseMultiplier(self):
        self.assertEqual(0.4, self.character.getDefenseMultiplier(), 0.0)
