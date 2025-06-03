const user = {
  name: "Mosin",
  address: {
    city: "Pune"
  }
};

// Accessing city (Safe)
console.log(user.address?.city); // Output: Pune

// Accessing state (Does not exist, no error)
console.log(user.address?.state); // Output: undefined

// Accessing a nested property that doesn't exist (No crash)
console.log(user.contact?.phone); // Output: undefined

console.log(user.contact.phone);

