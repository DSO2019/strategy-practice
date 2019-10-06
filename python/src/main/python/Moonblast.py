from Attack import Attack

class Moonblast(Attack):

    def __init__(self):
        self.damage = 95
    
    def performAttack(self) -> str:
        return "Moonblast"

    def getDamage(self) -> int:
        return self.damage 