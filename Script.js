function abcd() {
    var Rohan = "Smart Boy"; // Define the variable first
    var obj = { Rohan }; // Shorthand for { Rohan: Rohan }
    var copyobj = { ...obj };

    console.log("Original value of obj", obj);
    console.log("Copied value of copyobj", copyobj);
}

abcd();
