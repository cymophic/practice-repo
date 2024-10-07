const prompt = require('prompt-sync')();

console.log("\n========== 1A ==========")
let userAge = prompt("Please enter your age: ")
let userInput = prompt("Please enter a random number: ")

console.log("========== 1B ==========")
compareStatements(userAge, userInput)

console.log("========== 2A ==========")
console.log("Counting to 30")
countToThirty()
console.log("I'm done counting to 30.")

console.log("========== 2B ==========")
console.log("Printing even numbers up to 40.")
printEvenToFourty()
console.log("I'm done printing even numbers.")

console.log("========== 2C ==========")
console.log("Counting backwards from 40 to 10 while printing multiples of 3.")
printMultiplesOfThree()
console.log("I'm done counting backwards.")
console.log("====================\n")

function compareStatements(userAge, userInput) {
    if (userAge >= 25)
        console.log("Age: You're a fully fledged adult!")
    else
        console.log("Age: You're still young, aren't you?")   

    if (userInput < 100)
        console.log("Number: That's quite a small number.")
    else
        console.log("Number: Woah, now that's a big number.")
}

function countToThirty() {
    for (let i = 0; i <= 30; i++)
        console.log(i) 
}

function printEvenToFourty() {
    for (let j = 0; j <= 40; j += 2)
        console.log(j)
}

function printMultiplesOfThree() {
    for (let k = 40; k >= 10; k--)
        if (k % 3 == 0)
            console.log(k)
}
    

