function getSleepHours(day) {
    switch (day.toLowerCase()) {
      case 'sunday':
        return 8;
        break
      case 'monday':
        return 8;
        break
      case 'tuesday':
        return 8;
        break
      case 'wednesday':
        return 8;
        break
      case 'thursday':
        return 8;
        break
      case 'friday':
        return 9;
        break
      case 'saturday':
        return 8;
        break
    }
  }
  
  const getActualSleepHours = () => getSleepHours('Sunday') + getSleepHours('Monday') + getSleepHours('Tuesday') + getSleepHours('Wednesday') + getSleepHours('Thursday') + getSleepHours('Friday') + getSleepHours('Saturday')
  
  function getIdealSleepHours() {
    var idealHours = 8
    return idealHours * 7
  }
  
  function calculateSleepDebt() {
    var actualSleepHours = getActualSleepHours()
    var idealSleepHours = getIdealSleepHours()
  
    if (actualSleepHours === idealSleepHours)
      console.log(`Congrats! You got the perfect amount of sleep.`)
    else if (actualSleepHours > idealSleepHours)
      console.log(`Wow! You got more sleep than you needed.`)
    else  
      console.log(`You got less sleep than normal. You should get some rest.`)
  
    console.log('|| ============================================== ||')
    console.log(`Ideal Weekly Sleep: ${idealSleepHours} | Actual Weekly Sleep: ${actualSleepHours}`)
    console.log('|| ============================================== ||')
  }
  
  // --- //
  console.log('|| ============================================== ||')
  var dayToCheck = 'Tuesday'
  var hoursOfSleep = getSleepHours(dayToCheck)
  console.log(`You got ${hoursOfSleep} hours of sleep on ${dayToCheck}.`)
  calculateSleepDebt()
  