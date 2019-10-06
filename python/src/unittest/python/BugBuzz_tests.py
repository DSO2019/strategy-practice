from mockito import mock, verify, when
import unittest

from BugBuzz import BugBuzz

class BugBuzz_test(unittest.TestCase):

    def setUp(self):
        self.bugBuzz = BugBuzz()
    
    def test_performAttack(self):
        self.assertEqual("Bug Buzz",self.bugBuzz.performAttack())
    
    def test_getDamage(self):
        self.assertEqual(90, self.bugBuzz.getDamage())