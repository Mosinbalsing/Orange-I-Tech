function testFunctionScope() {
  var a = 10;
  console.log(a); // accessible here
}
//console.log(a); // Error: a is not defined

if (true) {
  let b = 20;
  const c = 30;
  console.log(b, c); // accessible here
}
console.log(b); // Error: b is not defined
