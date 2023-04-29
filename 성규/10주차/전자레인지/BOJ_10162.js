const fs = require("fs");

const input = fs.readFileSync("/dev/stdin").toString().trim();

const A = 300;

const B = 60;

const C = 10;

let answer = "";

let temp = input;

answer += `${parseInt(temp / A)} `;

temp = temp % A;

answer += `${parseInt(temp / B)} `;

temp = temp % B;

answer += `${parseInt(temp / C)} `;

temp = temp % C;

answer = temp === 0 ? answer : -1;

console.log(answer);
