from mockito import mock, verify, when
import unittest
from behaviors.attack.ImpactTruenoAttack import ImpactTruenoAttack

class ImpactTruenoAttack_tests(unnitest.TestCase):

    def setUp(self):
        self.attack_obj = ImpactTruenoAttack()
    
    def test_attack(self):
        self.assertEqual("Attacking opponent with Impactrueno causing a damage of 13",self.attack_obj.attack())

    def test_getAttackName(self):
        self.assertEqual("Impactrueno",self.attack_obj.getAttackName())
   
    def test_getAttackDamage(self):
        self.assertEqual(13,self.attack_obj.getAttackDamage())