const input = require("fs").readFileSync("/dev/stdin").toString();
solution(Number(input));

function solution(input) {
  input = 1000 - input;
  let money = [500, 100, 50, 10, 5, 1];
  let result = 0;

  for (let m of money) {
    result += Math.floor(input / m);
    input = input % m;
  }
  console.log(result);
}
