const getCount = (start, visited, house) => {
  const offsetX = [-1, 0, 0, 1];
  const offsetY = [0, -1, 1, 0];
  const getXY = (idx) => [idx % N, Math.floor(idx / N)];
  const getIdx = (x, y) => x + y * N;
  const isValid = (x, y) => x >= 0 && x < N && y >= 0 && y < N;

  const stack = [start];
  const graph = [];
  let count = 0;

  while (stack.length) {
    const node = stack.pop();
    const [x, y] = getXY(node);
    if (!visited[node] && house[y][x] === "1") {
      visited[node] = true; // 방문한 노드는 true로 변경
      graph.push(node);
      count++;
      offsetX.forEach((_, i) => {
        const [dx, dy] = [x + offsetX[i], y + offsetY[i]];
        const newNode = getIdx(dx, dy);
        if (isValid(dx, dy)) {
          stack.push(newNode);
        }
      });
    }
  }
  return count;
};

const solve = (N, house) => {
  const visited = new Array(N * N).fill(false);
  const output = [];
  visited.forEach((v, i) => {
    if (!v) {
      // true는 지나치고 false면 해당과정을 수행
      const count = getCount(i, visited, house);
      if (count > 0) output.push(count); // 카운트가 0보다 클때만 output 배열에 추가
    }
  });
  console.log(output.length);
  console.log(output.sort((a, b) => a - b).join("\n"));
};

const [N, ...input] = require("fs")
  .readFileSync("/dev/stdin")
  .toString()
  .trim()
  .split("\n");
const house = input.map((row) => row.split(""));
solve(N, house);
