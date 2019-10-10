import unittest
from Charmander import *


class CharmanderTests(unittest.TestCase):
    def setUp(self):
        self.charmander = Charmander()

    def test_firstAttack(self):
        self.assertEquals("Attacking opponent with ",
            self.charmander.executeMainAttack())

