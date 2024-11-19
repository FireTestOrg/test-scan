function calculate() {
    // Code smell: Use of var
    var sum = 0;

    // Bug: Using an undeclared variable
    sum = sum + undeclaredVariable;

    // Code smell: Unused function
    function unusedFunction() {
        console.log("I am not used!");
    }

    return sum;
}

console.log(calculate());
