from PokemonCharacter import *
from attacks.Flamethrower import *
from attacks.Fireblast import *


class Cyndaquil(PokemonCharacter):
    def __init__(self):
        self.HIT_POINTS = 100
        self.DEFENSE_MULTIPLIER = 0.4
        self.fireblast = Fireblast()
        self.flamethrower = Flamethrower()
        self.setType('fire')
        self.setName('Cyndaquil')
        self.setHasEvolution(False)
        self.setMainAttack(self.fireblast)
        self.setSecondAttack(self.flamethrower)
        self.setHitPoints(self.HIT_POINTS)
        self.setDeffenseMultiplier(self.DEFENSE_MULTIPLIER)
        self.setMainAttackDamage(self.fireblast.getAttackDamage())
        self.setSecondAttackDamage(self.flamethrower.getAttackDamage())

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
