function howOld(age, year) {
    const currentYear = new Date().getFullYear();

    if (year > currentYear) {
        const calculatedAge = age + (year - currentYear);
        return `You will be ${calculatedAge} in the year ${year}`;
    } else if (year < currentYear - age) {
        const yearsBeforeBirth = currentYear - age - year;
        return `The year ${year} was ${yearsBeforeBirth} years before you were born`;
    } else {
        const calculatedAge = age - (currentYear - year);
        return `You were ${calculatedAge} in the year ${year}`;
    }
}

console.log(howOld(25, 2030));
console.log(howOld(20, 1980));
console.log(howOld(25, 1990));
console.log(howOld(25, 2010));