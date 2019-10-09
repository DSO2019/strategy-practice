from mockito import mock, verify, when
import unittest
from behaviors.attack.BigFireAttack import BigFireAttack

class BigFireAttack_tests(unnitest.TestCase):

    def setUp(self):
        self.attack_obj = SmallFireAttack()
    
    def test_attack(self):
        self.assertEqual("Attacking opponent with Big Fire causing a damage of 13",self.attack_obj.attack())

    def test_getAttackName(self):
        self.assertEqual("Big Fire",self.attack_obj.getAttackName())
   
    def test_getAttackDamage(self):
        self.assertEqual(13,self.attack_obj.getAttackDamage())