let raceNumber = Math.floor(Math.random() * 1000)
let registeredEarly = true
let runnerAge = 19

var isAdult = runnerAge > 18
var isYouth = runnerAge < 18

if (isAdult && registeredEarly) 
  raceNumber += 1000
// --- //
if (isAdult && registeredEarly)
  console.log(`Runner #${raceNumber} will run at exactly 9:30 am.`)
else if (isAdult && !registeredEarly) {
  console.log(`Runner #${raceNumber} will run at exactly 11:00 am.`)
} else if (isYouth) {
  console.log(`Runner #${raceNumber} will run at exactly 12:30 am.`)
} else {
  console.log(`Runner #${raceNumber}, please proceed to the registration desk for your schedule.`)
}