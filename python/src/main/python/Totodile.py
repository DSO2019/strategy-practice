from PokemonCharacter import *
from attacks.Aquajet import *
from attacks.Hydropump import *

class Totodile(PokemonCharacter):
    def __init__(self):
        self.HIT_POINTS = 100
        self.DEFENSE_MULTIPLIER = 0.5
        self.aquajet = Aquajet()
        self.hydropump = Hydropump()
        self.setType('water')
        self.setName('Totodile')
        self.setHasEvolution(False)
        self.setMainAttack(self.aquajet)
        self.setSecondAttack(self.hydropump)
        self.setHitPoints(self.HIT_POINTS)
        self.setDeffenseMultiplier(self.DEFENSE_MULTIPLIER)
        self.setMainAttackDamage(self.aquajet.getAttackDamage())
        self.setSecondAttackDamage(self.hydropump.getAttackDamage())

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
