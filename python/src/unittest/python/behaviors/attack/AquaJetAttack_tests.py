from mockito import mock, verify, when
import unittest
from behaviors.attack.AquaJetAttack import AquaJetAttack

class AquatJetAttack_tests(unnitest.TestCase):

    def setUp(self):
        self.attack_obj = AquaJetAttack()
    
    def test_attack(self):
        self.assertEqual("Attacking opponent with Aqua Jet causing a damage of 18",self.attack_obj.attack())

    def test_getAttackName(self):
        self.assertEqual("Aqua Jet",self.attack_obj.getAttackName())
   
    def test_getAttackDamage(self):
        self.assertEqual(18,self.attack_obj.getAttackDamage())