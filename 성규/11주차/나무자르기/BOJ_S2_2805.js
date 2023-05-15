const input = require("fs").readFileSync("/dev/stdin").toString().split("\n");
var [N, H] = input.shift().split(" ").map(Number);
var Trees = input.shift().split(" ").map(Number);
var MaxH = Math.max(...Trees);

function binarySearch(H, Trees, min, max) {
  let mid = 0;
  let BestH = 0;

  while (min <= max) {
    let SumWood = 0;
    mid = Math.floor((min + max) / 2);
    Trees.forEach((a) => {
      let rest = a - mid;
      if (rest > 0) SumWood += rest;
    });
    if (SumWood >= H) {
      if (mid > BestH) BestH = mid;
      min = mid + 1;
    } else {
      max = mid - 1;
    }
  }
  return BestH;
}

const answer = binarySearch(H, Trees, 0, MaxH);
console.log(answer);

/**
 * 처음에는 전체적으로 값을 체크하다보니 시간초과 발생해서 이분탐색으로 시간 줄였음
 */
