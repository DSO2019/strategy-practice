
from mockito import mock, verify, when
import unittest
from behaviors.attack.QuickAttack import QuickAttack


class QuickAttack_tests(unnitest.TestCase):

    def setUp(self):
        self.attack_obj = QuickAttack()

    def test_attack(self):
        self.assertEqual(
            "Attacking opponent with Quick Attack causing a damage of 6",
            self.attack_obj.attack())

    def test_getAttackName(self):
        self.assertEqual("Quick Attack", self.attack_obj.getAttackName())

    def test_getAttackDamage(self):
        self.assertEqual(6, self.attack_obj.getAttackDamage())
