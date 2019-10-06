from Attack import Attack

class MetalClaw(Attack):

    def __init__(self):
        self.damage = 50
    
    def performAttack(self) -> str:
        return "Metal Claw"

    def getDamage(self) -> int:
        return self.damage 