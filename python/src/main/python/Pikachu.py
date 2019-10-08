from PokemonCharacter import *
from Thunderbolt import *
from Surf import *


class Pikachu(PokemonCharacter):
    def __init__(self):
        self.HIT_POINTS = 100
        self.DEFENSE_MULTIPLIER = 0.4
        self.thunderbolt = Thunderbolt()
        self.surf = Surf()
        self.setType('electric')
        self.setName('Pikachu')
        self.setMainAttack(self.thunderbolt)
        self.setSecondAttack(self.surf)
        self.setHitPoints(self.HIT_POINTS)
        self.setDeffenseMultiplier(self.DEFENSE_MULTIPLIER)
        self.setMainAttackDamage(self.thunderbolt.getAttackDamage())
        self.setSecondAttackDamage(self.surf.getAttackDamage())

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
