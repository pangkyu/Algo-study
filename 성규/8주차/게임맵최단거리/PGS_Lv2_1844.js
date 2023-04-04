function solution(maps) {
  const xLength = maps.length;
  const yLength = maps[0].length;
  const dx = [0, 0, -1, 1];
  const dy = [-1, 1, 0, 0];

  const bfs = () => {
    const queue = [[0, 0, 1]];
    while (queue.length) {
      const [x, y, count] = queue.shift();
      if (x === xLength - 1 && y === yLength - 1) {
        return count;
      }
      if (maps[x][y]) {
        maps[x][y] = 0;
        dx.forEach((dx, i) => {
          const nx = x + dx;
          const ny = y + dy[i];
          if (
            nx >= 0 &&
            nx < xLength &&
            ny >= 0 &&
            ny < yLength &&
            maps[nx][ny]
          ) {
            queue.push([nx, ny, count + 1]);
          }
        });
      }
    }
    return -1;
  };
  return bfs();
}
