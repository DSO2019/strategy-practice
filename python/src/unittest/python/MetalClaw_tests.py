from mockito import mock, verify, when
import unittest

from MetalClaw import MetalClaw

class MetalClaw_test(unittest.TestCase):

    def setUp(self):
        self.metalClaw = MetalClaw()
    
    def test_performAttack(self):
        self.assertEqual("Metal Claw",self.metalClaw.performAttack())
    
    def test_getDamage(self):
        self.assertEqual(50, self.metalClaw.getDamage())