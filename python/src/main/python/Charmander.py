from PokemonCharacter import *
from attacks.Lanzallamas import *
from attacks.Pirotecnia import *


class Charmander(PokemonCharacter):
    def __init__(self):
        self.HIT_POINTS = 65
        self.DEFENSE_MULTIPLIER = 0.6
        self.lanzallamas = Lanzallamas()
        self.pirotecnia = Pirotecnia()
        self.setType('Fuego')
        self.setName('Charmander')
        self.setHasEvolution(True)
        self.setMainAttack(self.lanzallamas)
        self.setSecondAttack(self.pirotecnia)
        self.setHitPoints(self.HIT_POINTS)
        self.setDeffenseMultiplier(self.DEFENSE_MULTIPLIER)
        self.setMainAttackDamage(self.lanzallamas.getAttackDamage())
        self.setSecondAttackDamage(self.pirotecnia.getAttackDamage())

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
