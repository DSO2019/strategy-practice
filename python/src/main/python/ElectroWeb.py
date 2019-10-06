from Attack import Attack

class ElectroWeb(Attack):

    def __init__(self):
        self.damage = 55
    
    def performAttack(self) -> str:
        return "Electro Web"

    def getDamage(self) -> int:
        return self.damage 