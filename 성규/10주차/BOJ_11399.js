const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
let input = fs.readFileSync(filePath).toString().split("\n");

const people = input[0];
const time = input[1]
  .split(" ")
  .map((item) => +item)
  .sort((a, b) => a - b);

let result = 0;
let save = 0;
for (let i = 0; i < people; i++) {
  save += time[i];
  if (save > 0) result += save;
  else result += time[i];
}
console.log(result);
