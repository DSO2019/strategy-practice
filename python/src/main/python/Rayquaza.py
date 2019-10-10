from PokemonCharacter import *
from attacks.Dragonbreath import *
from attacks.Dragonclaw import *

class Rayquaza(PokemonCharacter):
    def __init__(self):
        self.HIT_POINTS = 75
        self.DEFENSE_MULTIPLIER = 0.4
        self.dragonbreath = Dragonbreath()
        self.dragonclaw = Dragonclaw()
        self.setType('dragon')
        self.setName('Rayquaza')
        self.setHasEvolution(False)
        self.setMainAttack(self.dragonbreath)
        self.setSecondAttack(self.dragonclaw)
        self.setHitPoints(self.HIT_POINTS)
        self.setDeffenseMultiplier(self.DEFENSE_MULTIPLIER)
        self.setMainAttackDamage(self.dragonbreath.getAttackDamage())
        self.setSecondAttackDamage(self.dragonclaw.getAttackDamage())

    def evolve(self):
        return None

    def defend(self, attack):
        damage = attack * self.getDefenseMultiplier()
        newHP = self.getHitPoints() - damage
        defendMessage = 'Defending attack, damage caused is '
        defendMessage += str(int(damage))
        defendMessage += ' new HP is '
        defendMessage += str(int(newHP))
        self.setHitPoints(int(newHP))
        return defendMessage

    def performSecondAttack(self):
        attackMessage = 'Attacking opponent with '
        attackMessage += self.getSecondAttack()
        attackMessage += ' causing a damage of '
        attackMessage += str(self.getSecondAttackDamage())
        return attackMessage

    def performMainAttack(self):
        attackMessage = 'Attacking opponent with '
        attackMessage += self.getMainAttack()
        attackMessage += ' causing a damage of '
        attackMessage += str(self.getMainAttackDamage())
        return attackMessage

    def setNewAttack(self, attack, attackDamage, newAttack):
        if(attack == 1):
            self.setMainAttack(newAttack)
            self.setMainAttackDamage(attackDamage)
        else:
            self.setSecondAttack(newAttack)
            self.setSecondAttackDamage(attackDamage)
