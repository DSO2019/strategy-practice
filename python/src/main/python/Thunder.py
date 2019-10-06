from Attack import Attack


class Thunder(Attack):

    def __init__(self):
        self.damage = 110

    def performAttack(self) -> str:
        return "Thunder"

    def getDamage(self) -> int:
        return self.damage
