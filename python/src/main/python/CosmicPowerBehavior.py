from AttackBehavior import *

class CosmicPowerBehavior(AttackBehavior):
    attackName = "Cosmic Power"
    attackDamage = 25
    def attack(self):
        return "Attacking opponent with " + attackName + " causing a damage of " + attackDamage
    def getAttack():
        return attackName
    def setAttackDamage(newDmg):
        attackDamage = newDmg
    def setAttack(newAttack):
        attackName = newAttack
    def getAttackDamage():
        return attackDamage