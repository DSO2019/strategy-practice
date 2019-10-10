from Attack import Attack


class BugBuzz(Attack):

    def __init__(self):
        self.damage = 90

    def performAttack(self) -> str:
        return "Bug Buzz"

    def getDamage(self) -> int:
        return self.damage
