from AttackBehavior import *


class ImpactruenoBehavior(AttackBehavior):
    attackName = "Impactrueno"
    attackDamage = 15

    def attack(self):
        return "Attacking opponent with " + attackName + \
            " causing a damage of " + attackDamage

    def getAttack():
        return attackName

    def setAttackDamage(newDmg):
        attackDamage = newDmg

    def setAttack(newAttack):
        attackName = newAttack

    def getAttackDamage():
        return attackDamage