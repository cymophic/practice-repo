let humanScore = 0;
let computerScore = 0;
let currentRoundNumber = 1;

const generateTarget = () => Math.floor(Math.random() * 9)
const updateScore = roundWinner => roundWinner === 'human' ? humanScore++ : computerScore++
const advanceRound = () => currentRoundNumber++

function compareGuesses(userGuess, computerGuess, numToGuess) {
  const userDifference = Math.abs(userGuess - numToGuess)
  const computerDifference = Math.abs(computerGuess - numToGuess)
  if (userDifference < computerDifference) return true
  else if (userDifference > computerDifference) return false
  else return true
}

console.log(compareGuesses(8, 4, 9))
