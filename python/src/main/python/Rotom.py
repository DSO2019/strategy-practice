from PokemonCharacter import *
from Surf import *
from Thunderbolt import *


class Rotom(PokemonCharacter):
    def __init__(self):
        self.HIT_POINTS = 100
        self.DEFENSE_MULTIPLIER = 0.4
        self.surf = Surf()
        self.thuderbolt = Thunderbolt()
        self.setType('electric water')
        self.setName('Rotom')
        self.setMainAttack(self.surf)
        self.setSecondAttack(self.thuderbolt)
        self.setHitPoints(self.HIT_POINTS)
        self.setDeffenseMultiplier(self.DEFENSE_MULTIPLIER)
        self.setMainAttackDamage(self.surf.getAttackDamage())
        self.setSecondAttackDamage(self.thuderbolt.getAttackDamage())

    def evolve(self):
        return None
    
    def defend(self, attack):
        damage = attack * self.getDefenseMultiplier()
        newHP = self.getHitPoints - damage
        defendMessage = 'Defending attack, damage caused is '
        defendMessage += damage
        defendMessage += ' new HP is '
        defendMessage += newHP
        self.setHitPoints(newHitPoints)
        return defendMessage

    def secondAttack(self):
        attackMessage = 'Attacking opponent with '
        attackMessage += self.getSecondAttack()
        attackMessage += ' causing a damage of '
        attackMessage += self.getSecondAttackDamage()
        return attackMessage

    def mainAttack(self):
        attackMessage = 'Attacking opponent with '
        attackMessage += self.getMainAttack()
        attackMessage += ' causing a damage of '
        attackMessage += self.getMainAttackDamageS()
        return attackMessage

    def setNewAttack(self, attack, attackDamage, newAttack):
        if(attack == 1):
            self.setMainAttack(newAttack)
            self.setMainAttackDamage(attackDamage)
        else:
            self.setSecondAttack(newAttack)
            self.setSecondAttackDamage(attackDamage)
