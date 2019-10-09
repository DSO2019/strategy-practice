from mockito import mock, verify, when
import unittest
from behaviors.attack.SmallFireAttack import SmallFireAttack


class SmallFireAttack_tests(unnitest.TestCase):

    def setUp(self):
        self.attack_obj = SmallFireAttack()

    def test_attack(self):
        self.assertEqual(
            "Attacking opponent with Small Fire causing a damage of 7",
            self.attack_obj.attack())

    def test_getAttackName(self):
        self.assertEqual("Small Fire", self.attack_obj.getAttackName())

    def test_getAttackDamage(self):
        self.assertEqual(7, self.attack_obj.getAttackDamage())
