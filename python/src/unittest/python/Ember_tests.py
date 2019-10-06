from mockito import mock, verify, when
import unittest

from Ember import Ember

class Ember_test(unittest.TestCase):

    def setUp(self):
        self.ember = Ember()
    
    def test_performAttack(self):
        self.assertEqual("usa Ember!",self.ember.performAttack())