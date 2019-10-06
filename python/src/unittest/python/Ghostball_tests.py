from mockito import mock, verify, when
import unittest

from GhostBall import GhostBall

class GhostBall_test(unittest.TestCase):
    def setUp(self):
        self.ghostBall = GhostBall()
    
    def test_performAttack(self):
        self.assertEqual("usa Ghost Ball!",self.ghostBall.performAttack())