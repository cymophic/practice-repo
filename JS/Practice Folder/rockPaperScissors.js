function print(text) {
    console.log(text)
  }
  
  const getUserChoice = userInput => {
    choices = "[rock / paper / scissors]"
    userInput.toLowerCase();
    switch (userInput) {
      case 'rock':
        return userInput
        break
      case 'paper':
        return userInput
        break
      case 'scissors':
        return userInput
        break
      default:
        print('Please choose between the following only: ')
        print(choices)
        break
    }
  }
  
  function getComputerChoice() {
    var number = Math.floor(Math.random() * 3)
    switch (number) {
      case 0:
        return 'rock'
        break
      case 1:
        return 'paper'
        break
      case 2:
        return 'scissors'
        break
    }
  }
  
  function determineWinner(userChoice, computerChoice) {
    if (userChoice === computerChoice)
      return 'Game Tied'
  
    switch (userChoice) {
      case 'rock':
        if (computerChoice === 'paper')
          return 'Computer Won'
        else 
          return 'User won'
        break
      case 'paper':
        if (computerChoice === 'scissors')
          return 'Computer Won'
        else 
          return 'User won'
        break
      case 'scissors':
        if (computerChoice === 'rock')
          return 'Computer Won'
        else 
          return 'User Won'
        break
    }
  }
  
  function playGame() {
    var userChoice = getUserChoice('rock')
    var computerChoice = getComputerChoice()
    print("User Choice: " + userChoice)
    print("Computer Choice: " + computerChoice)
    print(determineWinner(userChoice, computerChoice))
  }
  
  playGame()
  
