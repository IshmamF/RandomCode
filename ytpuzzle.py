import enchant
import itertools

d = enchant.Dict("en_US")

myLetters = ['w', 't', 't', 'm', 'l', 'a', 'e', 'e', 'e', 's', 'h', 'i', 'b']
potentialWords = []
actualWords = []


for r in range(1, len(myLetters) + 1):
    combinations = list(itertools.combinations(myLetters, r))
    for combo in combinations:
        if d.check(''.join(combo)):
            actualWords.append(''.join(combo))

print(actualWords)