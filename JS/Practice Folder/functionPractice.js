// Function Declaration
function defaultGreetWorld() {
    return "Hello, World!"
  }
  
// Anonymous Functions 
const anonGreetWorld = function () {
  return "Hello, World!"
}

// Function with Ternary Operators 
const canIVote = (age) => age >= 18 ? true : false
const agreeOrDisagree = (textOne, textTwo) => textOne === textTwo ? "You agree!" : "You disagree!"
  
// Arrow Functions
const arrGreetWorld = () => "Hello, World!"

// --- Test --- //
console.log(defaultGreetWorld())
console.log(anonGreetWorld())
console.log(arrGreetWorld())
console.log(canIVote(18)) 
console.log(agreeOrDisagree("yep", "yep")) 
