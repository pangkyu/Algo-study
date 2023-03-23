const [[N], ...board] = require("fs")
  .readFileSync("/dev/stdin")
  .toString()
  .trim()
  .split("\n")
  .map((v) => v.split(" ").map(Number));

/*
도착점으로 가는경우 발견 -> 탐색 종료 
*/
const dfs = (x = 0, y = 0) => {
  const dist = board[x][y];

  // 도착한 경우 -> -1이 끝이니까 도착하면 하루하루
  if (dist === -1) {
    return true;
  }

  // 0이 적힌 칸
  if (!dist) {
    return false;
  }

  // 오른쪽으로 이동
  if (x + dist < N) {
    const result = dfs(x + dist, y);
    if (result) {
      return true;
    }
  }

  // 아래쪽으로 이동
  if (y + dist < N) {
    const result = dfs(x, y + dist);
    if (result) {
      return true;
    }
  }

  return false;
};

console.log(dfs() ? "HaruHaru" : "Hing");
