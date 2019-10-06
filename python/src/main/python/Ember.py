from Attack import Attack

class Ember(Attack):

    def __init__(self):
        self.damage = 40
    
    def performAttack(self) -> str:
        return "Ember"

    def getDamage(self) -> int:
        return self.damage 