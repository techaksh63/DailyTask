arrayOfFruits = [
  {
    "apple": 10,
    "orange": 2,
    "banana": 3,
  },
  {
    "mango": 4,
    "guava": 3,
    "grapes": 9,
  },
  {
    "papaya": 10,
    "apple": 9,
    "orange": 9,
  },
  {
    "orange": 8,
    "mango": 2,
    "grapes": 3,
    "customFruit": 9,
  },
]

output = {}

for fruit_obj in arrayOfFruits:
    for fruit, count in fruit_obj.items():
        if fruit not in output:
            output[fruit] = count
        else:
            output[fruit] += count

print(output)