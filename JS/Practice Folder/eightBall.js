console.log('\n')

// --- //
var userName = ''
userName === '' ? console.log("Hello!") :
                  console.log("Hello, " + userName + "!")

// --- //
var userQuestion = '\"Am I going to get an OJT position?\"'
console.log("Question: " + userQuestion)

// --- //
var randomNumber = Math.floor(Math.random() * 8)
var eightBall = ''
switch (randomNumber) {
  case 1:
    eightBall = "It is certain!"
    break
  case 2:
    eightBall = "It is decidedly so."
    break
  case 3:
    eightBall = "Lol, no."
    break
  case 4:
    eightBall = "Cannot predict now..."
    break
  case 5:
    eightBall = "Do not count on it."
    break
  case 6:
    eightBall = "My sources say no."
    break
  case 7:
    eightBall = "Outlook not so good."
    break
  case 8:
    eightBall = "Signs point to yes."
    break
  default:
    eightBall = "That is hard to answer..."
    break
}

console.log('Eightball says: \"' + eightBall + "\"")
// --- //

console.log('\n')