// Write a programme to get 2 numbers then print larger number.  

let a = parseFloat(prompt("Enter first number:"));
let b = parseFloat(prompt("Enter second number:"));

if (a > b) {
    console.log("Larger number is:", a);
}
else if (b > a) {
    console.log("Larger number is:", b);
}
else {
    console.log("Both numbers are equal.");
}

