from collections import deque

num = 5
movieList = deque([])
foodCart = deque([])

for i in range(1, num + 1):
    movieToWatch = input(f"Enter movie {i} of {num} movie to watch: ")
    movieList.append(movieToWatch)
for i in range(1, num + 1):
    foodToEat = input(f"Enter snack {i} of {num} snack: ")
    foodCart.append(foodToEat)

print(f"Your movie watchlist is: {list(movieList)}")
print(f"Your food cart is: {list(foodCart)}")

num = len(foodCart)
for i in range(1, num + 1):
    currentFood = input("Press S to eat/drink a snack: ")
    if currentFood.lower() == "s":
        print(f"You ate {foodCart.pop()}. Your food cart now is: {list(foodCart)}")
    if not foodCart:
        print("You have no more snacks. Buy more.")