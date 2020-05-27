/**
 * phase 4
 */

const name = ["E", "L", "E", "N", "A"];
const surname = ["P", "I", "A", "G", "G","I","O",];
const fullName = [...name, " ", ...surname]
const vocal = "aeiouAEIOU";
const num = "0123456789";

let mapLettersRepeated = new Map();

for (let i = 0; i < name.length; i++) {
  lletresRepetides(name[i], mapLettersRepeated);
}

function lletresRepetides(letter, map) {
  if (map.has(letter)) {
    let actualValue = map.get(letter) + 1;
    map.set(letter, actualValue);
  } else {
    map.set(letter, 1);
  }
}

for (var [clave, valor] of mapLettersRepeated.entries()) {
  console.log(clave + " = " + valor);
}

console.log(fullName);